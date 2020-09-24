import java.awt.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-01
 * Time: 11:15
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift8_7 {

    public  static void plinga(int n) {
        for (int i=1; i<=n; i++) {
            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        varning("HEEEEJ");

    }

    public static void varning(String text) {
        plinga(3);
        System.out.println(text);
    }


}
