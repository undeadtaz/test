package Garage;

public class Main {

	public static void main(String[] args) {

		Garage g = new Garage();

		g.addVehicle("Tank", 1, "Red", 192.5);
		g.addVehicle("BoatMake", 2, "White", true);
		g.addVehicle("Audi", 3, "Yellow", 4);

		Car c = new Car(4, "Peugeot", "Black", 4);
		g.addVehicle(c);

		g.billVehicles();
		g.outputVehicles();
		g.removeVehicle(2);
		g.outputVehicles();

	}

}
