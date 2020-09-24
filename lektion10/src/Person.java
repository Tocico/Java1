/**
 * Created by Toshiko Kuno
 * Date: 2020-09-14
 * Time: 11:29
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

/**
 * Skapa en klass Person som beskriver en person.
 * Definiera följande egenskaper: namn, adress och personnummer.
 * Skapa setters och getters.
 */
public class Person {
    private String namn;
    private String adress;
    private int personnummer;


    public void setNamn(String namn) {
        if(namn != null)
        this.namn = namn;
        else throw new NullPointerException();
    }

    public String getNamn() {
        return namn;
    }

    public void setAdress(String adress) {
        if(adress != null)
        this.adress = adress;
        else throw new NullPointerException();
    }

    public String getAdress() {
        return adress;
    }

    public void setPersonnummer(String personnummer) {
        if(personnummer != null)
            try {
                this.personnummer = Integer.parseInt(personnummer);
            }catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning");
            }
        else throw new IllegalArgumentException("Felaktig inmatning");
    }

    public int getPersonnummer() {
        return personnummer;
    }
}
