import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 14:12
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Dice {
    public static void createFile() {
        try (PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("slump_1000.txt", true)))) {
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                ut.println(rand.nextInt(6) + 1);
            }
            System.out.println("Filen har skapats");
        } catch (IOException e) {
            System.out.println("Fel1!: " + e.getMessage());// innehåller i arrayen är
        }
    }

    /**
     * läsa in textfilen som skapades med metoden createFile()
     * Inne i metoden lagras alla tal som hämtas från textfilen i ett fält,
     * en array som har 1000 platser
     *
     * @return array
     */
    public static String[] createArray() {
        String[] array = new String[1000];
        int i = 0;// index Nr
        try {
            File file = new File("slump_1000.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String num = null;
            i = 0;
            while (i < array.length) {//lägga ett och ett num i arrayen tills det blir null
                //System.out.println(i + ":" + num); //kolla slump tal mellan index 0-999
                if ((num = br.readLine()) != null) {
                    array[i] = num;
                    i++;
                } else break;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Fel!: " + e.getMessage());
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     * inparameter få in arrayen som skapas med hjälp av metoden createArray()
     * skapa en ny array som har storleken 6
     * Gå igenom alla tal som finns i den stora arrayen
     * lagra antal ettor, tvåor, threor, fyraor, femor, sexor
     * Metoden ska returnera denna array (storleken 6)
     *
     * @return array2
     */
    public static ArrayList<String> analyseArray() {
        ArrayList<String> array2 = new ArrayList<String>();
        //Arrays.stream(createArray()).collect(Collectors.groupingBy(s->s)).forEach((k,v)->
        //        System.out.println(k+": "+v.size()));
        //Man kan skriva ut map, Men det går inte att konvatera Map-->List
        //Det verkar Long är problem....
        Map<String, Long> map = Arrays.stream(createArray()).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Kontrollera resultatet: " + map);
        //ArrayList <String>array2= new ArrayList(map.values());//Map-->List
        //System.out.println(array2+"\narray_size: "+array2.size());
        //return array2;
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        int countFive = 0;
        int countSix = 0;
        try {
            for (int i = 0; i < createArray().length; i++) {
                if (createArray()[i].equals("1"))
                    countOne++;
                else if (createArray()[i].equals("2"))
                    countTwo++;
                else if (createArray()[i].equals("3"))
                    countThree++;
                else if (createArray()[i].equals("4"))
                    countFour++;
                else if (createArray()[i].equals("5"))
                    countFive++;
                else
                    countSix++;
            }
        } catch (Exception e) {
            System.out.println("Fel!: " + e.getMessage());
        }
        array2.add("Antal 1: " + countOne);
        array2.add("Antal 2: " + countTwo);
        array2.add("Antal 3: " + countThree);
        array2.add("Antal 4: " + countFour);
        array2.add("Antal 5: " + countFive);
        array2.add("Antal 6: " + countSix);
        //array2.add(String.valueOf(countSix));
        for (String eachNumTotal : array2)
            System.out.println(eachNumTotal);
        return array2;
    }

}
