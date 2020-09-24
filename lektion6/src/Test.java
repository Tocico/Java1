import javax.swing.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-03
 * Time: 14:45
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Test {
    public static int searchFor(String s, String search, int start) {
        for (int i = start; i < s.length(); i++)
            if (search.indexOf(s.charAt(i)) >= 0)
                return i;
        return -1;
    }

    /**
     * en metod för att utskriva ett felmeddelande och slinga inom en "loop"
     *
     * @param e exceptions namn
     */
    public static boolean errorResponse(Exception e) {
        System.out.println( e  + "\n");
        return true;
    }

    /**
     * En enkel miniräknare som beräknar enligt kravspecifikationen
     * -Uttrycket får inte vara tomt
     * -Uttrycket måste innehålla en av följande operatorer: +, -, *, /
     * -Uttrycket måsteinnehålla två operander och en operator.
     * -Man får inte dividera med 0
     *
     * @param args
     */
    public static void main(String[] args) {
        //TODO:Förenkla och organisera.
        String nr1String, nr2String, input;
        int operatorIndex;
        char operator = ' ';
        double nr1 = 0, nr2 = 0;
        double result = 0;
        boolean error;
        while (true) {
            error = false;
            input = JOptionPane.showInputDialog("Skriv ett enkel matematiskt uttryck");
            if (input == null)
                System.exit(0);
            operatorIndex = searchFor(input, "/*-+", 1);

            try {
                operator = input.charAt(operatorIndex);
                nr1String = input.substring(0, operatorIndex);
                nr2String = input.substring(operatorIndex + 1);
                nr1 = Double.parseDouble(nr1String);
                nr2 = Double.parseDouble(nr2String);
                if (operator == '/' && nr2 == 0)
                    result = 1 / 0;
            } catch (StringIndexOutOfBoundsException e) {
                error = errorResponse(e);
            } catch (NumberFormatException e) {
                error = errorResponse(e);
            } catch (ArithmeticException e) {
                error = errorResponse(e);
            }
            if (error == false)
                break;
            else {
                System.out.println("Komma ihåg:\n     * -Uttrycket får inte vara tomt\n" +
                        "     * -Uttrycket måste innehålla en av följande operatorer: +, -, *, /\n" +
                        "     * -Uttrycket måsteinnehålla två operander och en operator.\n" +
                        "     * -Man får inte dividera med 0");
            }
        }
        switch (operator) {
            case '+' -> result = nr1 + nr2;
            case '-' -> result = nr1 - nr2;
            case '*' -> result = nr1 * nr2;
            case '/' -> result = nr1 / nr2;
        }

        JOptionPane.showMessageDialog(null, "Result:" + result);
    }

}

