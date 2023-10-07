package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {

    JLabel lblusername, lblid, lblnumber, lblname, lblgender, lblcountry, lbladdress, lblemail, lblphone;
    // Choice IDs;
    JComboBox<String> comfid;
    JTextField tfnumber, tfname, tfcountry, tfaddress, tfemail, tfphone;
    JRadioButton rmale, rfemale;
    JButton add, back;

    AddCustomer() {
        setBounds(250, 100, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(250, 203, 234));

        lblusername = new JLabel("Username");
        lblusername.setBounds(40, 30, 100, 50);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblusername);

        lblusername = new JLabel();
        lblusername.setBounds(240, 30, 100, 50);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblusername);

        lblid = new JLabel("ID");
        lblid.setBounds(40, 80, 100, 50);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblid);

        // IDs = new Choice();
        // IDs.add("Aadhar Card");
        // IDs.add("Pan Card");
        // IDs.add("Passport ");
        // IDs.add("Voter Id ");
        // IDs.setBounds(240, 130, 180, 24);
        // IDs.setFont(new Font("SAN SERIF", Font.BOLD, 12));
        // add(IDs);

        String[] subjects = { "Aadhar Card", "Pssport", "Pan Card" };
        comfid = new JComboBox<>(subjects);
        comfid.setBounds(240, 90, 180, 24);
        comfid.setBackground(new Color(250, 203, 234));
        comfid.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(comfid);

        lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 125, 100, 50);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(240, 132, 180, 24);
        tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfnumber);

        lblname = new JLabel("Name");
        lblname.setBounds(40, 177, 100, 50);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblname);

        lblname = new JLabel();
        lblname.setBounds(240, 177, 100, 50);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblname);

        // tfname = new JTextField();
        // tfname.setBounds(240, 230, 180, 24);
        // tfname.setBorder(BorderFactory.createEmptyBorder());
        // add(tfname);

        lblgender = new JLabel("Gender");
        lblgender.setBounds(40, 225, 100, 50);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(240, 234, 60, 20);
        rmale.setBackground(new Color(250, 203, 234));
        rmale.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(350, 234, 80, 20);
        rfemale.setBackground(new Color(250, 203, 234));
        rfemale.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(rfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        lblcountry = new JLabel("Country");
        lblcountry.setBounds(40, 270, 100, 50);
        lblcountry.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(240, 280, 180, 24);
        tfcountry.setBorder(BorderFactory.createEmptyBorder());
        add(tfcountry);

        lbladdress = new JLabel("Address");
        lbladdress.setBounds(40, 315, 100, 50);
        lbladdress.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(240, 323, 180, 24);
        tfaddress.setBorder(BorderFactory.createEmptyBorder());
        add(tfaddress);

        lblemail = new JLabel("Email");
        lblemail.setBounds(40, 360, 100, 50);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(240, 365, 180, 24);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        add(tfemail);

        lblphone = new JLabel("Phone No");
        lblphone.setBounds(40, 400, 100, 50);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(240, 410, 180, 24);
        tfphone.setBorder(BorderFactory.createEmptyBorder());
        add(tfphone);

        add = new JButton("Add");
        add.setBounds(200, 460, 80, 25);
        add.setForeground(new Color(255, 255, 255));
        add.setBackground(new Color(54, 47, 217));
        add.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");

        back.setBounds(70, 460, 80, 25);
        back.setForeground(new Color(255, 255, 255));
        back.setBackground(new Color(54, 47, 217));
        back.setFont(new Font("SAN SERIF", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);

        ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcus2.png"));
        Image t2 = t1.getImage().getScaledInstance(270, 400, Image.SCALE_DEFAULT);
        ImageIcon t3 = new ImageIcon(t2);
        JLabel image = new JLabel(t3);
        image.setBounds(500, 20, 300, 500);
        add(image);

        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = 'Beeta' ");
            while (rs.next()) {
                lblusername.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            



        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddCustomer();
    }
}
