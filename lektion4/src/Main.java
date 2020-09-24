import javax.swing.*;

public class Main {
    /**
     *  programmet läser in en mening från en dialogruta.<br>
     *  Programmet räknar antalet blanka tecken i texten.<br>
     * @param args
     */

    public static void main(String[] args) {
        //Övning1: Räkna blanka tecken
        String input = "Litet text och annat smått och gott.";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '\t') count++;
        }

        System.out.println("Antal blanka tecken: " + count);

        //Övning2: Beräkna pengar i bankkonto
        int p = 2;
        int y = 5;
        double d = 1000;
        double percent = 1 + 0.01 * p;

        for (int i = 1; i <= y; i++) {
            d *= percent;
            System.out.println(i + " year: " + Math.round(d) + " kr");
        }

        //Övning3: 10,000,000

        int dag = 1;
        double lon = 0.01;
        double total = 0.01;

        while (total < 10000000) {
            dag++;
            lon *= 2;
            total = total + lon;
        }

        System.out.println(dag);

        String inRead;
        inRead = "hej  hej";
        int sC = 0;
        int sN = 0;
        while(sC != -1)
        {
            sC = inRead.indexOf(" ");
            System.out.println(sC);
            ++sN;
            inRead = inRead.substring(sC + 1);
            System.out.println("inRead: " + inRead.substring(sC + 1));
        }
        --sN;
        System.out.println(sN);

    }
}
