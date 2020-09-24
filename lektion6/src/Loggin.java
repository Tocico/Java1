import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Toshiko Kuno
 * Date: 2020-09-09
 * Time: 10:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Loggin {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("loggin.txt"));

        int maxtid = 0;       // längsta tid hittills
        String maxNamn = "";  // namn på användaren
        while (sc.hasNext()) {
            String namn = sc.next();   // läs namnet
            System.out.println(namn);
            int tottid = 0;
            while (sc.hasNextInt())
                tottid = tottid + sc.nextInt();   // addera tiderna
            if (tottid > maxtid) {
                maxtid = tottid;
                maxNamn = namn;
            }
        }
        System.out.println(maxNamn + " har varit inloggad " + maxtid + " minuter");
    }
}
