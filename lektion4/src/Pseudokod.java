/**
 * Created by Toshiko Kuno
 * Date: 2020-08-29
 * Time: 16:07
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Pseudokod {
    /**
     * 1. Beskriv i pseudokod en algoritm som läser in 5 tal och som
     * beräknar och skriver ut medelvärdet av de inlästa talen.
     * 2. Skapa ett program som implementera pseudokoden.
     * 3. OBS! Du behöver inte läsa in 5 tal ”på riktigt”.
     * Skapa testkod med 5 olika variabler istället.
     * @param args
     */
    public static void main(String[] args) {

        String input = "1,6,8,10,12";
        String[] a = input.split(",");
        double average = 0;
        for (int i = 0; i < a.length; i ++) {
        System.out.println(a[i]);
         average = average + Integer.parseInt(a[i]);
        }
        average = average / a.length;

        System.out.println("Average: " + average);
    }
}
