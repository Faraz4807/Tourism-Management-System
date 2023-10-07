package travel.management;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
String username;

    Dashboard(String username) {
        this.username = username;
        // setBounds(0,0,1500,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 145));
        p1.setBounds(0, 0, 1500, 60);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(75, 15, 500, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(new Color(255, 255, 255));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 145));
        p2.setBounds(10, 60, 300, 680);
        add(p2);

        JButton addPersonDetail = new JButton("Person-Deatils");
        addPersonDetail.setBounds(5, 5, 290, 35);
        addPersonDetail.setBackground(new Color(138, 139, 148));
        addPersonDetail.setForeground(new Color(255, 255, 255));
        // addPersonDetail.setMargin(new Insets(0, 0, 0, 80));
        addPersonDetail.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(addPersonDetail);

        JButton updatePersonDetail = new JButton("Addd Personal Deatils");
        updatePersonDetail.setBounds(5, 45, 290, 35);
        updatePersonDetail.setBackground(new Color(138, 139, 148));
        updatePersonDetail.setForeground(new Color(255, 255, 255));
        // updatePersonDetail.setMargin(new Insets(0, 0, 0, 80));
        updatePersonDetail.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(updatePersonDetail);

        JButton viewDetail = new JButton("Update Personal Deatils");
        viewDetail.setBounds(5, 85, 290, 35);
        viewDetail.setBackground(new Color(138, 139, 148));
        viewDetail.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        viewDetail.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(viewDetail);

        JButton checkPackage = new JButton("Check Package");
        checkPackage.setBounds(5, 125, 290, 35);
        checkPackage.setBackground(new Color(138, 139, 148));
        checkPackage.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        checkPackage.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(checkPackage);

        JButton bookPackage = new JButton("Book Package");
        bookPackage.setBounds(5, 165, 290, 35);
        bookPackage.setBackground(new Color(138, 139, 148));
        bookPackage.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        bookPackage.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(bookPackage);

        JButton viewPackage = new JButton("View Package");
        viewPackage.setBounds(5, 205, 290, 35);
        viewPackage.setBackground(new Color(138, 139, 148));
        viewPackage.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        viewPackage.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(viewPackage);

        JButton checkHotel = new JButton("Check Hotels");
        checkHotel.setBounds(5, 245, 290, 35);
        checkHotel.setBackground(new Color(138, 139, 148));
        checkHotel.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        checkHotel.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(checkHotel);

        JButton bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(5, 285, 290, 35);
        bookHotel.setBackground(new Color(138, 139, 148));
        bookHotel.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        bookHotel.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(bookHotel);

        JButton viewbookHotel = new JButton("View Booked Hotel");
        viewbookHotel.setBounds(5, 325, 290, 35);
        viewbookHotel.setBackground(new Color(138, 139, 148));
        viewbookHotel.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        viewbookHotel.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(viewbookHotel);

        JButton destination = new JButton("Destination");
        destination.setBounds(5, 365, 290, 35);
        destination.setBackground(new Color(138, 139, 148));
        destination.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        destination.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(destination);

        JButton paymentGateway = new JButton("Payment Gateway");
        paymentGateway.setBounds(5, 405, 290, 35);
        paymentGateway.setBackground(new Color(138, 139, 148));
        paymentGateway.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        paymentGateway.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(paymentGateway);

        JButton deleteYourDeatils = new JButton("Delete Your Deatils ");
        deleteYourDeatils.setBounds(5, 445, 290, 35);
        deleteYourDeatils.setBackground(new Color(138, 139, 148));
        deleteYourDeatils.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        deleteYourDeatils.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(deleteYourDeatils);

        JButton aboutUs = new JButton("About Us ");
        aboutUs.setBounds(5, 485, 290, 35);
        aboutUs.setBackground(new Color(138, 139, 148));
        aboutUs.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        aboutUs.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(aboutUs);

        JButton logOut = new JButton("LogOut");
        logOut.setBounds(5, 525, 290, 35);
        logOut.setBackground(new Color(138, 139, 148));
        logOut.setForeground(new Color(255, 255, 255));
        // viewDetail.setMargin(new Insets(0, 0, 0, 80));
        logOut.setFont(new Font("Raleway", Font.BOLD, 20));

        p2.add(logOut);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon2 = new JLabel(i6);
        icon2.setBounds(0, 0, 1600, 1000);
        add(icon2);

        JLabel text = new JLabel("Trave Managemnent Sysytem");
        text.setBounds(420, 60, 1000, 70);
        text.setFont(new Font("Raleway", Font.PLAIN, 60));
        text.setForeground(new Color(255, 255, 255));
        icon2.add(text);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard("");
    }
}
