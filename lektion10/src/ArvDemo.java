/**
 * Created by Toshiko Kuno
 * Date: 2020-09-14
 * Time: 10:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 *
 * <br><br>
 * Ett testprogram för att demostorera arv i java
 */


public class ArvDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.eat();
        a2.sleep();

        //Dog är en subklass
        //En hund ärver från Animal
        Dog d1 = new Dog();
        a1.sleep();
        d1.color = "green";
        d1.setBreed("Pudel");
        System.out.println(d1);


    }
}
