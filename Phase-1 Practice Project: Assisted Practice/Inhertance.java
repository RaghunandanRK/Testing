package AssistedPractice;

class Vehicle {
    void drive() {
        System.out.println("Driving the vehicle.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Honking the car horn.");
    }
}

class SportsCar extends Car {
    void accelerate() {
        System.out.println("Accelerating the sports car.");
    }
}

class Motorcycle extends Vehicle {
    void wheelie() {
        System.out.println("Performing a wheelie on the motorcycle.");
    }
}

public class Inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Car car = new Car();
	        car.drive();
	        car.honk();
	        System.out.println();

	        SportsCar sportsCar = new SportsCar();
	        sportsCar.drive();
	        sportsCar.honk();
	        sportsCar.accelerate();
	        System.out.println();

	        Motorcycle motorcycle = new Motorcycle();
	        motorcycle.drive();
	        motorcycle.wheelie();
		

	}

}
