package ver2_2;

public class Driver {
	public static void main(String[] args) {
		
	Car myCar = new Car();
	KoreaTire t = new KoreaTire();
	
	myCar.setTire(t);
	
	myCar.printInfo();
	
	
	}

}
