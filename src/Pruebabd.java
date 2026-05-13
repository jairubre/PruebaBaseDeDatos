import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pruebabd {
    public static void main(String[] args) throws Exception {
        // definimos la url de la base de datos, mi direccin y mi nombre de la base de
        // datos
        final String URL = "jdbc:mysql://localhost/Agenda";
        // para conectarse a la base de datos debemos

        // def usuario contraseña
        final String USER = "root";
        final String PASS = "";
        try {
            // 1) crear conexion a la base de datos.
            Connection conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("conexion existosa");
            String consulta = "SELECT id,nombre FROM usuarios";
            Statement instruccion = conexion.createStatement();
            ResultSet resultado = instruccion.executeQuery(consulta);
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                System.out.println(id + " " + nombre);
            }
            System.out.println("*********************************************");

            String consulta2 = "SELECT * FROM usuarios WHERE nombre LIKE 'J%'";

            ResultSet resultado2 = instruccion.executeQuery(consulta2);

            while (resultado2.next()) {
                int id = resultado2.getInt("id");
                String nombre = resultado2.getString("nombre");
                System.out.println(id + " " + nombre);
            }
           

        } catch (SQLException e) {
            System.out.println("Error al conectar a la abase de datos" + e.getMessage());
            e.printStackTrace();
        }

    }
}
