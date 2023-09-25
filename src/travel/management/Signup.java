package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField tfusername, tfname, tfpassword, tfanswer;
    Choice security;

    Signup() {
        // Setting up the JFrame
        setBounds(280, 180, 800, 400); // Set the window's position and dimensions
        setLayout(null); // Disable the default layout manager
        getContentPane().setBackground(new Color(248, 240, 229)); // Set background color

        // Panel 1
        JPanel p1 = new JPanel(); // Create a panel
        p1.setBackground(new Color(218, 192, 163)); // Set panel background color
        p1.setBounds(0, 0, 500, 380); // Set panel's position and dimensions
        p1.setLayout(null); // Disable the default layout manager for this panel
        add(p1); // Add the panel to the JFrame

        // Username field and label
        JLabel lblusername = new JLabel("Username  :");
        lblusername.setBounds(30, 20, 100, 40);
        lblusername.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(160, 27, 180, 24);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        // Name field and label
        JLabel lblname = new JLabel("Name  :");
        lblname.setBounds(30, 68, 100, 40);
        lblname.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(160, 75, 180, 24);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        // Password field and label
        JLabel lblpass = new JLabel("Password  :");
        lblpass.setBounds(30, 118, 100, 40);
        lblpass.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblpass);

        tfpassword = new JTextField();
        tfpassword.setBounds(160, 124, 180, 24);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        // Security Question choice and label
        JLabel lblques = new JLabel("Security Questions  :");
        lblques.setBounds(30, 170, 100, 40);
        lblques.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblques);

        security = new Choice();
        security.add("Your First Friend Name");
        security.add("Your Favourite Marvel SuperHero");
        security.add("Your First School Name ");
        security.add("Your Favourite Game ");
        security.add("Your Favourite Food Name ");
        security.setBounds(160, 180, 180, 24);
        p1.add(security);

        // Answer field and label
        JLabel lblanswer = new JLabel("Answer  :");
        lblanswer.setBounds(30, 223, 100, 40);
        lblanswer.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(160, 230, 180, 24);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        // Create button
        create = new JButton("Create");
        create.setBounds(30, 290, 120, 25);
        create.setBackground(new Color(255, 255, 255));
        create.setForeground(new Color(218, 192, 163));
        create.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(create);
        create.addActionListener(this);

        // Back button
        back = new JButton("Back");
        back.setBounds(220, 290, 120, 25);
        back.setBackground(new Color(255, 255, 255));
        back.setForeground(new Color(218, 192, 163));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        p1.add(back);
        back.addActionListener(this);

        // Panel 2
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(248, 240, 229));
        p2.setBounds(400, 0, 400, 400);
        p2.setLayout(null);
        add(p2);

        // Image icon setup
        ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image t2 = t1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(t2);
        JLabel image = new JLabel(t3);
        image.setBounds(150, 60, 200, 200);
        p2.add(image);

        setVisible(true); // Make the JFrame visible
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            // Get user input
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            // Create a SQL query to insert data into the database
            String query = "insert into account values ('" + username + "' , '" + name + "' , '" + password + "' , '"
                    + question + "' , '" + answer + "')";

            try {
                // Create a connection to the database and execute the query
                Conn c = new Conn();
                c.s.executeUpdate(query);

                // Show a success message and hide the current window, then open the Login window
                JOptionPane.showMessageDialog(null, "Congratulations ! Account created successfully");
                setVisible(false);
                new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            // Hide the current window and open the Login window
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Signup class, which initializes the GUI
        new Signup();
    }
}
