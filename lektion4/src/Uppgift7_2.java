/**
 * Created by Toshiko Kuno
 * Date: 2020-08-31
 * Time: 14:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift7_2 {
    public static void main(String[] args) {
        String input = "aa";

        int n = input.indexOf(" ");
        int l = input.lastIndexOf(" ");
       if(n > 0) {
        System.out.println(input.substring(0,n));
        System.out.println(input.substring(l+1));

       }else {
           System.out.println("Skriva minst två ord");
       }


    }
}
