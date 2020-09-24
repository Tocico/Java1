/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 14:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_5 {
    public static void main(String[] args) {
        int n = 10;
        String txt = "";
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++)
                txt = txt + " " + i * j;
                txt = txt + '\n';

        }
        System.out.println(txt);
    }
}
