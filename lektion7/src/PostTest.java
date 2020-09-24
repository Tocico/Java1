/**
 * Created by Toshiko Kuno
 * Date: 2020-09-08
 * Time: 16:02
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class PostTest {
    public static void main(String[] arg) {
        Position GOT = new Position();  // Landvetter
        GOT.latGr = 57;  GOT.latMin = 39;  GOT.latSek = 47;  GOT.latNord = true;
        GOT.longGr = 12; GOT.longMin = 16; GOT.longSek = 58; GOT.longOst = true;

        Position ARN = new Position();  // Arlanda
        ARN.latGr = 59;  ARN.latMin = 24;  ARN.latSek = 52;  ARN.latNord = true;
        ARN.longGr = 17; ARN.longMin = 55; ARN.longSek = 18; ARN.longOst = true;
    }
}
