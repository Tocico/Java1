/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 16:31
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift8_5 {
    public static void main(String[] args) {
       int tal = 40;
        System.out.println("Antal varv: " + siff(tal));
    }

    public static int siff(int tal) {
        int i = 0;
        while(tal > 0) {
            tal = tal / 10;
            i ++;
        }
        return i;
    }
}
