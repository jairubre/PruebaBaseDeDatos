import java.sql.*;

public class Upadatebd {
    public static void main(String[] args) {
        try {
            Connection conex = Conexionbd.conectar("agenda");
            String consulta = "Update usuarios set email =? where nombre=?";
            PreparedStatement instruccion = conex.prepareStatement(consulta);
            instruccion.setString(1, "jaime@gmail.com");
            instruccion.setString(2, "Jaime");
            int filascambiadas = instruccion.executeUpdate();
            if (filascambiadas > 0) {
                System.out.println("Filas Borradas " + filascambiadas);
            } else {
                System.out.println("No se ha borrado ninguna fila");
            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
