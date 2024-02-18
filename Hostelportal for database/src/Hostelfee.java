import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class Hostelfee extends JFrame {
    private Container c;
    private    JButton home ,nstd,hfee,dcpln,fmenu,logout,login;
    private ImageIcon icon,img;
    private JLabel image,headline,headline1,monthl,title,username,id,passward,datel;
    private JPanel panel,panel1,panel3;
    private JTextField idf,pass,uname,amount,datef,monthf;

    private Font f1,f2,f3,f4,f5,f6;
    Hostelfee(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("Hostel Fee");
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
        panel3.setBounds(430,170,500,500);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        c.add(panel3);

        title=new JLabel();
        title.setBounds(190,15,150,100);
        title.setText("Pay Bill");
        title.setFont(f6);
        panel3.add(title);



        id=new JLabel();
        id.setBounds(40,80,75,75);
        id.setText("Id");
        id.setFont(f2);
        panel3.add( id);

        passward=new JLabel();
        passward.setText("Amount");
        passward.setBounds(40,165,100,50);
        passward.setFont(f2);
        panel3.add(passward);

        datel=new JLabel();
        datel.setText("Date");
        datel.setBounds(40,230,100,50);
        datel.setFont(f2);
        panel3.add(datel);

        monthl=new JLabel();
        monthl.setText("Month");
        monthl.setBounds(40,305,100,50);
        monthl.setFont(f2);
        panel3.add(monthl);

        idf=new JTextField();
        idf.setText("");
        idf.setBounds(150,100,290,35);
        idf.setToolTipText("Enter Your Id");
        idf.setBackground(new Color(255,255,153));
        idf.setFont(f1);
        panel3.add(idf);

        amount=new JTextField();
        amount.setText("");
        amount.setBounds(150,170,290,35);
        amount.setBackground(new Color(255,255,153));
        amount.setToolTipText("Enter your Amount");
        amount.setFont(f2);
        panel3.add(amount);

        datef=new JTextField();
        datef.setText("");
        datef.setBounds(150,240,290,35);
        datef.setBackground(new Color(255,255,153));
        datef.setToolTipText("Enter date");
        datef.setFont(f2);
        panel3.add(datef);



        monthf=new JTextField();
        monthf.setText("");
        monthf.setBounds(150,310,290,35);
        monthf.setBackground(new Color(255,255,153));
        monthf.setToolTipText("enter Month");
        monthf.setFont(f2);
        panel3.add(monthf);




        login=new JButton();
        login.setText("Submit");
        login.setBounds(40,380,400,40);
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
                Panel frame=new Panel();
                frame.setVisible(true);
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HostelfeeDB n=new HostelfeeDB();
                int Id= Integer.parseInt(idf.getText());
                int amnt= Integer.parseInt(amount.getText());

                String dt=datef.getText();
                String mn=monthf.getText();

                try {
                    n.conect(Id,amnt,dt,mn);
                    JOptionPane.showMessageDialog(null,"Paid Successfully");
                    setVisible(false);
                    new Hostelfee().setVisible(true);

                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null,"fileException");
                }
            }
        });


    }


    public static void main(String[] args) {
        Hostelfee frame5 =new Hostelfee();
        frame5.setVisible(true);

    }
}
