/**
 * Created by Toshiko Kuno <br>
 * Date: 2020-09-11 <br>
 * Time: 13:15 <br>
 * Project: InlämningsUppgift3 <br>
 * Copyright: MIT <br>
 */

/**
 * Skapa ett testprogram (klass som innehåller en main-metod). <br>
 * Skapa två olika objekt (instanser) av klassen Elevator. <br>
 * Testa alla instansmetoder. <br>
 * Om användare trycker ogiltig våning då ska programmet visas felmeddelande och avslutas <br>
 */
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("-------------------Hiss 1--------------------");
            Elevator e1 = new Elevator(0);

            //Test kod
            e1.goTo(10);
            System.out.println("Hissen är plan " + e1.where() + " just nu");
            e1.goTo(10);
            System.out.println("Hissen är plan " + e1.where() + " just nu");
            e1.goTo(6);
            System.out.println("Hissen är plan " + e1.where() + " just nu");
            e1.goTo(-2);
            System.out.println("Hissen är plan " + e1.where() + " just nu");
            e1.goTo(0);
            System.out.println("Hissen är plan " + e1.where() + " just nu");
            System.out.println("----------------------------------------------");

            System.out.println("-------------------Hiss 2--------------------");
            Elevator e2 = new Elevator(5);

            //Test kode
            e2.goTo(7);
            System.out.println("Hissen är plan " + e2.where() + " just nu");
            e2.goTo(3);
            System.out.println("Hissen är plan " + e2.where() + " just nu");
            e2.goTo(10);
            System.out.println("Hissen är plan " + e2.where() + " just nu");
            System.out.println("----------------------------------------------");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }


    }
}
