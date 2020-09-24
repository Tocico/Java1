/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 09:36
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

/**
 * • Arbeta vidare med klassen Rectangle.
 * • Skapa en säker instansmetod som sätter bredden.
 * Kalla metoden setWidth()
 * • Skapa en säker instansmetod som beräknar omkretsen.
 * Kalla metoden perimeter()
 * • Skapa en säker instansmetod som beräknar arean.
 * Kalla metoden area()
 * • Testa alla metoder i main.
 */

public class RectangleDemo {
    public static void main(String[] args) {
        // Skapa ett antal av instanser av klassen Rectangle
        Rectangle r1 = new Rectangle(); // r1 är referensvariabel
        Rectangle r2 = new Rectangle(20,50);


        //Anropa instansmetoden

        try {
            r1.setWidth(100);
            r1.setHeight(200);
            r1.perimeter();
            r1.area();
            System.out.println(r1);
            System.out.println(r2.area());

            System.out.println(r1.perimeter());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
