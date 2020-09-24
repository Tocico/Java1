/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 10:56
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Person {
    //Instansvaribler
    private String firstName;
    private String lastName;

    //Konstruktorer

    public Person() { //Default konstruktor
        System.out.println("En ny person har skapats");
    }

    //Konstruktor med 2 parametorar
    public Person(String firstName, String lastName) {
        setName(firstName, lastName);
    }

    //Konstruktor med 1 parameter
    public Person(String name) {
        setName(name);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     public void setName(String firstName, String lastName) {

        if(firstName != null && lastName != null) {
            this.firstName = firstName;
            this.lastName = lastName;
        }else throw new NullPointerException("FEL: Null");
    }

    public void setName(String name) {
        int space = name.indexOf(" ");
        this.firstName = name.substring(0,space);
        this.lastName = name.substring(space + 1);

    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' ;
    }
}
