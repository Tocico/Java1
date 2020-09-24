import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ange ditt namn: ");
        String text = scan.nextLine();
        System.out.println("Välkommen " + text);

        System.out.println("Ange ett heltal: ");
        int heltal = scan.nextInt();
        System.out.println("Ditt tal är: " + heltal);

        System.out.println("Ange ett decimaltal: ");
        double decimaltal = scan.nextDouble();
        System.out.println("Ditt tal är: " + decimaltal);

        String input = JOptionPane.showInputDialog("Ange några heltal");
        Scanner scanner = new Scanner(input);
        int sum = 0;
        while(scanner.hasNextInt())
            sum += scanner.nextInt();
        System.out.println("Summan av alla tal är : " + sum);

        while (true){
            try{
                System.out.println("Ange ett decimaltal: ");
                decimaltal = scan.nextDouble();
                System.out.println("Ditt tal är: " + decimaltal);
                break;
            }catch (InputMismatchException e){
                System.out.println("Felaktig inmatning");
                scan.next();
            }
        }
        System.out.println(decimaltal);
    }
}
