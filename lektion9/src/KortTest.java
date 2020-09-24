/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 15:38
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

        System.out.println(k1);

        System.out.println(k1.equals(k2));

        k1.ändra(2, 10);
        System.out.println(k1);
    }
}
