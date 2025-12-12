package ph.com.bpi.m2.act6;

public abstract class Vehicle implements Refuelable {
	
	private int NumberOfWheels;
	private String Brand;
	
	public Vehicle() {
	}
	
	public Vehicle(int NumberOfWheels, String Brand) {
		this.NumberOfWheels = NumberOfWheels;
		this.Brand = Brand;
	}
	
	public int getNumberOfWheels() {
		return NumberOfWheels;
	}
	
	public void setNumberOfWheels(int NumberOfWheels) {
		this.NumberOfWheels = NumberOfWheels;
	}
	
	public String getBrand() {
		return Brand;
	}
	
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
		
	public abstract void startEngine();
	
	public void destroy() {
		System.out.println(Brand + " vehicle with " + NumberOfWheels + " wheels was destroyed!");
	}

}
