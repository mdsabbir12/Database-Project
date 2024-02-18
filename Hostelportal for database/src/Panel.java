import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame implements ActionListener {
    private Container c;
    private ImageIcon icon, img;
    private JLabel image, headline, headline1, title;
    private JTextField uname;
    private JPasswordField pass;
    private Font f1, f2, f3, f4, f5;
    private JPanel panel;
    private JButton admin, user;

    Panel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("Panel");
        body();
        setVisible(true); // Set the frame visible here
    }

    public void body() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        f1 = new Font("Arial", Font.PLAIN, 18);
        f2 = new Font("Arial", Font.BOLD, 20);
        f3 = new Font("Arial", Font.BOLD + Font.ITALIC, 28);
        f4 = new Font("Arial", Font.ITALIC, 34);
        f5 = new Font("Arial", Font.ITALIC, 34);

        icon = new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img = new ImageIcon("Untitled(1).png");
        image = new JLabel(img);
        image.setBounds(400, 40, 100, 100);
        c.add(image);

        headline = new JLabel();
        headline.setText("Green");
        headline.setBounds(520, 80, 90, 30);
        headline.setFont(f3);
        headline.setForeground(new Color(0, 153, 76));
        c.add(headline);

        headline1 = new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(620, 80, 340, 30);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0, 204, 204));
        c.add(headline1);

        panel = new JPanel();
        panel.setBounds(430, 170, 500, 350);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        c.add(panel);

        title = new JLabel();
        title.setBounds(150, 10, 200, 100); // Adjusted position and size
        title.setText("Choice One");
        title.setFont(f4);
        panel.add(title);

        admin = new JButton();
        admin.setText("Admin Login");
        admin.setBounds(40, 150, 400, 40); // Adjusted position
        admin.setForeground(new Color(0, 153, 76));
        admin.setBackground(Color.GREEN);
        admin.setFont(f2);
        panel.add(admin);

        user = new JButton();
        user.setText("User Login");
        user.setBounds(40, 230, 400, 40); // Adjusted position
        user.setForeground(new Color(0, 153, 76));
        user.setBackground(Color.GREEN);
        user.setFont(f2);
        panel.add(user);

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Admin frame=new Admin();
                frame.setVisible(true);

            }
        });

        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    dispose();
                    hostelportal frame1 =new hostelportal();
                    frame1.setVisible(true);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle other action events if needed
    }

    public static void main(String[] args) {
        Panel frame = new Panel();
    }
}


