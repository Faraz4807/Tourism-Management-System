package travel.management;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Forgot extends JFrame implements ActionListener {
    JTextField tfusername, tfname, tfquestion, tfanswer, tfpassword;
    JButton search, retrieve, back;

    Forgot() {

        // Set the position and size of the frame
        setBounds(310, 140, 800, 400);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLayout(null);

        // Create a panel for organizing components
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(200, 255, 224));
        p1.setBounds(15, 32, 500, 300);
        add(p1);

        // Load and display an image on the right side
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 80, 200, 200);
        add(image);

        // Username label and text field
        JLabel lblusername = new JLabel("Username  :");
        lblusername.setBounds(25, 25, 90, 20);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(200, 23, 150, 24);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        // Search button
        search = new JButton("Search");
        search.setBounds(390, 23, 100, 25);
        search.setBackground(new Color(92, 84, 112));
        search.setBorder(BorderFactory.createEmptyBorder());
        search.setForeground(new Color(250, 240, 230));
        search.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        search.addActionListener(this);
        p1.add(search);

        // Name label and text field
        JLabel lblname = new JLabel("Name  :");
        lblname.setBounds(25, 74, 90, 20);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 65, 150, 24);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        // Security Question label and text field
        JLabel lblsecurity = new JLabel("Your Security Question :");
        lblsecurity.setBounds(25, 115, 150, 20);
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(lblsecurity);

        tfquestion = new JTextField();
        tfquestion.setBounds(200, 109, 150, 24);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);

        // Security Answer label and text field
        JLabel lblanswer = new JLabel("Your Answer :");
        lblanswer.setBounds(25, 158, 150, 20);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(200, 155, 150, 24);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        // Retrieve button
        retrieve = new JButton("Retrieve");
        retrieve.setBounds(390, 155, 100, 25);
        retrieve.setBackground(new Color(92, 84, 112));
        retrieve.setBorder(BorderFactory.createEmptyBorder());
        retrieve.setForeground(new Color(250, 240, 230));
        retrieve.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        retrieve.addActionListener(this);
        p1.add(retrieve);

        // Password label and text field
        JLabel lblpassword = new JLabel(" Password :");
        lblpassword.setBounds(25, 207, 150, 20);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 13));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(200, 201, 150, 24);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        // Back button
        back = new JButton("Back");
        back.setBounds(180, 253, 100, 25);
        back.setBackground(new Color(92, 84, 112));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setForeground(new Color(250, 240, 230));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            try {
                // Search for the user's information in the database based on their username
                String query = "select * from account where username = '" + tfusername.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("securityques"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == retrieve) {
            try {
                // Retrieve the password from the database based on the provided answer and username
                String query = "select * from account where answer = '" + tfanswer.getText() + "' AND username = '"
                        + tfusername.getText() + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfpassword.setText(rs.getString("password"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            // If the back button is clicked, hide the current window and open the login window
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Forgot();
    }
}
