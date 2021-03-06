package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//	Autowired는 객체 하나에만 붙인다. Qualifier는 생성자 위에는 붙일 수 없다. 그래서 필드 멤버 위 보다는 
//  setter에 붙이는 경우가 많다 

@Component("sonata")
public class Car {
//	@Autowired
	private Tire tire;
	
	public Car(){}
	
//	@Autowired
	public Car(Tire tire){
		this.tire = tire;
	}
	
	@Autowired
	@Qualifier("koreaTire")
	public void setTire(Tire tire){
		this.tire = tire;
	}
	
	public void printInfo(){
		System.out.println("현재 장착 모델 : " + tire.getModel());
	}
}
