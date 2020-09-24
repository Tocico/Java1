/**
 * Created by Toshiko Kuno
 * Date: 2020-08-27
 * Time: 16:45
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Ovning4 {
    public static void main(String[] args) {
        //Skottår
        int year = 1855;

        if(year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Skottår!!");
        } else{
            System.out.println("INTE skottår!");
        }

        //Övning 4.4
        int height = 500;
        int thickness = 50;
        int width = 200;

        int total = height + thickness + width;

        if(total <= 900 && height <= 600 && thickness <= 100 && height >= 140 && width >= 90) {
            System.out.println("OK!!");
        }else {
            System.out.println("NOT OK!");
        }
    }
}
