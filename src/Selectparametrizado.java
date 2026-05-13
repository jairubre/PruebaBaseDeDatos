import java.sql.*;

public class Selectparametrizado {

    public static void main(String[] args) {
        try {
            Connection conex = Conexionbd.conectar("agenda");
            String consulString = "select * from usuarios where nombre = ? or nombre = ?";
            PreparedStatement instruccion = conex.prepareStatement(consulString);
            instruccion.setString(1, "Jaime");
            instruccion.setString(2, "juan");
            //Devuelve el resultado de la consulta
            ResultSet resultado = instruccion.executeQuery();
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                System.out.println(id + " " + nombre);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
