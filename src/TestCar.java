
public class TestCar {
	
	public static void main(String[] args) {
		
	/*	Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		
		c1.name="A";
		c2.name="B";
		c3.name="B";
		c4.name="C";
		c5.name="D";
		*/
		
		Car c1=Car.getInstance();
		Car c2=Car.getInstance();
		Car c3=Car.getInstance();
		c1.name = "BMW";
		
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
	}

}
