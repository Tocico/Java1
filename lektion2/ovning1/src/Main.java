import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Övning 2.1
        String name, address, tel, info;
        name = "Toshiko";
        address = "kunotoshiko17@gmail.com";
        tel = "0733286333";
        info = "Name: " + name +
                "\nAddress: " + address +
                "\nTel: " + tel;

        //JOptionPane.showMessageDialog(null, info);
        System.out.println(info);

        System.out.println("------------------------------------------------");

        //Övning 2.2
        String name2 = "Toshiko";
        String address2 = "kunotoshiko17@gmail.com";
        String tel2 = "0733286333";
        String info2 = "Name: " + name2 +
                      "\nAddress: " + address2 +
                      "\nTel: " + tel2;

        //JOptionPane.showMessageDialog(null, info2);
        System.out.println(info2);

        System.out.println("------------------------------------------------");

        //Övning 2.3
        /*Variabeldeklaration
                och
          Läs in namnet
         */
        String firstName = JOptionPane.showInputDialog("What is your first name ?");
        String lastName = JOptionPane.showInputDialog("What is your last name ?");

        //Bilda en hälsningtext
        String greeting = "Välkommen\n" + firstName + " " + lastName;

        //Skriv ut hälsningstexten
        JOptionPane.showMessageDialog(null, greeting);

    }
}
