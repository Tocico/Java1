import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // Övning 1.6
        JOptionPane.showMessageDialog(null, "Toshiko");
        JOptionPane.showMessageDialog(null, "0733286333");

        // Övning 1.7
        JOptionPane.showMessageDialog(null,"Hej");
        Toolkit.getDefaultToolkit().beep();

        // Övning 1.8
        JOptionPane.showMessageDialog(null, "Du kör" + System.getProperty("os.name") + "idag");

        // Övning 1.9
        JOptionPane.showMessageDialog(null, "Namn: Toshiko" + "\nAddress: kunotoshiko17@gmail.com" + "\nTel: 0733286333" );

        //Uppgift 1.1
        Calendar.getInstance().getTime().toString();
        JOptionPane.showMessageDialog(null, "Datum och tid\n" + Calendar.getInstance().getTime().toString());

        //Uppgift 1.2
        JOptionPane.showMessageDialog(null, null,"Information" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, null, "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, null, "Fel", JOptionPane.ERROR_MESSAGE);
    }
}


