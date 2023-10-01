package travel.management;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;
    String username;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if (value < max) {
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    // new class object
                }
                Thread.sleep(30);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Loading(String username) {
        this.username = username;
        t = new Thread(this);
        setBounds(400, 160, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel text = new JLabel("Travel and Tourism Application ");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma", Font.BOLD, 35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 350, 40);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading, Please Wait... ");
        loading.setBounds(150, 150, 200, 20);
        loading.setForeground(Color.ORANGE);
        loading.setFont(new Font("Tahoma", Font.BOLD, 17));
        add(loading);

        JLabel lblusername = new JLabel(" Welcome " + username);
        lblusername.setBounds(15, 330, 200, 20);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 17));
        add(lblusername);
        t.start();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Loading();
    }
}
