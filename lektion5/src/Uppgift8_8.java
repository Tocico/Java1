/**
 * Created by Toshiko Kuno
 * Date: 2020-09-01
 * Time: 11:36
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift8_8 {
    public static void main(String[] args) {
        String a = "+-*/";
        String t = "aas+dsad/";
        for (int i = 0; i < t.length(); i++) {
            if(a.indexOf(t.charAt(i)) >= 0)
                System.out.println(t.charAt(i));



        }
    }


}
