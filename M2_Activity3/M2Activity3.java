package ph.com.bpi.m2.act3;

public class M2Activity3 {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.setMake("Toyota");	
		car1.setModel("Vios");
		car1.setColor("Red");
		car1.displayInfo();
		
		Car car2 = new Car("Mitsubishi", "Mirage", "Silver");
		car2.displayInfo();
		
	}

}
