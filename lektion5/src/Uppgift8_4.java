/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 16:11
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift8_4 {
    public static void main(String[] args) {
        int h = 5;
        System.out.println(h + "! = " + nfak(h));
    }

    public static double nfak(int n) {
        double f = 1;
        for (int i = 1; i <= n ; i++) {
            f *= i;
        }

        return f;
    }
}
