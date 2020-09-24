/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 15:37
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Kalender {
    public static void main(String[] args) {
        int år = 2026;
        if(ärSkottår(år)) System.out.println("Skottår");
        else System.out.println("Icke Skottår");
    }

    public static boolean ärSkottår(int år) {
        return (år % 4 == 0 && år % 100 != 0 || år % 400 == 0);
    }
}
