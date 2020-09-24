import java.util.Calendar;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-25
 * Time: 10:36
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class CharDemo {
    public static void main(String[] args) {
        char copyright = '\u00A9';
        System.out.println(copyright);

        char bokstav = 'a';
        char storBokstav = Character.toUpperCase(bokstav);
        System.out.println(storBokstav);
        System.out.println(Character.isDigit(bokstav));
        System.out.println(Character.isLetter(bokstav));

        //Övning 2.6
        char c1, c2;
        c1 = '\u00D8';
        c2 = Character.toLowerCase(c1);

        System.out.println("Stort: " + "" + c1 + "\nLitet: " + "" + c2);

        //Övning 2.7
        char c3;
        c3 = '\u03c0';
        System.out.println("" + c3);

        String hello = "Hello World!";
        int i = hello.length();
        System.out.println(hello.charAt(i-1));

        String date = Calendar.getInstance().getTime().toString();
        int e = date.indexOf(":");
        String time = date.substring(e-2, e+6);
        System.out.println(time);

    }
}
