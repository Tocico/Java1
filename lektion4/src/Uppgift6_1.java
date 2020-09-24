import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 10:52
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift6_1 {
    /**
     * Läs in det första talet och tilldela det till en variabel med namnet x.
     * <p>
     * Upprepa följande ett godtyckligt antal gånger:
     * Läs in ett tal och avbryt upprepningen om användaren vill sluta.
     * Tilldela det inlästa talet till en variabel med namnet y.
     * Om x > y
     * Meddela att talen inte skrivits i storleksordning.
     * Avbryt algoritmen.
     * annars
     * tilldela y till x.
     * Meddela att talen skrivits i storleksordning.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange ett tal");
        int x = scan.nextInt();
        while (true) {
            System.out.println("Ange en till tal");
            int y = scan.nextInt();

            if (x > y) {
                System.out.println("Icke storleksordning");
                break;
            } else {
                x = y;
                System.out.println("Storleksordning");
            }
        }
    }
}
