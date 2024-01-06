package travel.management;
import javax.swing.*;
import java.awt.*;

// import javax.swing.JFrame;

public class CheckPackage extends JFrame {

CheckPackage(){
    setBounds(350,100,900,600);
    
    JTabbedPane tab = new JTabbedPane();
    
    

    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(Color.WHITE);

    JLabel l1 = new JLabel("Gold Package");
    l1.setBounds(50,5,300,30);
    l1.setForeground(Color.YELLOW);
    l1.setFont(new Font("Tahoma" ,Font.BOLD,30));
    p1.add(l1);

       JLabel l2 = new JLabel("6 Days 7 Nights");
    l2.setBounds(30,50,300,30);
    l2.setForeground(Color.BLACK);
    l2.setFont(new Font("Tahoma" ,Font.BOLD,20));
    p1.add(l2);

       JLabel l3 = new JLabel("Airport Assistance");
    l3.setBounds(30,100,300,30);
    l3.setForeground(Color.BLACK);
    l3.setFont(new Font("Tahoma" ,Font.BOLD,20));
    p1.add(l3);

     JLabel l4 = new JLabel("City Tour");
    l4.setBounds(30,150,300,30);
    l4.setForeground(Color.BLACK);
    l4.setFont(new Font("Tahoma" ,Font.BOLD,20));
    p1.add(l4);
    
    tab.addTab("package 1",null,p1);
    add(tab);


    setVisible(true);
}

    public static void main(String[] args) {
        new CheckPackage();
    }
}
