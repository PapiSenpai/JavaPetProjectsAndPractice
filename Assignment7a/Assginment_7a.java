/*
	Author: Juan Enriquez
	Class: CSC-18A
	Prof: Paul Conrad
	Project: Traffic Signal
*/
package Assignment7a;

// Used to retrive enum types from other files
import java.util.EnumSet;


public class Assginment_7a {
    public static void main(String[] args) {


        // OUTPUT
        System.out.printf("Traffic Signal Duration:\n");

        // For loop to output on screen
        for (TrafficSignal traffic : TrafficSignal.values()){
            System.out.printf("%10s Seconds: %s%n", traffic, traffic.getSeconds());
        }
    }



    
}