import javax.swing.*;
import java.util.Calendar;
import java.util.jar.JarOutputStream;

/**
 * Created by Toshiko Kuno
 * Date: 2020-08-25
 * Time: 17:04
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Main {
    public static void main(String[] args) {
        int year = Calendar.getInstance().getWeekYear();
        String date = Calendar.getInstance().getTime().toString();
        String day = date.substring(8, 10);
        String month = date.substring(4, 7);

        switch (month) {
            case "Jan":
                month = "1";
                break;
            case "Feb":
                month = "2";
                break;
            case "Mar":
                month = "3";
                break;
            case "Apr":
                month = "4";
                break;
            case "May":
                month = "5";
                break;
            case "Jun":
                month = "6";
                break;
            case "Jul":
                month = "7";
                break;
            case "Aug":
                month = "8";
                break;
            case "Sep":
                month = "9";
                break;
            case "Oct":
                month = "10";
                break;
            case "Nov":
                month = "11";
                break;
            case "Dec":
                month = "12";
                break;
        }

        String newDate = year + "/" + month + "/" + day;

        String diary = JOptionPane.showInputDialog("" +
                "-------------Loggboken--------------" +
                "\nSkriv vad du har gjort idag\n");

        JOptionPane.showMessageDialog(null,
                newDate + "\n---------------------------------\n" +
                        diary + "\n---------------------------------\n" +
                        System.getProperty("user.name"));


    }
}
