import javax.swing.*;

public class Main {
    /**
     *
     * • Skapa en metod som har en text som parameter.
     * • Metoden returnerar texten baklänges!
     * • Testa metoden med olika texter.
     *
     * @param args
     */


    public static void main(String[] args) {
        String text = "Metoden returnerar texten baklänges";
        System.out.println( ConsoleColors.GREEN + textenBak(text) + ConsoleColors.RESET);
    }
    public static String textenBak(String txt) {
        String text = "";
        for (int i = txt.length() - 1; i >= 0 ; i--) {
            text = text + txt.charAt(i);
        }

        return text;
    }
}

class Character {
    /**
     *        1. I klassen Character hittar du en metod som heter isWhitespace()
     *      * Testa denna metod istället för vår isWhite-metod.
     *      * 2. Skapa en metod som räknar hur många gånger ett visst tecken
     *      * finns i en sträng.
     *      * Om man t.ex. har variabeln test av typen String och vill veta hur
     *      * många gånger bokstaven ’t’ förekommer i texten kan man skriva
     *      * String test = "Lite test text.";
     *      * int antal = Klassmetoder.antalTecken(test, 't');
     * @param args
     */
    public static void main(String[] args) {
        String test2 = "Lite test text.";
        int antal = antalTecken(test2, 't');
        System.out.println(antal + " \"" + 't' + "\"" + " tecken hittades");


       /* String test = "Text med ett antal blanka tecken";
        test = test.toLowerCase();
        int whiteSpaceCounter = 0;
        for (int i = 0; i < test.length(); i++) {
            if (isWhiteSpace(test.charAt(i)))
                whiteSpaceCounter++;
        }*/
        //System.out.println(whiteSpaceCounter + " blanka tecken hittades");
    }

    public static int antalTecken(String text, char t) {
        int counter = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == t)
                counter++;
        }
        return counter;
    }

    public  static boolean isWhiteSpace(char t) {
        return (t == ' ');
    }
}
