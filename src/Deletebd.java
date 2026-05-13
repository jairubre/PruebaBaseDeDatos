import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletebd {
    public static void main(String[] args) {
        try {
            Connection conex = Conexionbd.conectar("agenda");
            String consulta = "delete from usuarios where nombre = ?";
            PreparedStatement instruccion = conex.prepareStatement(consulta);
            instruccion.setString(1, "Alez");
            int filasInsertadas = instruccion.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Filas Borradas " + filasInsertadas);
            } else {
                System.out.println("No se ha borrado ninguna fila");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
