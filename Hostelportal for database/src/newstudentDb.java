import java.sql.*;

public class newstudentDb {
    private Connection con;
    void conect(String a, String b, String c, int d, String e, String f, String g, String h, String i, int j, int k, String l, String m, String o) throws ClassNotFoundException {
        String us = "root";
        String ps = "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Hostelportal", us, ps);

            PreparedStatement pst1 = con.prepareStatement("INSERT into New_student_info(First_Name,Last_Name,Dept,Id,Father_Name,Mother_Name,Nationality,Religion,Adress,Hostel_No,Phone_number,email,Entry_date,passward1) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst1.setString(1, a);
            pst1.setString(2, b);
            pst1.setString(3, c);
            pst1.setInt(4, d);
            pst1.setString(5, e);
            pst1.setString(6, f);
            pst1.setString(7, g);
            pst1.setString(8, h);
            pst1.setString(9,i);
            pst1.setInt(10, j);
            pst1.setInt(11, k);
            pst1.setString(12, l);
            pst1.setString(13, m);
            pst1.setString(14, o);


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



