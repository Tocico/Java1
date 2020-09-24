import javax.swing.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	//Övning 2.8
        String a = "Programspråk";
        String b = a.substring(4,8) + a.charAt(5);

       JOptionPane.showMessageDialog(null, b);

    //Övning 2.9
        String c ="  Erik Andession 860314-2714  ";
        String d = c.trim();

        String birthDay = d.substring(19,21) + "/" + d.substring(17, 19);
       JOptionPane.showMessageDialog(null, birthDay);

    //Uppgift 2.1
        String date = Calendar.getInstance().getTime().toString();
        int i = date.indexOf(':');    // hämta index för första ':'
        String clock = "Klockan är: " + date.substring(i-2, i+6);

       JOptionPane.showMessageDialog(null, clock);

    //Uppgift 2.2
        String name = JOptionPane.showInputDialog("Skriv ditt efternamn, förnamn \n T,ex. kuno,toshiko");
        name = name.trim();
        String firstName = name.substring(name.indexOf(",")).toUpperCase();

       JOptionPane.showMessageDialog(null, "Hej " + firstName);

    //Uppgift 2.3
        String sentence = JOptionPane.showInputDialog("Skriv en mening med minst två ord");
        int words = sentence.length();
        sentence = sentence.trim();
        int firstSpaceIndex = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, firstSpaceIndex);
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        String lastWord = sentence.substring(lastSpaceIndex + 1);


        JOptionPane.showMessageDialog(null, "Du skrev en text med " + words + " tecken." +
                "\nDet första ordet var \"" + firstWord + "\"" +
                "\nDet sista ordet var \"" + lastWord + "\"");

    }
}
