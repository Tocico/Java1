import javax.swing.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 14:18
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift7_1 {
    public static void main(String[] args) {
        String t = JOptionPane.showInputDialog("Ett tal?");
        int i;
        for (i = 0; i < t.length(); i++)
            if (t.charAt(i) < '0' || t.charAt(i) > '9')
                break;
        if (i < t.length())
            System.out.println(
                    "Inget tal");
        else
            System.out.println("Talet är OK");
    }
}
