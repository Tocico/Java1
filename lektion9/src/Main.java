import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args)  {
        Dice.createFile();
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("result.txt", true)))) {
            for(String result:Dice.analyseArray())
                pw.println(result);
        }catch (IOException e) {
            System.out.println("Fel!: " + e.getMessage());
        }
    }
}
