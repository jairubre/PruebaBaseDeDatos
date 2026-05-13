import java.sql.*;

public  class Conexionbd {
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection conectar(String nombrebd) throws SQLException{
        return DriverManager.getConnection(URL+nombrebd,USER,PASS);
    }
}
