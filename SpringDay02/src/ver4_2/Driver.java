package ver4_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ver4_2/applicationContext.xml");
		
		Car myCar = ctx.getBean("sonata",Car.class);
		myCar.printInfo();
	}

}
