import java.sql.*;

public class adminDB {
    private ResultSet resul, result1;
     Connection con;


    void conect() throws ClassNotFoundException {
        String us="root";
        String ps="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/Hostelportal",us,ps);




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
