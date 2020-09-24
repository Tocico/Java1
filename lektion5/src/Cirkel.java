/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 15:24
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Cirkel {
    public static void main(String[] args) {
        double radie = 30;

        System.out.println("Omkrets: " + omkrets(radie));
        System.out.println("Arean: " + area(radie));
    }

    public static double omkrets(double radie) {
        double omkrets = 2 * Math.PI * radie;
        return omkrets;
    }

    public static double area(double radie) {
        double area = radie * radie * Math.PI;
        return area;
    }


}
