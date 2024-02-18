import java.sql.*;

public class HostelfeeDB {
    private Connection con;
    void conect(int a, int b, String c, String d) throws ClassNotFoundException {
        String us = "root";
        String ps = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Hostelportal", us, ps);

            PreparedStatement pst1 = con.prepareStatement("INSERT into Hostel_fee(Id,ammount,Entry_date,Month) values(?,?,?,?)");
            pst1.setInt(1, a);
            pst1.setInt(2, b);
            pst1.setString(3, c);
            pst1.setString(4, d);

            int r = pst1.executeUpdate();
            if (r == 1) {
                System.out.println("Insert success");
            } else {
                System.out.println("Failed");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(); // Printing stack trace for debugging
            throw new RuntimeException(ex);
        } finally {
            try {
                if (con != null) {
                    con.close(); // Close the connection in the finally block
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

}
