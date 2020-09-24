import java.lang.reflect.Array;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 14:26
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_4 {
    public static void main(String[] args) {
        String input = "Skriver ut texten baklänges";
        String txt = "";
        for(int i = input.length()-1; i >= 0; i--) {
            txt = txt + input.charAt(i);
        }
        System.out.println(txt);
    }
}
