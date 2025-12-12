package ph.com.bpi.m2.act6;

public class Car extends Vehicle {
	
	public Car() {
	}
	
	public Car(int NumberOfWheels, String Brand) {
		super(NumberOfWheels,Brand);
	}
		
	@Override 
	public void startEngine() {
		System.out.println(getBrand() + " car with " + getNumberOfWheels() + " wheels has been started" );
	}
	
	@Override
	public void refuel() {
		System.out.println("Refueling the " + getBrand() + " car\n");
	}
	
}
