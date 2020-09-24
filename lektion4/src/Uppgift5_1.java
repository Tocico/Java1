import javax.swing.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 13:57
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_1 {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        while(true) {
            String input = JOptionPane.showInputDialog("Ange nummer");

            if(input == null) break;
            int n = Integer.parseInt(input);
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        System.out.println("Max value: " + max + "\nMin value: " + min);
    }
}
