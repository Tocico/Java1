/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 16:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift6_2 {
    public static void main(String[] args) {

        int m = 5;
        int n = 20;

        while (true){
            int r = m % n;

            if(r == 0) break;

            m = n;
            n = r;
        }
        System.out.println("Result: " + n);
    }
}
