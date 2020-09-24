import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-09
 * Time: 10:00
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift9_2 {
    public static void main(String[] args) {
        System.out.print("Dagens mätarställning? "); System.out.flush();
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        System.out.print("Mätarställning för ett år sedan? "); System.out.flush();
        int m2 = sc.nextInt();
        System.out.print("Antal liter förbrukad bensin? "); System.out.flush();
        double li = sc.nextDouble();
        System.out.format("Antal körda mil: %20d\n", (m1-m2));
        System.out.format("Antal liter bensin: %10.2f\n", li);
        System.out.format("Förbrukning per mil: %9.2f\n", li/(m1-m2));
    }
}
