/**
 * Created by Toshiko Kuno
 * Date: 2020-08-27
 * Time: 16:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Ovning3 {
    public static void main(String[] args) {

        //Övning1
        int m = 100;
        double c = 15;

        double costs = m * c;
        if (costs >= 1000) costs = costs * 0.9;
        System.out.println("costs = " + costs);


        //Övning2
        int a = 3000;
        int b = 150;
        int g = 25;

        int oneTimeTickets = b * g;

        if (oneTimeTickets < a) {
            System.out.println("Köp en gång biljett");
        } else {
            System.out.println("Köp årskort");
        }

        //Övning3
        int points = 37;

        if(points <= 25){
            System.out.println("E");
        }else if (points <= 30) {
            System.out.println("D");
        }else if (points <= 35) {
            System.out.println("C");
        }else if (points <= 40) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }

        //Övning 4
        for(int i = 1; i <= 100; i++) {
            if((i % 3) == 0) {
                System.out.println("Fizz!!");
            }else if((i % 5) == 0) {
                System.out.println("Buzz!!");
            }else {
                System.out.println(i);
            }
        }

    }

}
