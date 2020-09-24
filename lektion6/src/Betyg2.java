import java.io.*;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-09
 * Time: 10:49
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Betyg2 {
    public static void main(String[] arg) throws IOException {
        // Skapa en ström från kommandofönstret



        Scanner in = new Scanner(new File("nameList.txt"));
        PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")));

        // Läs resultatfilen och skriv ut de godkända eleverna
        while (in.hasNext()) {
            String rad1 = in.next();   // läs namnet
           while(in.hasNextInt()) {
               // rad1 += "hej: " + in.next();
               //System.out.println(rad1);
               int point = in.nextInt();
               if (point >= 50) ut.println(rad1 + " " + point);
           }
            //String rad2 = inström.readLine();   // läs poängen
            //System.out.println(rad2);
            //int poäng = Integer.parseInt(rad2);
            //f (poäng >= 50)   // godkänd?
              //  utström.println(rad1 + " " + poäng);
        }
        ut.close();
    }
}
