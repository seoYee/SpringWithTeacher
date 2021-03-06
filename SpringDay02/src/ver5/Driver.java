package ver5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ver5/applicationContext.xml");
		
		Car myCar = context.getBean("sonata",Car.class);
		
		//@Component에 따로 지정해둔 이름이 없다면 class명의 맨 앞글자를 소문자로 바꾼것이 지정이름이 된다.
		Tire tire = context.getBean("chinaTire",ChinaTire.class);
		myCar.setTire(tire);
		myCar.printInfo();
		
	}

}
