package travel.management;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {
    Signup() {
        setBounds(280, 180, 800, 400);
        setLayout(null);

        getContentPane().setBackground(new Color(248, 240, 229));

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(218, 192, 163));
        p1.setBounds(0, 0, 500, 380);
        p1.setLayout(null);
        add(p1);
        // UserName
        JLabel lblusername = new JLabel("Username  :");
        lblusername.setBounds(30, 20, 100, 40);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(160, 27, 180, 24);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfusername);

        // Name

        JLabel lblname = new JLabel("Name  :");
        lblname.setBounds(30, 68, 100, 40);
        lblname.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblname);

        JTextField tfname = new JTextField();
        tfname.setBounds(160, 75, 180, 24);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfname);
        // Password

        JLabel lblpass = new JLabel("Password  :");
        lblpass.setBounds(30, 118, 100, 40);
        lblpass.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblpass);

        JTextField tfpasss = new JTextField();
        tfpasss.setBounds(160, 124, 180, 24);
        tfpasss.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfpasss);

        // Security Question
        JLabel lblques = new JLabel("Security Questions  :");
        lblques.setBounds(30, 170, 100, 40);
        lblques.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblques);

        Choice security = new Choice();
        security.add("Your First Friend Name");
        security.add("Your Favourite Gali");
        security.add("Your First System Name ");
        security.add("Your Favourite Game ");
        security.setBounds(160, 180, 180, 24);
        p1.add(security);

        // Answer

        JLabel lblanswer = new JLabel("Answer  :");
        lblanswer.setBounds(30, 223, 100, 40);
        lblanswer.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblanswer);

        JTextField tfanswer = new JTextField();
        tfanswer.setBounds(160, 230, 180, 24);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfanswer);
        // create button
        JButton create = new JButton("Create");
        create.setBounds(30, 290, 120, 25);
        create.setBackground(new Color(
                255, 255, 255));

        create.setForeground(new Color(218, 192, 163));
        create.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        // create.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(create);
        setVisible(true);

        // back button

        JButton back = new JButton("Back");
        back.setBounds(220, 290, 120, 25);
        back.setBackground(new Color(
                255, 255, 255));

        back.setForeground(new Color(218, 192, 163));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        // back.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(back);
        // panel 2
        ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image t2 = t1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(t2);
        JLabel image = new JLabel(t3);
        image.setBounds(570, 80, 150, 200);

        add(image);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Signup();

    }
}
