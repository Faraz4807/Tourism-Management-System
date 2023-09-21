// Import the necessary Swing library for creating GUI components.
package travel.management;
import javax.swing.*;
import java.awt.*;

// Create a class named Splash that extends JFrame, which is used to create a window.
public  class Splash extends JFrame implements Runnable {
    Thread thread;
    // Constructor for the Splash class.
    Splash() {
        // Set the size of the window to 1200 pixels in width and 600 pixels in height.
//        setSize(1200, 600);
        
        // Set the initial location of the window on the screen (100 pixels from the left, 70 pixels from the top).
//        setLocation(100, 70);
        
        // Create an ImageIcon using an image file called "splash.jpg" from the "icons" folder.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/world.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        // Create a JLabel to display the ImageIcon within the window.
        JLabel image = new JLabel(i3);
        
        // Add the JLabel (image) to the JFrame (window).
        add(image);
        
        // Make the window visible to the user.
        setVisible(true);
        thread = new Thread(this);
        thread.start();
        // run();

    }
    public void run(){
        try{

            Thread.sleep(7000);
            // new.Login();
            setVisible(false);
        }catch(Exception e){}

    }
    // The main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create an instance of the Splash class, which will display the splash screen.
        Splash frame = new Splash();
        int x=1;

        for(int i=1 ;i<=500 ; x+=7 , i+=6){
            frame.setLocation(700-(x+i)/2 , 350-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(20);

            }catch (Exception e){}

        }
        
    }
}
