
import accesoadatos.RecetasDAL;
import entidaddenegocio.Recetas;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RecetasDALTest {
    @Test
    public void guardarTest() throws SQLException {
        Recetas recetas = new Recetas();
        recetas.setPaciente("Armando Juarez");
        recetas.setMedico("Juan Armando");
        recetas.setMedicamentos("Acetaminofen");
        recetas.setFecha_emision("03/06/2024");
        recetas.setIndicaciones("Tomar una cada 1 horas ");

        int esperado = 1;
        int actual = RecetasDAL.guardar(recetas);
        Assertions.assertEquals(esperado, actual);
    }
    //revisar 
    @Test
    public void obtenerTodosTest() throws SQLException{
        int esperado = 1;
        int actual = RecetasDAL.obtenerTodos().size();
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void modificarTest() throws SQLException {
        Recetas recetas = new Recetas();
        recetas.setId(1);
        recetas.setPaciente("Pedro Juarez ");
        recetas.setMedico("Juan Armanda");
        recetas.setMedicamentos("Paracetamol");
        recetas.setFecha_emision("03/06/2024");
        recetas.setIndicaciones("Tomar de 6 a 8 horas ");

        int esperado = 1;
        int actual = RecetasDAL.modificar(recetas);
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void eliminarTest() throws SQLException {
        Recetas recetas = new Recetas();
        recetas.setId(1);

        int esperado = 1;
        int actual = RecetasDAL.eliminar(recetas);
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void obtenerDatosFiltradosTest() throws SQLException{
        Recetas recetas = new Recetas();
        recetas.setPaciente("Armando Juarez");
        recetas.setId(2);
        recetas.setMedico("");

        int actual = RecetasDAL.obtenerDatosFiltrados(recetas).size();
        Assertions.assertNotEquals(0, actual);
    }
}
