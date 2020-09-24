import javax.swing.*;
import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {
        // Övning 1
        String inputMinutes = JOptionPane.showInputDialog("Antal minuter");
        String inputCosts = JOptionPane.showInputDialog("Ange kostnad per minuter");

        int m = Integer.parseInt(inputMinutes);
        double c = Double.parseDouble(inputCosts);

        double result = m * c;
        System.out.println("Månadskostnad: " + result + " kr");

        // Övning 2
        String inputMoms = JOptionPane.showInputDialog("Ange moms");
        String inputPris = JOptionPane.showInputDialog("Ange pris");

        int moms = Integer.parseInt(inputMoms);
        double p = Double.parseDouble(inputPris);

        double exMoms = p / (1 + 0.01 * moms);
        double delsMoms = p - exMoms;

        System.out.println("Dels Moms: " + delsMoms + "\nPris (exkl. moms): " + exMoms);

        // Övning 3.3
        String inputRadie = JOptionPane.showInputDialog("Ange radie");

        double radie = Double.parseDouble(inputRadie);

        double omkrets = 2 * radie * Math.PI;
        double area = Math.PI * radie * radie;

        System.out.println("Omkrets: " + omkrets + "\nArea: " + area);

        // Övning 3.6
        String inputSekunder = JOptionPane.showInputDialog("Ange sekunder");

        int tid = Integer.parseInt(inputSekunder);
        int tim, min, sek;
        tim = tid / 3600;
        tid = tid % 3600;
        min = tid / 60;
        tid = tid % 60;
        sek = tid;

        System.out.println("Tim " + tim + ": Min " + min + ": Sek " + sek);


        //Övning 3.8
        double maxValue = 0.0;
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int d = 0; d < 7; d++) {
            String temp = JOptionPane.showInputDialog("temperature on " + weeks[d]);
            double t = Double.parseDouble(temp);
            maxValue = Math.max(maxValue, t);
        }

        JOptionPane.showMessageDialog(null, "max value är: " + maxValue);

        //Övning 3.9
        int i = (int) Math.random()* 100;
        System.out.println("Slumpmässigt: " + i);
    }
}
