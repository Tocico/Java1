/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 15:01
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_6 {
    public static void main(String[] args) {
        int år = 2014;
        int antal = 26000;
        for (int i=2013; i<=år; i++)
            antal = antal + (int) (300 - 325 + antal*(0.7-0.6)/100+0.5);
        System.out.println("Befolkning: " + antal);
    }
}
