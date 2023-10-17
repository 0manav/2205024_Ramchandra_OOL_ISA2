package RamAssignment;

// Parent class
	class Vehicle {
	    void display() {
	        System.out.println("This is a vehicle.");
	    }
	}

	// Child class inheriting from Vehicle
	class Car extends Vehicle {
	    void displayCar() {
	        System.out.println("This is a car.");
	    }
	}

	public class inheritance {
	    public static void main(String[] args) {
	        // Create an instance of Car
	        Car car = new Car();

	        // Call methods from both classes
	        car.display();   // Output: This is a vehicle.
	        car.displayCar(); // Output: This is a car.
	    }
	}


