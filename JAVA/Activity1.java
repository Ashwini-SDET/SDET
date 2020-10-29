package JavaActivity1;

public class Activity1 {
	public static void main(String[] args) {
		Car toyota = new Car();
		toyota.make = 2014;
		toyota.color = "Black";
		toyota.transmission = "Manual";
		
		//using car class method
		
		toyota.displaycharacterstics();
		toyota.accelerate();
		toyota.brake();
	}

}
