/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 14:07
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift5_2 {
    public static void main(String[] args) {

        String table = "";
        for(int i = 1; i <= 12; i ++) {
            table = table + i + "  " + i * i + "  " + i * i * i + "\n";
        }
        System.out.println(table);
    }
}
