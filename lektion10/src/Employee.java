/**
 * Created by Toshiko Kuno
 * Date: 2020-09-14
 * Time: 11:29
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

/**
 * Skapa en subklass till Person som beskriver en anställd.
 * Spara klassen som Employee.
 * Subklassen ska ha nya egenskaper: befattning och lön
 * Skapa metoder som sätter och hämtar de nya egenskaperna.
 * Skapa en metod som höjer lönen för en anställd med 10%
 */

public class Employee extends Person {

    private String befattning;
    private double lön;

    public void setBefattning(String befattning) {
        this.befattning = befattning;
    }

    public String getBefattning() {
        return befattning;
    }

    public void setLön(double lön) {
        this.lön = lön;
    }

    public double getLön() {
        return lön;
    }

    public void höjaLön() {
        double nyLön = lön * 1.10;
        setLön(nyLön);
    }
}
