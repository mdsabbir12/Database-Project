import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Newstudent extends JFrame implements ActionListener {
    private Container c;
    private  JButton home ,nstd,hfee,dcpln,fmenu,logout;
    private ImageIcon icon,img;
    private JLabel image,headline,headline1,welcome;
    private JPanel panel,panel1,panel3;
    private JLabel title,fname,lname,dept,Fathername,Mothername,passward,id;
    private JLabel nation,religion,adress,hallno,phone,email,date;
    private JTextField nationf,raligionf,adressf,hallnof,phonef,emailf;
    private JTextField pass,firname,lasname,deptname,maname,fathname,idf,datef;
    private JButton login;

    private Font f1,f2,f3,f4,f5,f6;
   Newstudent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("New Student");
        body();
    }

    public void body(){

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        panel=new JPanel();
        panel.setBounds(0,0,1500,110);
        panel.setBackground(new Color(221,255,255));
        panel.setLayout(null);
        c.add(panel);

        panel1=new JPanel();
        panel1.setBounds(20,130,200,550);
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        c.add(panel1);




        f1=new Font("Arial",Font.PLAIN,18);
        f2=new Font("Arial",Font.PLAIN+Font.BOLD,18);
        f3=new Font("Arial",Font.BOLD+Font.ITALIC,32);
        f4=new Font("Arial",Font.ITALIC,34);
        f5=new Font("Arial",Font.ITALIC,34);
        f6=new Font("Arial",Font.PLAIN,30);

        icon=new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img=new ImageIcon("gub.png");
        image=new JLabel(img);
        image.setBounds(100,0,100,100);
        panel.add(image);

        headline=new JLabel();
        headline.setText("Green");
        headline.setBounds(240,35,100,30);
        headline.setFont(f3);
        headline.setForeground(new Color(6,161,11));
        panel.add(headline);

        headline1=new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(350,28,400,50);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0,204,204));
        panel.add(headline1);


        panel3=new JPanel();
        panel3.setBounds(270,130,1100,600);
        panel3.setBackground(Color.pink);
        panel3.setLayout(null);
        c.add(panel3);

        title=new JLabel();
        title.setBounds(450,0,220,100);
        title.setText("New Student");
        title.setFont(f6);
        panel3.add(title);


        fname=new JLabel();
        fname.setBounds(60,75,125,75);
        fname.setText("First Name");
        fname.setFont(f2);
        panel3.add(fname);

        lname=new JLabel();
        lname.setBounds(60,140,125,75);
        lname.setText("Last Name");
        lname.setFont(f2);
        panel3.add( lname);

        dept=new JLabel();
        dept.setText("Dept. Name");
        dept.setBounds(60,220,100,50);
        dept.setFont(f2);
        panel3.add(dept);

        id=new JLabel();
        id.setBounds(60,275,125,75);
        id.setText("Id");
        id.setFont(f2);
        panel3.add( id);

        Fathername=new JLabel();
        Fathername.setBounds(60,333,125,75);
        Fathername.setText("Father's Name");
        Fathername.setFont(f2);
        panel3.add(Fathername);

        Mothername=new JLabel();
        Mothername.setText("Mother's Name");
        Mothername.setBounds(60,415,150,50);
        Mothername.setFont(f2);
        panel3.add(Mothername);

        date=new JLabel();
        date.setText("Entry Date");
        date.setBounds(60,480,150,50);
        date.setFont(f2);
        panel3.add(date);

        firname=new JTextField();
        firname.setText("");
        firname.setBounds(210,95,290,35);
        firname.setToolTipText("Enter Your First Name");
        firname.setBackground(Color.white);
        firname.setFont(f1);
        panel3.add(firname);

        lasname=new JTextField();
        lasname.setText("");
        lasname.setBounds(210,160,290,35);
        lasname.setToolTipText("Enter Your Last Name");
        lasname.setBackground(Color.white);
        lasname.setFont(f1);
        panel3.add(lasname);

        deptname=new JTextField();
        deptname.setText("");
        deptname.setBounds(210,225,290,35);
        deptname.setBackground(Color.white);
        deptname.setToolTipText("Enter your Dept.");
        deptname.setFont(f2);
        panel3.add(deptname);


        idf=new JTextField();
        idf.setText("");
        idf.setBounds(210,290,290,35);
        idf.setBackground(Color.white);
        idf.setToolTipText("Enter Your Id");
        idf.setFont(f2);
        panel3.add(idf);


        fathname=new JTextField();
        fathname.setText("");
        fathname.setBounds(210,350,290,35);
        fathname.setToolTipText("Enter Your Father's Name");
        fathname.setBackground(Color.white);
        fathname.setFont(f1);
        panel3.add(fathname);

        maname=new JTextField();
        maname.setText("");
        maname.setBounds(210,420,290,35);
        maname.setToolTipText("Enter Your Mother's Name");
        maname.setBackground(Color.white);
        maname.setFont(f1);
        panel3.add(maname);

        datef=new JTextField();
        datef.setText("");
        datef.setBounds(210,485,290,35);
        datef.setToolTipText("Enter Entry Date");
        datef.setBackground(Color.white);
        datef.setFont(f1);
        panel3.add(datef);



        //second part of panel 3
        nation=new JLabel();
        nation.setBounds(620,75,125,75);
        nation.setText("Nationality");
        nation.setFont(f2);
        panel3.add(nation);

        religion=new JLabel();
        religion.setBounds(620,140,125,75);
        religion.setText("Religion");
        religion.setFont(f2);
        panel3.add( religion);

        adress=new JLabel();
        adress.setText("Address");
        adress.setBounds(620,220,100,50);
        adress.setFont(f2);
        panel3.add(adress);

        hallno=new JLabel();
        hallno.setBounds(620,275,125,75);
        hallno.setText("Hostel No.");
        hallno.setFont(f2);
        panel3.add(hallno);

        phone=new JLabel();
        phone.setBounds(620,333,125,75);
        phone.setText("Phone");
        phone.setFont(f2);
        panel3.add(phone);

        email=new JLabel();
        email.setText("Email");
        email.setBounds(620,415,150,50);
        email.setFont(f2);
        panel3.add(email);

        passward=new JLabel();
        passward.setText("Password");
        passward.setBounds(620,480,150,50);
        passward.setFont(f2);
        panel3.add(passward);


        nationf=new JTextField();
        nationf.setText("");
        nationf.setBounds(750,95,290,35);
        nationf.setToolTipText("Enter Your Nationality");
        nationf.setBackground(Color.white);
        nationf.setFont(f1);
        panel3.add(nationf);

        raligionf=new JTextField();
        raligionf.setText("");
        raligionf.setBounds(750,160,290,35);
        raligionf.setToolTipText("Enter Your Religion");
        raligionf.setBackground(Color.white);
        raligionf.setFont(f1);
        panel3.add(raligionf);

        adressf=new JTextField();
        adressf.setText("");
        adressf.setBounds(750,225,290,35);
        adressf.setBackground(Color.white);
        adressf.setToolTipText("Enter your Dept.");
        adressf.setFont(f2);
        panel3.add(adressf);


        hallnof=new JTextField();
        hallnof.setText("");
        hallnof.setBounds(750,290,290,35);
        hallnof.setBackground(Color.white);
        hallnof.setToolTipText("Enter Your Hostel Number");
        hallnof.setFont(f2);
        panel3.add(hallnof);


        phonef=new JTextField();
        phonef.setText("");
        phonef.setBounds(750,350,290,35);
        phonef.setToolTipText("Enter Your Phone Number");
        phonef.setBackground(Color.white);
        phonef.setFont(f2);
        panel3.add(phonef);

        emailf=new JTextField();
        emailf.setText("");
        emailf.setBounds(750,420,290,35);
        emailf.setToolTipText("Enter Your Email");
        emailf.setBackground(Color.white);
        emailf.setFont(f1);
        panel3.add(emailf);

        pass=new JPasswordField();
        pass.setText("");
        pass.setBounds(750,485,290,35);
        pass.setToolTipText("Enter Your Password");
        pass.setBackground(Color.white);
        pass.setFont(f1);
        panel3.add(pass);


        login=new JButton();
        login.setText("Submit");
        login.setBounds(350,550,400,40);
        login.setForeground(new Color(0,153,76));
        //login.setForeground(Color.WHITE);
        login.setFont(f2);
        panel3.add(login);



        JButton home =new JButton();
        home.setText("Home Page");
        home.setBounds(15,20,150,40);
        home.setForeground(new Color(0,153,76));
        //home.setForeground(Color.WHITE);
        home.setFont(f2);
        panel1.add(home);


        JButton nstd =new JButton();
        nstd.setText("New Student");
        nstd.setBounds(15,80,150,40);
        nstd.setForeground(new Color(0,153,76));
        //nstd.setForeground(Color.WHITE);
        nstd.setFont(f2);
        panel1.add(nstd);

        JButton hfee =new JButton();
        hfee.setText("Hostel Fee");
        hfee.setBounds(15,140,150,40);
        hfee.setForeground(new Color(0,153,76));
        //hfee.setForeground(Color.WHITE);
        hfee.setFont(f2);
        panel1.add(hfee);


        logout=new JButton();
        logout.setText("Log Out");
        logout.setBounds(1200,35,100,40);
        logout.setFont(f2);
       // logout.setForeground(Color.WHITE);
        logout.setForeground(new Color(0,153,76));
        panel.add(logout);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Homeframe frame1 =new Homeframe();
                frame1.setVisible(true);
            }
        });
        nstd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Newstudent frame2 =new Newstudent();
                frame2.setVisible(true);
            }
        });

        hfee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Hostelfee frame5 =new Hostelfee();
                frame5.setVisible(true);
            }
        });

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                hostelportal frame=new hostelportal();
                frame.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newstudentDb n=new newstudentDb();
                String fn =firname.getText();
                String ln=lasname.getText();
                String de= deptname.getText();
                int Id= Integer.parseInt(idf.getText());
                String fan=fathname.getText();
                String ma=maname.getText();
                String nationl =nationf.getText();
                String reli=raligionf.getText();
                String adss= adressf.getText();
                int hosno= Integer.parseInt(hallnof.getText());
                int ph= Integer.parseInt(phonef.getText());
                String em=emailf.getText();
                String enty=datef.getText();
                String pas=pass.getText();

                try {
                    n.conect(fn,ln,de,Id,fan,ma,nationl,reli,adss,hosno,ph,em,enty,pas);
                    JOptionPane.showMessageDialog(null,"Added Successfully");
                    setVisible(false);
                    new Newstudent().setVisible(true);

                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null,"fileException");
                }
            }
        });



    }


    public static void main(String[] args) {
        Newstudent frame2 =new Newstudent();
        frame2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}