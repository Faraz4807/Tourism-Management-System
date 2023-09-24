package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfusername, tfname, tfpassword, tfanswer;
    Choice security;

    Signup() {
        setBounds(280, 180, 800, 400);
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        tfusername = new JTextField();
        tfusername.setBounds(160, 27, 180, 24);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfusername);

        // Name

        JLabel lblname = new JLabel("Name  :");
        lblname.setBounds(30, 68, 100, 40);
        lblname.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(160, 75, 180, 24);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfname);
        // Password

        JLabel lblpass = new JLabel("Password  :");
        lblpass.setBounds(30, 118, 100, 40);
        lblpass.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblpass);

         tfpassword = new JTextField();
         tfpassword.setBounds(160, 124, 180, 24);
         tfpassword.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfpassword);

        // Security Question
        JLabel lblques = new JLabel("Security Questions  :");
        lblques.setBounds(30, 170, 100, 40);
        lblques.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblques);

        security = new Choice();
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

        tfanswer = new JTextField();
        tfanswer.setBounds(160, 230, 180, 24);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        // tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(tfanswer);

        // create button

        create = new JButton("Create");
        create.setBounds(30, 290, 120, 25);
        create.setBackground(new Color(
                255, 255, 255));

        create.setForeground(new Color(218, 192, 163));
        create.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        // create.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(create);
        create.addActionListener(this);

        // setVisible(true);

        // back button

        back = new JButton("Back");
        back.setBounds(220, 290, 120, 25);
        back.setBackground(new Color(
                255, 255, 255));

        back.setForeground(new Color(218, 192, 163));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        // back.setBorder(new LineBorder(new Color(95, 93, 217)));
        p1.add(back);
        back.addActionListener(this);
        // panel 2

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(248, 240, 229));
        p2.setBounds(400, 0, 400, 400);
        p2.setLayout(null);
        add(p2);

        ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image t2 = t1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(t2);
        JLabel image = new JLabel(t3);
        image.setBounds(150, 60, 200, 200);

        p2.add(image);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question= security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values ('"+username+"' , '"+name+"' , '"+password+"' , '"+question+"' , '"+answer+"')";

            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account created succesfully");
                setVisible(false);
                new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();

        }

    }

    public static void main(String[] args) {
        new Signup();

    }
}
