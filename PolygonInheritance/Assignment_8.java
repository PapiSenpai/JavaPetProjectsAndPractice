/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Polygon Inheritance
*/

package PolygonInheritance;

// This Project will implement Inheritance

// Driver class
public class Assignment_8 {
    public static void main(String[] args){
        // Making rectangle and Triangle objects
        // try to make it as if someone inputs the information
        Rectangle rec = new Rectangle(25, 12);
        Triangle tri = new Triangle(12, 54);
        


        // output
        System.out.println("The height of the Rectangle is: " + rec.get_height());
        System.out.println("The width of the Rectangle is: " + rec.get_width());
        System.out.println("The total area of the Rectangle is:" + rec.area());
        // output
        System.out.println("The height of the Triangle is: " + tri.get_height());
        System.out.println("The width of the Triangle is: " + tri.get_width());
        System.out.println("The total area of the Triangle is:" + tri.area());

    }

}
