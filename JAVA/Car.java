package JavaActivity1;

public class Car {
	//Properties
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    
    //constructor
    public void car() {
   	 tyres = 4; 
   	 doors = 4;
    }
    
    //Class Method
    public void displaycharacterstics() {
   	 System.out.println("color of the car: " + color);
   	 System.out.println("make of the car: " + make);
   	 System.out.println("Transmission of the car:" + transmission);
   	 System.out.println("Number of doors on the car :" + doors);
    }
    
    public void accelerate() {
   	 System.out.println("Car is moving forward.");
    }
    public void brake() {
   	 System.out.println("Car has stopped.");
    }
}
