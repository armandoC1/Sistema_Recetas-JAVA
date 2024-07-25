
package accesoadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComunDB {
    //CONEXION
    private  static String cadenaConexion = "jdbc:mysql://localhost:3306/GestionRecetas?user=root & password=User123$";

    public static Connection obtenerConnection()throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection connection = DriverManager.getConnection(cadenaConexion);
        return connection;
    }
    public static PreparedStatement crearPreparedStatement(Connection connection, String sql) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        return preparedStatement;
    }

    //Obtener y copiar los datos de la tabla-----------------
    public static ResultSet resultSet(PreparedStatement preparedStatement) throws SQLException{
        ResultSet resultSet = preparedStatement.executeQuery();
        return  resultSet;
    }
}
