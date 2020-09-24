import javax.swing.*;

public class Dialog {
    public static void main(String[] args) {

        String name;
        String message;

        name = JOptionPane.showInputDialog("Ange ditt namn!");
        message = "Välkommen " + name;

        JOptionPane.showMessageDialog(null, message);

        // TODO: 2019-10-12 Hämta belopp


    }
}
