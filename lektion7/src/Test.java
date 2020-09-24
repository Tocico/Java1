import javax.swing.*;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-08
 * Time: 14:00
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Test {
    public static void main(String[] args) {
        //Initialize "input" for testing
        String input;
        int operatorPosition;
        double firstOperand = 0, secondOperand;

        //Run until valid input is provided
        while (true) {
            boolean isValidFirstOperand = false;

            //Take input, exit program if the user cancels
            input = JOptionPane.showInputDialog("Skriv in ett uttryck: ");

            //User chose not to input any data, close the program
            if (input == null || input.equals(""))
                System.exit(0);

            //Make decimalnumbers using "," valid
            input = input.replace(',', '.');

            //Find the position of the operator. Return -1 if not found.
            operatorPosition = findOperator(input);

            if (operatorPosition == -1) {
                //Testcode
//                System.out.println("Inmatningsfel: Operator saknas eller är ogiltig. Försök igen.");
                printDialog("Inmatningsfel: Operator saknas eller är ogiltig.");
            } else if (operatorPosition == 0)
                //Testkod
//                System.out.println("Inmatningsfel: Operand 1 saknas.");
                printDialog("Inmatningsfel: Operand 1 saknas.");

                //Valid operator found. Now check that the operands are valid.
            else {
                /*
                Try to parse the first operand into a double.
                If successful, flag it as valid, otherwise print error message.
                */
                String firstOperandSubstring = input.substring(0, operatorPosition);
                try {
                    firstOperand = Double.parseDouble(firstOperandSubstring);
                    isValidFirstOperand = true;
                } catch (NumberFormatException e) {
                    //Testcode
//                    System.out.printf("Inmatningsfel: Operand 1 \"%s\" är inte giltig. \n", firstOperandSubstring);
                    printDialog("Inmatningsfel: Operand 1 \"" + firstOperandSubstring + "\" är inte giltig.");
                }

                /*
                Try to parse the second operand into a double.
                If successful, check that the first operand was also valid, then break the loop.
                Otherwise, print error message.
                */
                String secondOperandSubstring = input.substring(operatorPosition + 1);
                try {
                    secondOperand = Double.parseDouble(secondOperandSubstring);
                    if (input.charAt(operatorPosition) == '/' && secondOperand == 0)
//                        System.out.println("Division med 0 är inte tillåtet!");
                        printDialog("Division med 0 är inte tillåtet!");
                    else if (isValidFirstOperand)
                        break;

                } catch (NumberFormatException e) {
                    //Testcode
                    if (secondOperandSubstring.equals("")) {
//                        System.out.println("Inmatningsfel: Operand 2 saknas.");
                        printDialog("Inmatningsfel: Operand 2 saknas.");
                    } else {
//                        System.out.printf("Inmatningsfel: Operand 2 \"%s\" är inte giltig. \n", secondOperandSubstring);
                        printDialog("Inmatningsfel: Operand 2  \"" + secondOperandSubstring + "\" är inte giltig.");
                    }
                }
            }
        }

        //Testcode
//        System.out.println("Det blir " + calculate(operator, firstOperand, secondOperand));
        printDialog("Det blir " + calculate(input.charAt(operatorPosition), firstOperand, secondOperand));


    }

    /**
     * Quicker and easier way of printing to a dialog window.
     *
     * @param s string The string to be printed
     */
    private static void printDialog(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    /**
     * Finds the position of the operator in a string.
     *
     * @param input string The string to be searched
     * @return int The position of the operator, if it exists. Otherwise, return -1
     */
    private static int findOperator(String input) {
        //Define valid operators
        String allowedOperators = "+-*/";

        /*
        For each character, check if it exists in the allowed operators string. The first character is skipped since
        it could be part of the first operand instead.
        */
        for (int i = 1; i < input.length(); i++) {
            if (allowedOperators.indexOf(input.charAt(i)) != -1)
                return i;
        }
        //If no operator was found, position 0 is checked. Return -1 if there is still no operator found.
        return (allowedOperators.indexOf(input.charAt(0)) != -1) ? 0 : -1;
    }

    /**
     * Performs mathematical calculations based on the provided operator and operands
     *
     * @param operator      char The type of operation to be carried out. Must be one of +-/*.
     * @param firstOperand  double The first operand
     * @param secondOperand double The second operand
     * @return double The result of the calculation
     */
    private static double calculate(char operator, double firstOperand, double secondOperand) {
        return switch (operator) {
            case '+' -> firstOperand + secondOperand;
            case '-' -> firstOperand - secondOperand;
            case '*' -> firstOperand * secondOperand;
            case '/' -> firstOperand / secondOperand;

            default -> throw new IllegalArgumentException();
        };
    }
}
