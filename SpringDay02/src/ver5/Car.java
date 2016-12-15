package ver5;

import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {
	private Tire tire;
	
	public void setTire(Tire tire){
		this.tire = tire;
	}
	
	public void printInfo(){
		System.out.println("현재 장착모델은 : " + tire.getModel());
	}

	

}
