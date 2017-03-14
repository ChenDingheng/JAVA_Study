import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dell on 2017/3/14.
 */
public class WindowDestroyer extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(1);
    }
}
