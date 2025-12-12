package ph.com.bpi.m2.act6;

public class M2Activity6 {

	public static void main(String[] args) {
		
		Car car = new Car(4,"Toyota");
		Truck truck = new Truck(10, "Isuzu");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();

		destroyVehicle(car);
		destroyVehicle(truck);
		
	}
	
	public static void destroyVehicle(Car car) {
		car.destroy();
	}
	
	public static void destroyVehicle(Truck truck) {
		truck.destroy();
	}

}
