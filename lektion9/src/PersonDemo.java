/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 11:02
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Toshiko", "");
        //System.out.println(p1.firstName + " " + p1.lastName);

        p1.setName("Taeko Kuno");
        //System.out.println(p1.firstName + "" + p1.lastName);

        System.out.println(p1.toString());

        System.out.println(p1.getFirstName());

        //Arbeta med konstruktor
        Person p3 = new Person("Toshiko", "Kuno");

        System.out.println("Konstruktor: " + p3);

        Person p4 = new Person("Kalle Anka");
        System.out.println("Konstruktor med en parameter: " + p4);

    }
}
