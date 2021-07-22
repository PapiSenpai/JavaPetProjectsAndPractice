package PolygonInheritance;
//subclass that gets the height and width of Triangle and Rectangle
public class Polygon {
    // feilds
    protected int height;
    protected int width;


    // Constructor 
    public Polygon(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void set_Value(int a, int b){
        height = a;
        width = b;
    }

 	// constructor
     public int get_height() {return height;}

     public int get_width() {return width;}
     
 

}
