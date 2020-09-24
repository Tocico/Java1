/**
 * Created by Toshiko Kuno
 * Date: 2020-08-28
 * Time: 10:59
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgifter {
    public static void main(String[] args) {

        //Uppgift 1
        int minutes = 33;

        if(minutes <= 33) {
            System.out.println("Kontant");
        }else if(minutes > 33 && minutes <= 66) {
            System.out.println("Normal");
        }else {
            System.out.println("Plus");
        }

        //Uppgift 2
        double r = 20;

        if(r > 0) {
            double omkrets = 2 * Math.PI * r;
            double area = Math.PI * Math.pow(r , 2);
            System.out.println("area = " + area);
            System.out.println("omkrets = " + omkrets);
        }else {
            System.out.println("Ange cirkels radie igen!");
        }

        //Uppgift 3
        String postNum = "131 54";
        postNum = postNum.substring(0,2);
        int p = Integer.parseInt(postNum.trim());

        if(20 <= p && p <= 62 || p == 65 || p == 66 ) {
            System.out.println("Götland");
        }else if (p >= 80) {
            System.out.println("Norrland");
        }else {
            System.out.println("Svealand");
        }

    }
}
