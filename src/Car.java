
public class Car {
	private static Car obj; //so outside class cann not see it.
	String name;
	
	private Car() {};
	
	public static synchronized  Car getInstance() {
		/*if(obj==null) {
			synchronized(Singleton.class) {
				if(obj==null) {
					obj = new Singleton();
				}
			}
		}*/
			
		if (obj == null) 
			obj = new Car();
		return obj;
	}
	
	public void drive() {
		System.out.println("Driving car");
	}
	
}
