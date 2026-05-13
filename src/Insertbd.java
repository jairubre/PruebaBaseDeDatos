import java.sql.*;

public class Insertbd {
    public static void main(String[] args) {
        try {
            Connection conexion = Conexionbd.conectar("agenda");
            String consulta = "Insert into usuarios (nombre, Email, telefono) values (?,?,?)";
            PreparedStatement instruccion = conexion.prepareStatement(consulta);
            instruccion.setString(1, "Antonio");
            instruccion.setString(2, "Antonio@gmail.com");
            instruccion.setString(3, "232441642");
            int filasInsertadas =instruccion.executeUpdate();
            if(filasInsertadas >0){
                System.out.println("Filas insertadas "+filasInsertadas);
            }else{
                System.out.println("No se ha insertado ninguna fila");
            }
            
        } catch (SQLException e) {
                System.out.println(e);
        }
    }
}
