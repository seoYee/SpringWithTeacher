package ver2_1;

public class Car {
	private Tire tire;
	
	public Car(Tire tire){
		this.tire = tire;
	}
	
	public void printInfo(){
		System.out.println("현재 장착 타이어 : " + tire.getModel());
	}

}
