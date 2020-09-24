import java.util.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-11
 * Time: 17:02
 * Project: UppgiftVg
 * Copyright: MIT
 */

/**
 * Klasse Play är en subklass som kör spelprogrammet.
 */
public class Play extends Player {

    //Lagt till final för att inte går att ändra värde
    private final int rock = 0;
    private final int scissors = 1;
    private final int paper = 2;
    private final int exit = 3;
    private final String[] c = {"Sten", "Sax", "Påse"};

    private final int lose = 0;
    private final int draw = 1;
    private final int win = 2;
    private final String[] resultSymbols = {"\u274C", "\uD83D\uDD3A", "\u2B55"}; //X, △, O


    private int userChoice;
    private int computerChoice;
    private final List<String> userPoints = new ArrayList<>();
    private final List<String> computerPoints = new ArrayList<>();
    private int result;

    /**
     * Anropa instansmetoder i en konstruktor. <br>
     * Spelet kommer fortsätta tills användaren avslutar programmet. <br>
     * <br><br>
     * steg1: Fråga efter välja en av tre symboler <br>
     * steg2: Generera datorval <br>
     * steg3: Visa de båda valet <br>
     * steg4: Bedöma om användarens val <br>
     * steg5: Sätta resultatet i båda användare och datorer poänglistan <br>
     * steg6: Visa spelresultat <br>
     * <br><br>
     * När användare avslutar programmet <br>
     * steg7: Visa tabellen som visas hela spelresultat
     */
    public Play() {
        while (true) {
            inputUserChoice();
            if (userChoice == exit) break;
            generateComputerChoice();
            outputChoices();
            judgeChoices();
            addPoints();
            outPutMessage(result);
        }
        outPutMessage(userPoints, computerPoints);
    }


