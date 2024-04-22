package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom","123 Gehan St.",25000);
		Vehicle vehicle = new Vehicle("BMW","X6",15000);
		Vehicle car = new Vehicle("BMW","X6",15000);
		Employee emp = new Employee();
		cust1.purchaseCar(vehicle, emp, false);
	}

}

