import javax.swing.*;
import java.util.jar.JarOutputStream;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 10:51
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Ovning5 {
    public static void main(String[] args) {
        //Övning 5.1
        int n = 3;
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + i * i;
        }
        System.out.println("summan: " + s);

        //Övning 5.2
        int n2 = 5;
        double s2 = 0;


        for (int i = 1; i <= n2; i++) {
            s2 = s2 + 1.0 / i;
        }
        System.out.println("summan: " + s2);

        //Övning 5.3
        double h = 30;
        int g = 0;
        while (h > 0.01) {
            h = h * 0.7;
            g++;
        }
        System.out.println(g + " gånger");

        //Övning 5.4
        while (true) {
            String input = JOptionPane.showInputDialog("Höjden?");

            if (input == null) break;
            double h2 = 30;
            int g2 = 0;
            while (h2 > 0.01) {
                h2 = h2 * 0.7;
                g2++;
            }
            JOptionPane.showMessageDialog(null,g2 + " gånger");
        }
    }
}
