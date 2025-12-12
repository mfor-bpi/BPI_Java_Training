package ph.com.bpi.m2.act3;

public class Car {

	private String make;
	private String model;
	private String color;
	
	// no-argument constructor	
	public Car() {
		this.make  = "";
		this.model = "";
		this.color = "";
	}
	
	// parameterized constructor	
	public Car(String make, String model, String color) {
		this.make  = make;
		this.model = model;
		this.color = color;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color + "\n");
	}
	
}
