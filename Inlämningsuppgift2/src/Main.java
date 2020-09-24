import java.io.*;

/**
 * Created by Toshiko Kuno <br>
 * Date: 2020-09-05 <br>
 * Time: 10:00 <br>
 * Project: Inlämningsuppgift2 <br>
 * Copyright: MIT <br>
 */
public class Main {
    /**
     * Skapa en frekvenstabell över tärningskast <br>
     * Generera textfilen med hjälp av metoden createFile() <br>
     * Skapa en array baserad på textfilen med hjälp av metoden createArray() <br>
     * Analysera den stora arrayen och få tillbaka en liten array som innehåller statistik över <br>
     * resultatet med hjälp av metoden analyzeArray() <br>
     * Skriv ut en sammanställning över resultatet i terminalen <br>
     * Skicka även resultatet till en textfil <br>
     *
     * @param args
     */
    public static void main(String[] args){
        Dice.createFile();
        int[] dice = Dice.analyzeArray(Dice.createArray());
        String result = "------------Frekvenstabell---------------\n" + "1: " + dice[0] + "\n2: " + dice[1] + "\n3: " + dice[2] + "\n4: " + dice[3] + "\n5: " + dice[4] + "\n6: " + dice[5];
        System.out.println(result);

        try (PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("result.txt")))) {
            ut.println(result);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
