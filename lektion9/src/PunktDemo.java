/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 15:12
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class PunktDemo {
    public static void main(String[] args) {
        Punkt a = new Punkt(20,50);
        Punkt b = new Punkt();

        System.out.println(a);
        System.out.println(a.formeln());
        a.flyttaHorisontellt(-30);
        System.out.println(a);

    }

}
