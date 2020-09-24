/**
 * Created by Toshiko Kuno
 * Date: 2020-09-08
 * Time: 15:29
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class BilTest {
    public static void main(String[] args) {
        Bil bil1 = new Bil();
        Bil bil2 = new Bil();
        bil1.owner = new Person();
        bil2.owner = new Person();

        bil1.yearModel = 1988;
        bil1.engine = 2000;
        bil1.fabric = "Nagoya";
        bil1.weight = 300000;
        bil1.owner.efternamn = "Kuno";
        bil1.owner.förnamn = "Toshiko";

        bil2.yearModel = 1900;
        bil2.engine = 5000;
        bil2.fabric = "Kobe";
        bil2.weight = 50000;
        bil2.owner.förnamn = "Taeko";
        bil2.owner.efternamn = "Kuno";

        System.out.println(bil1.owner.efternamn +" äger " + bil1.yearModel + " " + bil1.weight);
    }
}
