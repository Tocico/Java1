/**
 * Created by Toshiko Kuno
 * Date: 2020-09-10
 * Time: 09:30
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
        //area();
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
        else throw new IllegalArgumentException("Negativ bredd");
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else throw new IllegalArgumentException("Negativ height");
    }

    public double perimeter() {
        return 2 * width + 2 * height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
