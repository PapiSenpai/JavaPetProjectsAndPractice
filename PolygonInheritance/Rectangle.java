package PolygonInheritance;

public class Rectangle extends Polygon {

    public Rectangle(int height, int width) {
        super(height, width);
        // invoke superclass
    }

    public double area() {
        return (height * width);
    }
}
