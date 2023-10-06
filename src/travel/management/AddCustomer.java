package travel.management;

import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame {

    JLabel lblusername, lblid ,lblnumber ,lblname , lblgender;
    // Choice IDs;
    JComboBox<String> comfid;
    JTextField tfnumber , tfname;
    JRadioButton rmale , rfemale;

    AddCustomer() {
        setBounds(250, 100, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(250, 203, 234));

        lblusername = new JLabel("Username");
        lblusername.setBounds(40, 60, 100, 50);
        add(lblusername);

        // lblusername = new JLabel("Username of user");
        // lblusername.setBounds(240, 60, 100, 50);
        // add(lblusername);

        lblid = new JLabel("ID");
        lblid.setBounds(40, 120, 100, 50);
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
        comfid.setBounds(240, 130, 180, 24);
        comfid.setBackground(new Color(250, 203, 234));
        add(comfid);

        lblnumber= new JLabel("Number");
        lblnumber.setBounds(40, 180, 100, 50);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(240, 185, 180, 24);
        tfnumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfnumber);

        lblname= new JLabel("Name");
        lblname.setBounds(40, 230, 100, 50);
        add(lblname);

        // tfname = new JTextField();
        // tfname.setBounds(240, 230, 180, 24);
        // tfname.setBorder(BorderFactory.createEmptyBorder());
        // add(tfname);

        lblgender= new JLabel("Gender");
        lblgender.setBounds(40, 280, 100, 50);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(240, 280, 60, 20);
        rmale.setBackground(new Color(250, 203, 234));
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(350, 280, 80, 20);
        rfemale.setBackground(new Color(250, 203, 234));
        add(rfemale);



        setVisible(true);
    }

    public static void main(String[] args) {
        new AddCustomer();
    }
}
