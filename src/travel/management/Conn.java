package travel.management;  // This line specifies the package name where this class belongs.

import java.sql.*;  // This line imports necessary classes from the java.sql package.

public class Conn {  // This line defines the beginning of a Java class named "Conn."

    Connection c;  // Declares a Connection object named 'c' for handling database connections.
    Statement s;   // Declares a Statement object named 's' for executing SQL statements.

    Conn(){  // This is a constructor method for the Conn class.

        try{  // Starts a try-catch block for handling exceptions.

            // Loads the MySQL JDBC driver class, which is needed to connect to a MySQL database.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishes a connection to the MySQL database named "travelmanagementsystem" using the provided username and password.
            c= DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","System@1234");

            // Creates a Statement object for executing SQL queries on the database.
            s = c.createStatement();

        }catch (Exception e){  // Catches any exceptions that might occur during the database connection setup.
            e.printStackTrace();  // Prints the exception's stack trace to the console.
        }
    }

    public static void main(String[] args) {  // The main method of the class, which is the entry point for the program.

    }
}
