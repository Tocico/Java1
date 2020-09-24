/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 15:12
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Punkt {
    double x;
    double y;

    public Punkt() {}

    public Punkt(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double formeln() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public void flyttaHorisontellt(double d) {
        x = x + d;
    }

    public void flyttaVertikalt(double d) {
        y = y + d;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
