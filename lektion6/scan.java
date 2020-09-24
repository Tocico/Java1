import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-04
 * Time: 10:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class scan {
    public static void main(String[] args) {
        double max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv godtryckligt antal");

        //Hej HEj
        //Hej Hej
        while (true) {
            try{
                String value = scanner.nextLine();
                if(value.isEmpty()) break;
                double number = Double.parseDouble(value);
                if (number > max)  max = number;

            }catch (Exception e) {
                System.out.println("Felaktig matning");
            }
        }
        System.out.println("Den största värde är: " + max);
    }
}
