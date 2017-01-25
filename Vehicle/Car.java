package Garage;

public class Car extends Vehicle {

	int wheelCount;

	public Car(int wheelCount, String make, String color, int id) {
		this.wheelCount = wheelCount;
		this.make = make;
		this.color = color;
		this.id = id;
	}

}
