/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 15:10
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_7 {
    public static void main(String[] args) {
        double term = 1,
                sum  = 1;
        int tecken = 1;

        for (int k=2; Math.abs(term)>=1.0e-5; k++) {
            tecken = -tecken;
            term = tecken * 1.0/k;
            sum = sum + term;
        }
        System.out.println(sum);
    }
}
