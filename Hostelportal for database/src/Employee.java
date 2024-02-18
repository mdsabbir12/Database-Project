import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee extends JFrame implements ActionListener {
    private Container c;
    int flag = 0;
    private JTextArea tr, tr1;
    private JButton home, nstd, hfee, dcpln, fmenu, logout;
    private ImageIcon icon, img;
    private JLabel image, headline, headline1, welcome;
    private JPanel panel, panel1, panel3, panel4;
    private JLabel title, username, passward, id, text1, text2;
    private JTextField pass, uname, idf;
    private JButton login;

    private Font f1, f2, f3, f4, f5, f6;

    Employee() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("Employee");
        body();
    }

    public void body() {

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        panel = new JPanel();
        panel.setBounds(0, 0, 1500, 110);
        panel.setBackground(new Color(221, 255, 255));
        panel.setLayout(null);
        c.add(panel);

        panel1 = new JPanel();
        panel1.setBounds(20, 130, 200, 550);
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        c.add(panel1);


        f1 = new Font("Arial", Font.PLAIN, 18);
        f2 = new Font("Arial", Font.PLAIN + Font.BOLD, 18);
        f3 = new Font("Arial", Font.BOLD + Font.ITALIC, 32);
        f4 = new Font("Arial", Font.ITALIC, 34);
        f5 = new Font("Arial", Font.ITALIC, 34);
        f6 = new Font("Arial", Font.PLAIN, 30);

        icon = new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img = new ImageIcon("gub.png");
        image = new JLabel(img);
        image.setBounds(100, 0, 100, 100);
        panel.add(image);

        headline = new JLabel();
        headline.setText("Green");
        headline.setBounds(240, 35, 100, 30);
        headline.setFont(f3);
        headline.setForeground(new Color(6, 161, 11));
        panel.add(headline);

        headline1 = new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(350, 35, 400, 30);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0, 204, 204));
        panel.add(headline1);


        panel3 = new JPanel();
        panel3.setBounds(230, 130, 1200, 600);
        panel3.setBackground(Color.pink);
        panel3.setLayout(null);
        c.add(panel3);

        title = new JLabel();
        title.setBounds(70, 15, 240, 100);
        title.setText("Search Employee");
        title.setFont(f6);
        panel3.add(title);


        id = new JLabel();
        id.setBounds(40, 80, 75, 75);
        id.setText("Em. Id");
        id.setFont(f2);
        panel3.add(id);


        text1 = new JLabel();
        text1.setBounds(690, 10, 150, 50);
        text1.setText("Employee Info");
        text1.setForeground(Color.black);
        text1.setFont(f2);
        panel3.add(text1);

        tr = new JTextArea();
        tr.setBounds(350, 60, 810, 500);
        tr.setLineWrap(true);
        tr.setWrapStyleWord(true);
        tr.setBackground(Color.white);
        panel3.add(tr);


        idf = new JTextField();
        idf.setText("");
        idf.setBounds(100, 100, 200, 35);
        idf.setToolTipText("Enter Employee ID");
        idf.setBackground(new Color(255, 255, 153));
        idf.setFont(f1);
        panel3.add(idf);


        login = new JButton();
        login.setText("Submit");
        login.setBounds(100, 150, 100, 40);
        login.setForeground(new Color(0, 153, 76));
        //login.setForeground(Color.WHITE);
        login.setFont(f2);
        panel3.add(login);


        JButton dcpln = new JButton();
        dcpln.setText("Employee");
        dcpln.setBounds(15, 200, 170, 40);
        dcpln.setForeground(new Color(0, 153, 76));
        //dcpln.setForeground(Color.WHITE);
        dcpln.setFont(f2);
        panel1.add(dcpln);


        JButton fmenu = new JButton();
        fmenu.setText("Student Info");
        fmenu.setBounds(15, 260, 170, 40);
        fmenu.setForeground(new Color(0, 153, 76));
        //round(Color.GREEN);
        fmenu.setFont(f2);
        panel1.add(fmenu);

        logout = new JButton();
        logout.setText("Log Out");
        logout.setBounds(1200, 35, 100, 40);
        logout.setFont(f2);
        logout.setForeground(Color.WHITE);
        logout.setForeground(new Color(0, 153, 76));
        panel.add(logout);




        dcpln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Employee frame2 = new Employee();
                frame2.setVisible(true);
            }
        });
        fmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Admin frame2 = new Admin();
                frame2.setVisible(true);
            }
        });





        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Panel frame = new Panel();
                frame.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int Id = Integer.parseInt(idf.getText());

                adminDB a=new adminDB();
                try {
                    a.conect();
                    PreparedStatement ps=a.con.prepareStatement("SELECT *from employee where Em_Id=?");
                    ps.setInt(1,Id);
                    ResultSet rs=ps.executeQuery();
                    rs.next();
                    String fn=rs.getString("Name");
                    String la=rs.getString("Em_Id");
                    String dp=rs.getString("work_type");
                    String ent=rs.getString("Entry_date");
                    String sal=rs.getString("sallary");
                    String add=rs.getString("address");

                    tr.append("\n     First Name-------Em Id--------Work type-------Entry Date-------sallary----------Address\n\n");

                    tr.append("       "+fn+"                 "+la+"                     "+dp+"                "+ent+"            "+sal+"            "+add);



                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }



        });

    }


    public static void main(String[] args) {
        Employee frame2 = new Employee();
        frame2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
