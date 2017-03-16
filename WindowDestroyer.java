import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by dell on 2017/3/16.
 */
public class WindowDestroyer extends WindowAdapter{

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}
