package Session;

// imports from the java library
import java.awt.Font;
import java.awt.Color;
import java.awt.Window;

/**
 * @author Nikola
 */
public class General {
    public static Color WHITE = new Color(255, 255, 255);
    public static Color BLACK = new Color(0, 0, 0);
    public static Color BUTTON_BLUE = new Color(65, 175, 255, 1);

    public static Font font(int size) {
        return new Font("Monospaced", Font.PLAIN, size);
    }

    // Close all windows in the array
    public static void closeAllWindows() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
    }
}