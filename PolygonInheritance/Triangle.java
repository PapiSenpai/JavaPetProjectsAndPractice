package PolygonInheritance;

public class Triangle extends Polygon{
    public Triangle(int height, int width) {
        super(height, width);
        // TODO Auto-generated constructor stub
    }

    public double area() {
        return ((height * width) / 2);
    }
}
