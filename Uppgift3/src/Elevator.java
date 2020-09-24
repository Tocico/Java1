/**
 * Created by Toshiko Kuno <br>
 * Date: 2020-09-11 <br>
 * Time: 13:15 <br>
 * Project: InlämningsUppgift3 <br>
 * Copyright: MIT <br>
 * <hr>
 */

/**
 * Ange klassnamnet Elevator<br>
 * En hiss har en instansvariabel av typen int som heter level <br>
 * level lagrar aktuell plan (våning). <br>
 * Antal plan är begränsade från -2 till 10. <br>
 * Implementera nödvändiga felkontroller. <br>
 * <br><br>
 * En hiss har följande instansmetoder. <br>
 * 1) goTo är instansmetod som flyttar hissen. <br>
 * Exempel på användning (anrop) av metoden: <br>
 * goTo(5) ändrar våning (level) till 5 och visar meddelandet (i terminalen): ”Hissen åker upp till våning 5” om hissen befinner sig på våning -2 till 4, <br>
 * och ”Hissen åker ner till våning 5” om hissen befinner sig på en övre våning, samt ”Hissen står redan på våning 5” om hissen befinner sig på våning 5.<br>
 * 2) Metoden where() är instansmetod som returnerar ett heltal med våningsnumret (level).<br>
 */

public class Elevator {
    private int level;

    /**
     * Skapa en konstruktor som har en parameter som bestämmer aktuell plan. <br>
     * Man ska t.ex. kunna skapa en ny hiss som befinner sig på våning 5. <br>
     *
     * @param level int aktuell våning<br>
     */
    public Elevator(int level) {
            setLevel(level);
    }

    /**
     * Kontrollera våning<br>
     * Våning måste vara mella -2 till 10<br>
     * Sätta ny aktuella våning <br>
     *
     * @param level int aktuell våning <br>
     */
    public void setLevel(int level) {
        if (level >= -2 && level <= 10)
            this.level = level;
        else
            throw new IllegalArgumentException("Du har tryckt ogiltig våning");
    }

    /**
     * Hämta den aktuell våning <br>
     *
     * @return int aktuell våning <br>
     */
    public int getLevel() {
        return level;
    }

    /**
     * Jämför med den aktuell plan där man är och den våning som man vill åka till.<br>
     * Sen instansvariabel level får ett nytt värde<br>
     * Visa meddelandet på 4 olika sätt.<br>
     *
     * @param newLevel int den våning som man vill åka till<br>
     */
    public void goTo(int newLevel) {
        if (level < newLevel && newLevel <= 10) {
            System.out.println("Hissen åker upp till våning " + newLevel);
            setLevel(newLevel);
        } else if (level > newLevel && newLevel >= -2) {
            System.out.println("Hissen åker ned till våning " + newLevel);
            setLevel(newLevel);
        } else if (level == newLevel) {
            System.out.println("Hissen står redan på våning " + newLevel);
            setLevel(newLevel);
        } else throw new IllegalArgumentException("Du måste välja aktuell plan som är mellan -2 till 10.");
    }

    /**
     * Instansmetod som returnerar ett heltal med våningsnumret <br>
     *
     * @return int aktuell våning <br>
     */
    public int where() {
        return getLevel();
    }

}
