package demo;


class Car {
	private String brand;
	private String color;

	// Constructor
     public Car(String brand, String color) 
     {
    	 this.brand = brand;
		 this.color = color;
     }

     // Getter methods
     public String getBrand() 
     {
    	 return brand;
     }

     public String getColor() 
     {
    	 return color;
     }

     // Method to display car information
     public void displayInfo() 
     {
    	 System.out.println("Brand: " + brand);
    	 System.out.println("Color: " + color);
     }
}

public class Constructor 
{
	public static void main(String[] args) 
	{
		// Creating objects of Car class
		Car car1 = new Car("Toyota", "Red");
		Car car2 = new Car("Honda", "Blue");
		
		// Accessing object properties
		System.out.println("Car 1 - Brand: " + car1.getBrand());
		System.out.println("Car 1 - Color: " + car1.getColor());
		
		System.out.println("---------------------------");

		System.out.println("Car 2 - Brand: " + car2.getBrand());
		System.out.println("Car 2 - Color: " + car2.getColor());
		
		System.out.println("---------------------------");
		
		// Calling object methods
		System.out.println("Car 1 Information:");
		car1.displayInfo();
		
		System.out.println("---------------------------");

		System.out.println("Car 2 Information:");
		car2.displayInfo();
	}

}


