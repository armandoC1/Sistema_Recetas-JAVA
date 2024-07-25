
package logicadenegocios;

import accesoadatos.RecetasDAL;
import entidaddenegocio.Recetas;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecetasBL {
      public int guardar(Recetas recetas) throws SQLException {
        return RecetasDAL.guardar(recetas);
    }

    public  int modificar(Recetas recetas) throws SQLException{
        return  RecetasDAL.modificar(recetas);
    }

    public int eliminar (Recetas recetas) throws SQLException{
        return  RecetasDAL.eliminar(recetas );
    }

    public ArrayList<Recetas> obtenerTodos() throws SQLException{
        return RecetasDAL.obtenerTodos();
    }

    public ArrayList<Recetas> obtenerDatosFiltrados(Recetas recetas) throws SQLException{
        return  RecetasDAL.obtenerDatosFiltrados(recetas);
    }
    }

