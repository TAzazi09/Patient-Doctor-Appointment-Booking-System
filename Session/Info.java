package Session;

import java.sql.Connection;
import java.sql.Statement;
import Functionality.DatabaseConnectionFunc;

/**
 * @author Nikola
 */
public class Info {
    public static boolean connected;
    public static boolean loggedIn;

    public static String backgroundID;

    public static Connection connection;
    public static Statement statement;

    public static void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connects to the database
            connection = DatabaseConnectionFunc.getConnection();
            statement = connection.createStatement();

            // Sets the connected variable to true
            connected = true;
        } catch (Exception e) {
            connected = false;
        }
    }
}