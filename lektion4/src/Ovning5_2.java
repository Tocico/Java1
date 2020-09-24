/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 11:59
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Ovning5_2 {
    public static void main(String[] args) {
        //Övning 5.6
        String input = "Letar efter det sista vita tecknet i en text";
        int i;
        for (i = input.length() - 1; i >= 0; i--)
            if (input.charAt(i) == ' ' || input.charAt(i) == '\t')
                break;
        if (i >= 0) {
            System.out.println("Sista vita tecken är " + i);
        } else {
            System.out.println("Inga vita tecken");
        }

        //Övning 5.7
        String tabell = "";
        for(int x = -10; x <= 10; x++ ){
            int sum = 2 * x * x - 5 * x + 1;
            tabell = tabell + x + "   " + sum + "\n";
        }
            System.out.println(tabell);

        //Övning 5.9
        int n = 10;
        String txt = "";
        for (int y=n; y>0; y--) {
            for (int j=1; j<=y; j++)
                txt = txt + '+';
            txt = txt + '\n';
        }

        for (int y = 1; y <= n; y++){
            for(int j = 1; j <= y; j++)
                txt = txt + '+';
                txt = txt + '\n';

        }
        System.out.println(txt);


    }
}
