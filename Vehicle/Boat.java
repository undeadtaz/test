package Garage;

public class Boat extends Vehicle {

	boolean hasPropellers;

	public Boat(boolean hasPropellers, String make, String color, int id) {
		this.hasPropellers = hasPropellers;
		this.make = make;
		this.color = color;
		this.id = id;
	}

}
