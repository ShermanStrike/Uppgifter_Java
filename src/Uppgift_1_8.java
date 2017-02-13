import javax.swing.*;
import java.util.Calendar;

/**
 * Created by hawi15 on 2016-12-05.
 */
public class Uppgift_1_8 {
    public static void main (String[] args) {
        JOptionPane.showMessageDialog(null,"Time and date" + "\n" + Calendar.getInstance().getTime().toString(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}

