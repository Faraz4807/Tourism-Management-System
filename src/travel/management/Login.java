package travel.management;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener {
        JButton login, SignUp, Fgtpass;
        JTextField tfpassword, tfusername;

        Login() {
                setSize(900, 450);
                setLocation(250, 150);
                setLayout(null);

                JPanel p1 = new JPanel();
                p1.setBackground(new Color(100, 217, 250));
                p1.setBounds(0, 0, 400, 400);
                p1.setLayout(null);
                add(p1);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
                Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(100, 120, 200, 200);

                p1.add(image);

                JPanel p2 = new JPanel();
                p2.setLayout(null);
                p2.setBounds(400, 30, 450, 400);
                p2.setBackground(new Color(220, 237, 242));

                add(p2);
                // UserName
                JLabel lblusername = new JLabel("Username");
                lblusername.setBounds(60, 20, 100, 40);
                lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
                p2.add(lblusername);

                tfusername = new JTextField();
                tfusername.setBounds(60, 60, 300, 30);
                tfusername.setBorder(BorderFactory.createEmptyBorder());
                tfusername.setBorder(new LineBorder(new Color(95, 93, 217)));

                p2.add(tfusername);

                // pasword
                JLabel lblpassword = new JLabel("Password");
                lblpassword.setBounds(60, 120, 100, 40);
                lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
                p2.add(lblpassword);

                tfpassword = new JTextField();
                tfpassword.setBounds(60, 160, 300, 30);
                tfpassword.setBorder(BorderFactory.createEmptyBorder());
                tfpassword.setBorder(new LineBorder(new Color(95, 93, 217)));
                p2.add(tfpassword);
                // Login Buuton
                login = new JButton("Login");
                login.setBounds(60, 240, 120, 25);
                login.setBackground(new Color(
                                138, 139, 148));

                login.setForeground(new Color(204, 237, 226));

                login.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
                login.setBorder(new LineBorder(new Color(95, 93, 217)));
                login.addActionListener(this);
                p2.add(login);

                // signUp Button
                SignUp = new JButton("SignUp");
                SignUp.setBounds(250, 240, 120, 25);
                SignUp.setBackground(new Color(
                                138, 139, 148));

                SignUp.setForeground(new Color(204, 237, 226));
                SignUp.setFont(new Font("SAN SERIF", Font.PLAIN, 15));
                SignUp.setBorder(new LineBorder(new Color(95, 93, 217)));
                SignUp.addActionListener(this);
                p2.add(SignUp);
                // Forgot Password
                Fgtpass = new JButton("Forgot Password");
                Fgtpass.setBounds(150, 300, 120, 20);
                Fgtpass.setBackground(new Color(
                                138, 139, 148));

                Fgtpass.setForeground(new Color(204, 237, 226));
                Fgtpass.setFont(new Font("SAN SERIF", Font.PLAIN, 13));
                Fgtpass.setBorder(new LineBorder(new Color(95, 93, 217)));
                Fgtpass.addActionListener(this);
                p2.add(Fgtpass);

                JLabel text = new JLabel("Trouble sign in...");
                text.setBounds(300, 300, 130, 20);
                text.setForeground(Color.RED);
                p2.add(text);

                setVisible(true);

        }

        public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == login) {
                        // setVisible(false);
                        try {
                                String username = tfusername.getText();
                                String passw = tfpassword.getText();

                                String query = "select * from account where username = '" + username
                                                + "' AND password = '" + passw + "'";
                                Conn c = new Conn();
                                ResultSet rs = c.s.executeQuery(query);

                                if (rs.next()) {
                                        setVisible(false);
                                        new Loading(username);
                                } else {
                                        JOptionPane.showMessageDialog(null, "incorrrect username or password");
                                }

                        } catch (Exception e) {
                                e.printStackTrace();
                        }

                } else if (ae.getSource() == SignUp) {
                        setVisible(false);
                        new Signup();
                } else {
                        setVisible(false);
                        new Forgot();
                }
        }

        public static void main(String[] args) {
                new Login();// Ananimus object
        }
}
