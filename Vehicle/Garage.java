package Garage;
import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addVehicle(String make, int id, String color,
			double shellPower) {
		Tank tempTank = new Tank(shellPower, make, color, id);
		vehicles.add(tempTank);
	}
	public void addVehicle(String make, int id, String color, int wheelCount) {
		Car tempCar = new Car(wheelCount, make, color, id);
		vehicles.add(tempCar);
	}
	public void addVehicle(String make, int id, String color,
			boolean hasPropellers) {
		Boat tempBoat = new Boat(hasPropellers, make, color, id);
		vehicles.add(tempBoat);
	}

	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}

	public void outputVehicles() {
		/*
		 * both for loops do the same thing for(int i = 0; i < vehicles.size();
		 * i++) { System.out.println(vehicles.get(i).make); }
		 */

		for (Vehicle v : vehicles) {
			System.out.println("ID: " + v.id + " Bill:" + v.bill);
		}
	}
	public void billVehicles() {
		for (Vehicle v : vehicles) {
			calculateBill(v);
		}
	}

	public void calculateBill(Vehicle v) {
		if (v instanceof Car)
			v.bill = 50;
		else if (v instanceof Boat)
			v.bill = 100;
		else if (v instanceof Tank)
			v.bill = 1000000000;
	}

	public void removeVehicle(int id) {
		for (Vehicle v : vehicles) {
			if (v.id == id) {
				vehicles.remove(v);
				break;
			}
		}
	}
	// only removes first vehicle of that type, look into iterator to fix this
	public void removeVehicles(String type) {
		for (Vehicle v : vehicles) {
			if (type.equals("Car")) {
				if (v instanceof Car) {
					vehicles.remove(v);
					break;
				}
			} else if (type.equals("Tank")) {
				if (v instanceof Tank) {
					vehicles.remove(v);
					break;
				}

			} else if (type.equals("Boat"))
				if (v instanceof Boat) {
					vehicles.remove(v);
					break;
				}
		}
	}
}