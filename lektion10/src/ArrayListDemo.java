/**
 * Created by Toshiko Kuno
 * Date: 2020-09-15
 * Time: 10:04
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. Skapa en textfil som innehåller namn på ett antal personer.
 * Skriv ett namn på varje rad i filen.
 * Skriv minst en person som har efternamnet ”Al Hakim”.
 * 2. Skriv ett program som läser in alla namn och placerar dem i en lista.
 * 3. Programmet skall skriva ut alla namn i terminalen i omvänd ordning.
 * 4. Skriv ut hur många personer som finns i listan.
 * 5. Skriv ut hur många av dessa namn har efternamnet ”Al Hakim”.
 */

public class ArrayListDemo {

    public static void main(String[] args) throws IOException {
        try(PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")))) {

            ut.println("Toshiko");
            ut.println("Taeko");
            ut.println("Hitoshi");
            ut.println("Mahmud Al Hakim");
            ut.println("Ikuko");
            ut.println("Tsuyoshi Al Hakim");
        }catch (IOException e) {
            System.out.println(e);
        }

        Scanner in = new Scanner(new File("text.txt"));
        var names = new ArrayList<String>();

        while(in.hasNext()){
                names.add(in.nextLine());
            }

        Collections.reverse(names);

        for(String name: names)
            System.out.println(name);


        System.out.println(names.size());


       int count = 0;
        /*for (int i = 0; i < names.size(); i++) {
            int index = names.get(i).indexOf(" ");
            String getName = names.get(i).substring(index+1);
            if(getName.contains("Al Hakim")) count++;

        }*/

        for (String s : names) {
            if (s.contains("Al Hakim"))
            // Eller använd metoden indexOf
            // if (s.indexOf("Al Hakim") >= 0)
            count++;
        }

        System.out.println(count);
    }
}
