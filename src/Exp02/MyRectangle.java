package Exp02;

public class MyRectangle implements ShapeArea {
    private double width;
    private double height;

    public MyRectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        double perimeter = getPerimeter();
        double area = getArea();
        return "width=" + width + ", height=" + height + ", perimeter=" + perimeter + ", area=" + area;
    }
}