    /**
     * Visa 4 olika alternativ som användare skall kunna välja.<br>
     */
    public void outPutMessage() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\nDu frå välja ett nummer" + ConsoleColors.PURPLE_BOLD +
                "\n0:Sten\t1:Sax\t2:Påse\t3:Avslut");
    }

    /**
     * Visa meddelande med användares spelresultat. <br>
     *
     * @param result int 0 = lose, 1 = draw, 2 = win <br>
     */
    public void outPutMessage(int result) {
        switch (result) {
            case lose -> showResultMessage("Du förlorar");
            case draw -> showResultMessage("Det är oavgjort");
            case win -> showResultMessage("Du vinner");
        }
    }

    /**
     * Om inte användare spelat alls då visas meddelande :  "Hoppas du spelar på nästa gång! Välkommen åter". <br>
     * Annars räkna ut och visa hur många gånger spelat, vunnit, förlorat och blivit oavgjort.<br>
     * Visa varsin hela spelresultat med dem symboler △,◯,X. <br>
     *
     * @param userPoints     användare listan som innehåller △|△|◯|◯| <br>
     * @param computerPoints datorns listan som innehåller △|△|X|X| <br>
     */
    public void outPutMessage(List<String> userPoints, List<String> computerPoints) {
        System.out.println(ConsoleColors.BLUE_BOLD + "------------------------------Tack för att du kom " + player + "-------------------------------------------\n");
        if (userPoints.size() == 0)
            System.out.println(ConsoleColors.CYAN + "Hoppas du spelar på nästa gång!");
        else {
            System.out.println(ConsoleColors.CYAN + "Du har spelat " + userPoints.size() + " gånger");

            int winCount = 0;
            int loseCount = 0;
            int drawCount = 0;
            System.out.print(ConsoleColors.GREEN_BOLD + player + ": \t");
            for (String point : userPoints) {
                System.out.print(point + "|");
                if (point.contains(resultSymbols[lose]))
                    loseCount++;
                else if (point.contains(resultSymbols[win]))
                    winCount++;
                else if (point.contains(resultSymbols[draw]))
                    drawCount++;
            }

            System.out.print("\nDatorn: \t");
            for (Object obj : computerPoints) System.out.print(obj + "|");

            System.out.println(ConsoleColors.CYAN + "\nDu har vunnit " + winCount + " gånger.\t Du har förlorat " + loseCount + " gånger.\t Oavgjort " + drawCount + " gånger\n");
        }
        System.out.println(ConsoleColors.RED_BRIGHT + "Välkommen åter");
    }

    /**
     * Visa meddelande som 4 olika alternativ som användare skall kunna välja. <br>
     * Läs in användarens val. <br>
     * Om användare trycker på cmd + D då avslutas programmet. <br>
     * Kontrollera värdet som användare valt genom att anropa controlInputUserChoice() instansmetoden. <br>
     * Fortsätta att fråga efter medan användare matar in felaktig. <br>
     *
     */
    public void inputUserChoice() {
        while (true) {
            outPutMessage();
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String choice = scanner.nextLine();
                if (controlInputUserChoice(choice))
                    break;
            } else {
                outPutMessage(userPoints, computerPoints);
                System.exit(0);
            }
        }
    }

    /**
     * Kontrollera värdet som användare matat in.<br>
     * Sätta användarens val som nummer(0-2) i instansvariabel userChoice. <br>
     * Att visa felmeddelande anrop showErrorMessage() instansmetoder <br>
     * för att kunna lägga till färgen på felmeddelande i terminalen. <br>
     * @param choice Det värde som användare matat in
     * @return bool sant eller falsk
     */
    public boolean controlInputUserChoice(String choice) {
        choice = choice.trim();
        if (choice.length() == 0 || choice == " ") {
            showErrorMessage("Du har inte valt ett nummer. Du måste välja ett nummer");
            return false;
        }

        try {
            this.userChoice = Integer.parseInt(choice);
        } catch (Exception e) {
            showErrorMessage("Felaktig inmatning. Måste vara ett giltiga nummer");
            return false;
        }

        if (exit < this.userChoice || rock > this.userChoice) {
            showErrorMessage("Ogiltigt nummer!! Du måste välja ett nummer");
            return false;
        }

        return true;
    }


    /**
     * Generera slumpmässig heltal mellan 0-2.<br>
     * Sätta slumpmässig tal i instansvariable computerChoice. <br>
     */
    public void generateComputerChoice() {
        Random random = new Random();
        computerChoice = random.nextInt(3);
    }

    /**
     * Visa de båda valet
     */
    public void outputChoices() {
        System.out.println(ConsoleColors.CYAN + player + ": " + ConsoleColors.GREEN_BOLD + c[userChoice] +
                ConsoleColors.CYAN + "\nDatorn: " + ConsoleColors.GREEN_BOLD + c[computerChoice]);
    }

    /**
     * Bedöma om användarens val.<br>
     * Sätta resultat i instansvariable result. <br>
     */
    public void judgeChoices() {
        if (computerChoice == userChoice) result = draw;
        else if (computerChoice == rock && userChoice == scissors) result = lose;
        else if (computerChoice == rock && userChoice == paper) result = win;
        else if (computerChoice == scissors && userChoice == rock) result = win;
        else if (computerChoice == scissors && userChoice == paper) result = lose;
        else if (computerChoice == paper && userChoice == rock) result = lose;
        else if (computerChoice == paper && userChoice == scissors) result = win;
    }

    /**
     * Lägga till varsin resultatet i båda användare och datorer poänglistan. <br>
     */
    public void addPoints() {
        switch (result) {
            case lose:
                userPoints.add(resultSymbols[lose]);
                computerPoints.add(resultSymbols[win]);
                break;
            case win:
                userPoints.add(resultSymbols[win]);
                computerPoints.add(resultSymbols[lose]);
                break;
            case draw:
                userPoints.add(resultSymbols[draw]);
                computerPoints.add(resultSymbols[draw]);
                break;
        }
    }

    /**
     * Lägga till färg på meddelande i terminalen. <br>
     * @param message string result meddelande <br>
     */
    public void showResultMessage(String message) {
        System.out.println(ConsoleColors.RED_BRIGHT + message);
    }

    /**
     * Lägga till färg på felmeddelande i terminalen. <br>
     * @param message string felmeddelande <br>
     */
    public void showErrorMessage(String message) {
        System.out.println(ConsoleColors.RED_BOLD + message);
    }

}
