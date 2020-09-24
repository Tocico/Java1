import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-04
 * Time: 10:58
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Exempel4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ange ett decimaltal: ");
                double tal = scan.nextDouble();
                int tal2 = 255;
                System.out.printf("%.2f",tal);

                double flyttal = 1.2;
                System.out.println(flyttal); // 1.2
                System.out.printf("%.2f", flyttal);
            } catch (InputMismatchException error) {
                System.out.println("Felaktig inmatning");
                scan.next();
// OBS! Du måste läsa en tom rad för att rensa buffert
            }
        }
    }
}
