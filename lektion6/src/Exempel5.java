/**
 * Created by Toshiko Kuno
 * Date: 2020-09-09
 * Time: 09:27
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Exempel5 {
    public static void main(String[] args) {
            System.out.println("n\t2n");
            int value = 2;
        for (int i = 1; i <= 30; value*=2, i++) {
            System.out.printf("%1d%,20d\n" ,i,value);
        }

        System.out.println("-------------------------------");
        int r = 2;
        for (int n=1; n<=30; r*=2, n++)
            System.out.format("%2d%,15d\n", n, r);
    }

}
