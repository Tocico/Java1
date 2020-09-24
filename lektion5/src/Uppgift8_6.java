/**
 * Created by Toshiko Kuno
 * Date: 2020-09-01
 * Time: 11:04
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Uppgift8_6 {
    public static void main(String[] args) {
        System.out.println(Info.visaInfo());
    }

}

class Info {
    public  static String visaInfo() {
        return System.getProperty("os.name");
    }
}


