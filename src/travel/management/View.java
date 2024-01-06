package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.sql.*;

public class View extends JFrame implements ActionListener {

    JLabel lblusername, lblid, lblnumber, cstusername, cstid, cstIdnumber, cstgender, 
    lblgender,lblname ,cstname ,lblcountry ,lbladdress,lblphone,lblemail,cstcountry,cstaddress,cstphone,cstemail;

    JButton back;

    View(String username) {
        setBounds(400, 90, 870, 625);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        lblusername = new JLabel("Username");
        lblusername.setBounds(40, 30, 100, 50);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblusername);

        cstusername = new JLabel();
        cstusername.setBounds(240, 30, 100, 50);
        cstusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstusername);

        lblid = new JLabel("Id");
        lblid.setBounds(40, 90, 100, 50);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblid);

        cstid = new JLabel();
        cstid.setBounds(240, 90, 100, 50);
        cstid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstid);

        lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 150, 100, 50);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblnumber);

        cstIdnumber = new JLabel();
        cstIdnumber.setBounds(240, 150, 100, 50);
        cstIdnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstIdnumber);

        lblname = new JLabel("Name");
        lblname.setBounds(40, 210, 100, 50);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblname);

        cstname = new JLabel();
        cstname.setBounds(240, 210, 100, 50);
        cstname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstname);

        lblgender = new JLabel("Gender");
        lblgender.setBounds(40, 270, 100, 50);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblgender);

        cstgender = new JLabel();
        cstgender.setBounds(240, 270, 100, 50);
        cstgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstgender);

        lblcountry = new JLabel("Country");
        lblcountry.setBounds(440, 30, 100, 50);
        lblcountry.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblcountry);

        cstcountry = new JLabel();
        cstcountry.setBounds(640, 30, 100, 50);
        cstcountry.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstcountry);

        lbladdress = new JLabel("Address");
        lbladdress.setBounds(440, 90, 100, 50);
        lbladdress.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbladdress);

        cstaddress = new JLabel();
        cstaddress.setBounds(640, 90, 160, 50);
        cstaddress.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstaddress);

        lblphone = new JLabel("Phone");
        lblphone.setBounds(440, 150, 100, 50);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblphone);

        cstphone = new JLabel();
        cstphone.setBounds(640, 150, 100, 50);
        cstphone.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstphone);

        lblemail = new JLabel("Email");
        lblemail.setBounds(440, 210, 100, 50);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblemail);

        cstemail = new JLabel();
        cstemail.setBounds(640, 210, 150, 50);
        cstemail.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cstemail);

       back = new JButton("Back");
       back.setBackground(Color.black);
       back.setForeground(Color.white);
       back.setBounds(350,350,100,25);
       back.addActionListener(this);
       add(back);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 200, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(30, 400, 800, 200);
       add(image) ;


       try {
        Conn conn = new Conn();
        String query = "select * from customer where username = '"+username+"'";
        ResultSet rs = conn.s.executeQuery(query);
        while (rs.next()) {
            cstusername.setText(rs.getString("username"));
            cstid.setText(rs.getString("id"));
            cstIdnumber.setText(rs.getString("number"));
            cstname.setText(rs.getString("name"));
            cstgender.setText(rs.getString("gender"));
            cstcountry.setText(rs.getString("country"));
            cstaddress.setText(rs.getString("address"));
            cstphone.setText(rs.getString("phone"));
            cstemail.setText(rs.getString("email"));
        }
         
       } catch (Exception e) {
       
       }

        setVisible(true);
        //country address phone emsail
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    public static void main(String[] ar) {
        new View("Beeta");
    }
}
