package ver3;

public class Car {
	private Tire tire;
	
	public void setTire(Tire tire){
		this.tire = tire;
	}
	
	public void printInfo(){
		System.out.println("현재 장착 타이어는 : " + tire.getModel());
	}

}
