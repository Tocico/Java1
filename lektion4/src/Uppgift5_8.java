/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 15:45
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_8 {
    public static void main(String[] args) {
        String input = "adada";
        int i, j;
        for (i = input.length() - 1, j = 0; j < i && input.charAt(i) == input.charAt(j); i--, j++);

            if (j >= i) System.out.println("Palindrom");
            else System.out.println("Inte Palindrom");
    }
}
