import javax.swing.*;

//Frågar efter och skriver sedan ut för och efternamn

/**
 * Created by hawi15 on 2016-12-19.
 */
public class Uppgift_2_3 {
    public static void main (String[] arg) {
        String namn;
        String efternamn;
        String hälsning;

        namn = JOptionPane.showInputDialog("Förnamn:");
        efternamn = JOptionPane.showInputDialog("Efternamn:");
        hälsning = "Välkommen " + namn + " " + efternamn;

        JOptionPane.showMessageDialog(null, hälsning);
    }
}
