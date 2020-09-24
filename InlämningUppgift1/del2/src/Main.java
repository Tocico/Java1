import javax.swing.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-1
 * Time: 15:24
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

public class Main {
    /**
     * Skapa en enkel miniräknare
     * Läsa in ett matematiskt uttryck
     * Medan man skriver ogiltiga uttyck då visas felmeddelanden
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        String operator = "+-*/";
        String input = "";


        while (true) {
            //Test
            input = "";
            input = "3%2";
            input = "23456";
            input = "-4*9-2";
            input = "7/0";
            input = "4*";
            input = "-4*-7";

            input = JOptionPane.showInputDialog(null, "Skriv ett matematiskt uttryck\n T.ex 1+2 , 200-100 , 2*5 , 10/2.\nAnvänd en av följande operatorer: +, -, *, /");

            if (input == null) break;
            else {
                input = input.trim();
                if (input.isEmpty() || input.length() == 0)
                    System.out.println("Uttrycket får inte vara tomt. Skriv ett matematiskt uttryck igen.\n-----------------------------------------------------------");
                else if (!checkUnusableCharacters(input, operator))
                    System.out.println("Det finns ogiltiga tecken! Skriv ett matematiskt uttryck igen.\n-----------------------------------------------------------");
                else if (countOperator(input, operator) == 0)
                    System.out.println("Det finns inga operator! Skriv ett matematiskt uttryck med en giltig operator.\n-----------------------------------------------------------");
                else if (countOperator(input, operator) >= 2) {
                    try {
                        int operatorIndex = findOperatorIndex(input, operator);
                        Double lastAbsValue = Double.parseDouble(input.substring(operatorIndex + 1));
                        if (input.charAt(operatorIndex) == '/' && lastAbsValue == -0) {
                            System.out.println("Du får inte dividela med -0! Skriv ett matematiskt uttryck igen.\n-----------------------------------------------------------");
                            continue;
                        } else {
                            double result = calculate(input, operatorIndex);
                            JOptionPane.showMessageDialog(null, "------------------Resultatet------------------\n" + result);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Du har skrivit flera operator. Skriv ett matematiskt uttryck med en giltig operator.\n-----------------------------------------------------------");
                        continue;
                    }
                } else if (countOperator(input, operator) == 1) {
                    try {
                        int operatorIndex = findOperatorIndex(input, operator);
                        input.charAt(operatorIndex - 1);
                        char lastAbsValue = input.charAt(operatorIndex + 1);
                        if (input.charAt(operatorIndex) == '/' && lastAbsValue == '0') {
                            System.out.println("Du får inte dividela med 0! Skriv ett matematiskt uttryck igen.\n-----------------------------------------------------------");
                            continue;
                        } else {
                            double result = calculate(input, operatorIndex);
                            JOptionPane.showMessageDialog(null, "------------------Resultatet------------------\n" + result);
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Det saknar operand! Skriv ett matematiskt uttryck igen.\n-----------------------------------------------------------");
                        continue;
                    }
                }
            }
        }
    }

    /**
     * Kolla om alla tecken är giltiga
     *
     * @param mathExpression t.ex "-3 * 5"
     * @param searching      +,-,*,/
     * @return Sant eller falsk
     */
    public static boolean checkUnusableCharacters(String mathExpression, String searching) {
        int usableCharactersCount = 0;
        for (int i = 0; i < mathExpression.length(); i++) {
            if (searching.indexOf(mathExpression.charAt(i)) >= 0 || Character.isDigit(mathExpression.charAt(i)) || mathExpression.charAt(i) == '.')
                usableCharactersCount++;
            else usableCharactersCount--;
        }
        return (usableCharactersCount != mathExpression.length()) ? false : true;
    }

    /**
     * Räknar hur många operator finns i matematiskt uttrycket
     *
     * @param mathExpression t.ex "-3 * 5"
     * @param searching      +,-,*,/
     * @return Antalet av operator
     */
    public static int countOperator(String mathExpression, String searching) {
        int countOperator = 0;
        for (int i = mathExpression.charAt(0) == '-' ? 1 : 0; i < mathExpression.length(); i++)
            if (searching.indexOf(mathExpression.charAt(i)) >= 0)
                countOperator++;
        return countOperator;
    }

    /**
     * Letar efter index av operator finns i matematiskt uttrycket
     *
     * @param mathExpression t.ex "-3 * 5"
     * @param searching      +,-,*,/
     * @return Index av operator
     */
    public static int findOperatorIndex(String mathExpression, String searching) {
        for (int i = mathExpression.charAt(0) == '-' ? 1 : 0; i < mathExpression.length(); i++)
            if (searching.indexOf(mathExpression.charAt(i)) >= 0)
                return i;
        return -1;
    }

    /**
     * Hitta första och sista siffror
     * Hitta operator
     * Bärknar de matematiska uttrycket
     *
     * @param mathExpression t.ex "-3 * 5"
     * @param operatorIndex  index av operator
     * @return Beräkningsresultat
     */
    public static double calculate(String mathExpression, int operatorIndex) {
        double firstAbsValue = Double.parseDouble(mathExpression.substring(0, operatorIndex));
        double lastAbsValue = Double.parseDouble(mathExpression.substring(operatorIndex + 1));
        char operator = mathExpression.charAt(operatorIndex);

        double result = 0;
        switch (operator) {
            case '+':
                result = firstAbsValue + lastAbsValue;
                break;
            case '-':
                result = firstAbsValue - lastAbsValue;
                break;
            case '*':
                result = firstAbsValue * lastAbsValue;
                break;
            case '/':
                result = firstAbsValue / lastAbsValue;
                break;

        }
        return result;
    }

}
