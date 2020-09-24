import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-04
 * Time: 10:30
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Tabellen {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n1");
        String s = scanner.nextLine();
        int n1 = Integer.parseInt(s);
        System.out.println("n2?");
        s = scanner.nextLine();
        int n2 = Integer.parseInt(s);
        // Skriv rubriker
        System.out.println("n\tn!");
        System.out.println();
        // Skriv tabellraderna
        for (int i=n1; i<=n2; i++)
            System.out.println(i + "\t" + nfak(i));
    }

    public static double nfak(int n) {
        double r=1;
        for (int i=1; i <= n; i++)
            r = r*i;
        return r;
    }
}
