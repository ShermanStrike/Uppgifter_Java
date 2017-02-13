
//skapa en metod double calculatePrice(int age) {} som beräknar hur mycket en bussresa kostar på stadsbussarna baserat på din ålder. Ultra tillämpar följande prislista:
        //0-6 år åker gratis
        //7-19 år (Barn) åker för 14 kr
        //20-25 år (Ungdom) åker för 28 kr
        //26-64 år (Vuxen) åker för 34 kr
        //65 + (Pensionär) åker för 28 kr
        //Metoden som du skriver ska hantera felaktigt indata (ålder < 0) genom att kasta ett IllegalArgumentException

import javax.swing.*;

/**
 * Created by hawi15 on 2017-02-06.
 */
public class Undantagshanterings_Uppgift {
    public static void main(String[] args) {
        int age =0;
        try {
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ange ålder"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ogiltig data");
        }
        int price = calculatePrice(age);
        JOptionPane.showMessageDialog(null, "Pris: " + price + "kr");

        if (age >=0 && age <=6) {
            price = 0;
        }
        if (age >=7 && age <=19) {
            price = 14;
        }
        if (age >=20 && age <=25) {
            price = 28;
        }
        if (age >=26 && age <=64) {
            price = 34;
        }
        if (age >=65) {
            price = 28;
        }
    }

    static int calculatePrice(int age) {

        int price = 14;

        if (age >=0 && age <=6) {
            price = 0;
        }
        if (age >=7 && age <=19) {
            price = 14;
        }
        if (age >=20 && age <=25) {
            price = 28;
        }
        if (age >=26 && age <=64) {
            price = 34;
        }
        if (age >=65) {
            price = 28;
        }
        if (age <0) {
            throw new IllegalArgumentException("Ogiltig ålder");
        }
        return price;
    }
}

