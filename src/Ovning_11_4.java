import javax.swing.*;

/**
 * Created by hawi15 on 2017-02-13.
 */
public class Ovning_11_4 {
    public static void main (String[] args) {
        String[] namn = new String[100]; //fält för namnen
        double billigast; //fält för billigast
        //Läs in namn och priser
        int n = 0; //räknare för antal typer av kort
        while (true) {
            namn[n] = JOptionPane.showInputDialog(
                    "Namn för kort nr " + (n + 1) + "?");
            if (namn[n] == null)
                break;
            String s = JOptionPane.showInputDialog(
                    "Pris/min för " + namn[n] + "?");
            if (s == null)
                break;
            pris[n] = Double.parseDouble(s);
            n++; //öka antalet typer av kort med 1
        }

        // Beräkna det lägsta priset
        int billigast = 0; //index för billigaste
        for (int i=1; i<n; i++)
            if (pris[i] <pris[billigast])
                billigast = i; //nytt lägsta pris funnet
        JOptionPane.showMessageDialog(
                null, namn[billigast] + " är billigast.\n" +
                        "Det kostar " + pris[billigast] + " / minut");
    }
}
