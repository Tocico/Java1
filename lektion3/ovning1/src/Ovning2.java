import javax.swing.*;
import java.util.Random;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-27
 * Time: 13:09
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Ovning2 {
    public static void main(String[] args) {
       double r = 30;
        double v = 4 * Math.PI * Math.pow(r, 3) / 3;
        System.out.println("volymen" + v);

        double a = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Arean" + a);


        //Random
        System.out.println((int)(Math.random()*6) + 1);
        Random random = new Random();
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(6) + 1);
        System.out.println(random.nextInt(6) + 1);

        //Pythagoras
        String katet1 = JOptionPane.showInputDialog("Ange katet1");
        String katet2 = JOptionPane.showInputDialog("Ange katet2");
        double k = Double.parseDouble(katet1);
        double k2 = Double.parseDouble(katet2);

        double h = Math.sqrt(Math.pow(k,2) + Math.pow(k2,2));

        System.out.println("h = " + h);

        //Fahrenheit
        String farhrenheit = JOptionPane.showInputDialog("Ange grader fahrenheit");
        double f = Double.parseDouble(farhrenheit);
        double t = (f-32) * 5/9;
        System.out.println("Celsius " + t);

        //Koordinatsystem
        double x1 = 5;
        double x2 = 10;
        double y1 = 6;
        double y2 = 15;

        double s = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
        System.out.println("s = " + s);

        //Bensinförbrukning
        double milesPerGallon = 50;
        double literPerMil = 3.785/milesPerGallon/1.609*10;

    }
}
