import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-09
 * Time: 09:06
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Övning9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Namne");
        String name = scanner.nextLine();

        System.out.println("telefon");
        String tel = scanner.nextLine();

        //System.out.println("name: " + name + "\ntel: " + tel);
        System.out.print("name: " + name + "\ntel: " + tel);
        //System.out.flush();

    }
}
