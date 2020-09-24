import java.util.Scanner;

/**
 * Created by Toshiko Kuno <br>
 * Date: 2020-09-12 <br>
 * Time: 09:01 <br>
 * Project: UppgiftVG <br>
 * Copyright: MIT <br>
 */

/**
 * Klassen Player är superklass som sparar spelare <br>
 * Visa instruktion om spel <br>
 */

public class Player {
    protected String player;

    /**
     * Anropa instansmetoder i en konstruktor. <br>
     */
    public Player() {
        setPlayer();
        instructions();
    }

    /**
     * Användare matar in sitt namn <br>
     * Fråga efter användarnamn tills användare matar in. <br>
     * Sätta spelarnamn <br>
     */
    public void setPlayer() {
        while (true) {
            System.out.println(ConsoleColors.BLUE_BOLD + "Skriv ditt namn:)");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                name = name.trim();
                if (name.isEmpty() || name == "") continue;
                else {
                    player = name;
                    break;
                }
            } else System.exit(0);
            scanner.close();
        }
    }

    /**
     * Visa spel instruktion
     */
    public void instructions() {
        System.out.println(ConsoleColors.CYAN_BOLD + "-----------------------Välkommen "
                + ConsoleColors.GREEN_BOLD + player
                + ConsoleColors.CYAN_BOLD +
                " till spelet sten, sax, påse-------------------------" +
                "\nNu skall du spela spelet sten, sax och påse mot datorn" +
                "\nDu får välja en av sten, sax eller påse" +
                "\nOBS!! Om båda spelarna visar samma tecken blir det oavgjort" +
                "\nNär du avslutar programmet då visas vinsttabellen");
    }
}
