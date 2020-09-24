/**
 * Created by Toshiko Kuno
 * Date: 2020-09-14
 * Time: 10:43
 * Project: IntelliJ IDEA
 * Copyright: MIT
 * <br><br>
 *  Klassen Dog är en subklass som beskriver en hund
 */


public class Dog extends Animal {

    private String breed;

    public void bark() {
        System.out.println("I can bark");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed != null)
        this.breed = breed;
        else throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                getBreed() +'}';
    }

    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
}
