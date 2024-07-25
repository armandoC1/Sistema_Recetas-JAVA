
package accesoadatos;

import entidaddenegocio.Recetas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RecetasDAL {
    // método que muestra todos los registros de la tabla
    public static ArrayList<Recetas> obtenerTodos() throws SQLException {
        ArrayList<Recetas> lista = new ArrayList<>();
        Recetas recetas;
        try {
            String sql = "SELECT Id, Paciente, Medico, Medicamentos, Fecha_Emision, Indicaciones FROM Recetas";
            Connection conexion = ComunDB.obtenerConnection();
            PreparedStatement ps = ComunDB.crearPreparedStatement(conexion, sql);
            ResultSet rs = ComunDB.resultSet(ps);
            while (rs.next()) {
                recetas = new Recetas(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lista.add(recetas);
            }
            conexion.close();
            ps.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    // método que permite guardar un nuevo registro
    public static int guardar(Recetas recetas) throws SQLException{
        int result = 0;
        try {
            String sql = "INSERT INTO Recetas(Paciente, Medico, Medicamentos, Fecha_Emision, Indicaciones) VALUES(?, ?, ?, ?, ?)";
            Connection conexion = ComunDB.obtenerConnection();
            PreparedStatement ps = ComunDB.crearPreparedStatement(conexion, sql);
            ps.setString(1, recetas.getPaciente());
            ps.setString(2, recetas.getMedico());
            ps.setString(3, recetas.getMedicamentos());
            ps.setString(4, recetas.getFecha_emision());
            ps.setString(5, recetas.getIndicaciones());
            result = ps.executeUpdate();
            conexion.close();
            ps.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    // método que permite modificar un registro existente
    public static int modificar(Recetas recetas) throws SQLException{
        int result = 0;
        try {
            String sql = "UPDATE Recetas SET Paciente = ?,  Medico = ?, Medicamentos = ?, Fecha_Emision = ?, Indicaciones = ? WHERE Id = ?";
            Connection conexion = ComunDB.obtenerConnection();
            PreparedStatement ps = ComunDB.crearPreparedStatement(conexion, sql);
            ps.setString(1, recetas.getPaciente());
            ps.setString(2, recetas.getMedico());
            ps.setString(3, recetas.getMedicamentos());
            ps.setString(4, recetas.getFecha_emision());
            ps.setString(5,recetas.getIndicaciones());
            ps.setInt(6, recetas.getId());
            result = ps.executeUpdate();
            conexion.close();
            ps.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }

    // método que permite eliminar un registro existente
    public static int eliminar(Recetas recetas) throws SQLException{
        int result = 0;
        try {
            String sql = "DELETE FROM Recetas WHERE Id = ?";
            Connection conexion = ComunDB.obtenerConnection();
            PreparedStatement ps = ComunDB.crearPreparedStatement(conexion, sql);
            ps.setInt(1, recetas.getId());
            result = ps.executeUpdate();
            conexion.close();
            ps.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    // método para consultar mediante criterios
    public static ArrayList<Recetas> obtenerDatosFiltrados(Recetas recetas) throws SQLException{
        ArrayList<Recetas> lista = new ArrayList<>();
        Recetas est;
        try{
            String sql = "SELECT id, paciente, medico, medicamentos, fecha_emision, indicaciones FROM Recetas WHERE id = ? or paciente like'%" +
                    recetas.getPaciente() + "%' or medico like'%" + recetas.getMedico() + "%'";
             

            Connection connection = ComunDB.obtenerConnection();
            PreparedStatement ps = ComunDB.crearPreparedStatement(connection, sql);
            ps.setInt(1, recetas.getId());
            

            ResultSet rs = ComunDB.resultSet(ps);
            while (rs.next()){
                est = new Recetas(  rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lista.add(est);
            }
            connection.close();
            try{
                ps.close();
                rs.close();
            }catch (Exception ignored){}
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }
}
