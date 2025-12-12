package ph.com.bpi.m2.act6;

public class Truck extends Vehicle {

	public Truck() {
	}
	
	public Truck(int NumberOfWheels, String Brand) {
		super(NumberOfWheels,Brand);
	}
		
	@Override 
	public void startEngine() {
		System.out.println(getBrand() + " truck with " + getNumberOfWheels() + " wheels has been started" );
	}
	
	@Override
	public void refuel() {
		System.out.println("Refueling the " + getBrand() + " truck\n");
	}
	
}
