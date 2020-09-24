/**
 * Created by Toshiko Kuno
 * Date: 2020-09-08
 * Time: 15:00
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class KortTest {
    public static void main(String[] arg) {
        Kort k1 = new Kort();
        Kort k2 = new Kort();
        k1.färg = Kort.SPADER;
        k1.valör = 12;
        k2.färg = Kort.KLÖVER;
        k2.valör = 7;

        System.out.println(k1.valör);
    }
}
