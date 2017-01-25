package Garage;

public class Tank extends Vehicle {

	double shellPower;

	public Tank(double shellPower, String make, String color, int id) {
		this.shellPower = shellPower;
		this.make = make;
		this.color = color;
		this.id = id;
	}

}
