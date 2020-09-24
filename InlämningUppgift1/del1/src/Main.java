import javax.swing.*;
import java.util.jar.JarOutputStream;
/**
 * Created by Toshiko Kuno
 * Date: 2020-09-1
 * Time: 15:24
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

public class Main {
    /**
     * Beräkna och visa BMI samt viktklassen i en dialogruta
     * Skriv testkod för att testa olika inputdata och
     * visa resultatet i terminalen.
     * @param args
     */
    public static void main(String[] args) {
        //Test code
        String weight = "53";
        String height = "1.61";

        weight = JOptionPane.showInputDialog("Ange din vikt");
        height = JOptionPane.showInputDialog("Ange din längt\nOBS! Skriv längden i meter");

        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);

        double bmi = calculateBmiValue(w, h);
        String result = WeightClass.getWeightClass(bmi);
        String message = "------Resultatet-------\n" +
                "Vikt: " + w +
                "\nLängd: " + h +
                "\nBMI: " + bmi +
                "\nViktklass: " + result;
        System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * Bäräkna BMI
     * @param w vikt
     * @param h längt
     * @return bmi värdet
     */
    public static double calculateBmiValue(double w, double h) {
        double bmi = w / (h * h);
        //Att avrunda till 1 decimal
        return Math.round(bmi * 10.0) / 10.0;
    }
}

class WeightClass {
    /**
     * Kolla vilken viktklass man har
     * @param bmi
     * @return viktklass
     */
    public static String getWeightClass(double bmi) {
        if (bmi < 18.5)
            return "Undervikt";

        else if (bmi >= 18.5 && bmi <= 25.0)
            return "Normalvikt";

        else if (bmi > 25.0 && bmi <= 30.0)
            return "Övervikt";

        else if (bmi > 30.0 && bmi <= 35.0)
            return "Fetma klass1";

        else if (bmi > 35.0 && bmi <= 40.0)
            return "Fetma klass2";

        else
            return "Fetma klass3";
    }
}
