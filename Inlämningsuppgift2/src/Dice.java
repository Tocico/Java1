import java.io.*;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno <br>
 * Date: 2020-09-05 <br>
 * Time: 09:55 <br>
 * Project: Imlämningsuppgift2 <br>
 * Copyright: MIT <br>
 */


/**
 * innehålla tre statiska metoder <br>
 */
public class Dice {
    /**
     * Skapa en textfil som innehåller 1000 slumpmässiga tal <br>
     */
    public static void createFile() {

        try (PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("randomDice.txt")))) {
            for (int i = 0; i < 1000; i++)
                ut.println((int) (Math.random() * 6) + 1);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    /**
     * Hämta 1000 slumpmässiga tal från textfil <br>
     * Lägga 1000 slumpmässiga tal i en array som har 1000 utrymmet <br>
     *
     * @return 1000 slumpmässiga tal i array <br>
     */
    public static int[] createArray() {
        var randomDiceArray = new int[1000];
        try {
            Scanner in = new Scanner(new File("randomDice.txt"));
            while (in.hasNextInt()) {
                for (int i = 0; i < randomDiceArray.length; i++)
                    randomDiceArray[i] = in.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return randomDiceArray;
    }

    /**
     * Loopa igenom 1000 slumpmässiga tal <br>
     * Räkna det hur många av varje siffrorna som finns i diceArray <br>
     * Sortera siffrorna i en ny array <br>
     *
     * @param diceArray 1000 slumpmässiga tal <br>
     * @return sorterade array <br>
     */
    public static int[] analyzeArray(int[] diceArray) {
        var randomDiceAnalyseArray = new int[6];

        for (int i = 0; i < diceArray.length; i++) {
            switch (diceArray[i]) {
                case 1 -> randomDiceAnalyseArray[0]++;
                case 2 -> randomDiceAnalyseArray[1]++;
                case 3 -> randomDiceAnalyseArray[2]++;
                case 4 -> randomDiceAnalyseArray[3]++;
                case 5 -> randomDiceAnalyseArray[4]++;
                case 6 -> randomDiceAnalyseArray[5]++;
            }
        }
        return randomDiceAnalyseArray;
    }
}
