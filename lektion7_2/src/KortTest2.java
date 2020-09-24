/**
 * Created by Toshiko Kuno
 * Date: 2020-09-08
 * Time: 15:10
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class KortTest2 {
    public static void main(String[] arg) {
        Kortbunt b1 = new Kortbunt();
        int i, val;
        for (val=1, i=0; val<=13; val++, i++) {
            b1.bunten[i] = new Kort();
            b1.bunten[i].färg = Kort.KLÖVER;
            b1.bunten[i].valör = val;
            b1.antal++;
        }

        Kortbunt b2 = new Kortbunt();
        int f;
        for (f=Kort.HJÄRTER, i=0; f<=Kort.SPADER; f++) {
            for (val=11; val<=13; val++, i++) {
                b2.bunten[i] = new Kort();
                b2.bunten[i].färg = f;
                b2.bunten[i].valör = val;
                b2.antal++;
            }
        }

        // Testutskrift
        String [] fnamn = {"Kl", "Ru", "Hj", "Sp"};
        System.out.println("Bunt 1:");
        for (int j=0; j<b1.antal; j++)
            System.out.println(fnamn[b1.bunten[j].färg] + b1.bunten[j].valör);
        System.out.println("Bunt 2:");
        for (int j=0; j<b2.antal; j++)
            System.out.println(fnamn[b2.bunten[j].färg] + b2.bunten[j].valör);
    }
}
