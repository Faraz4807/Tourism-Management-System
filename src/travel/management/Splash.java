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
        
        // Create an ImageIcon using an image file called "world.jpg" from the "icons" folder.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/world.jpg"));
        // Scale the image to fit within a 1200x600 pixel area while maintaining its aspect ratio.
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        // Create a JLabel to display the ImageIcon within the window.
        JLabel image = new JLabel(i3);
        
        // Add the JLabel (image) to the JFrame (window).
        add(image);
        
        // Make the window visible to the user.
        setVisible(true);
        
        // Create a new thread to run the splash screen.
        thread = new Thread(this);
        thread.start();
        // run();
    }
    
    // The run method is executed by the thread and handles the duration the splash screen is displayed.
    public void run() {
        try {
            // Sleep for 4000 milliseconds (4 seconds).
            Thread.sleep(4000);
            // Hide the splash screen.
            setVisible(false);
        } catch (Exception e) {
        }
    }
    
    // The main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Create an instance of the Splash class, which will display the splash screen.
        Splash frame = new Splash();
        int x = 1;
        
        // Animation loop to gradually increase the size and move the splash screen.
        for (int i = 1; i <= 500; x += 7, i += 6) {
            // Update the location and size of the splash screen.
            frame.setLocation(700 - (x + i) / 2, 350 - (i / 2));
            frame.setSize(x + i, i);
            try {
                // Sleep for 20 milliseconds to control the animation speed.
                Thread.sleep(20);
            } catch (Exception e) {
            }
        }
    }
}
