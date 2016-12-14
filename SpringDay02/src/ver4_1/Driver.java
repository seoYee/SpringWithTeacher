package ver4_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		//FileSystemXmlApplicationContext 는 소스폴더인 /src/ 부터 써야하고
		//ClassPathXmlApplicationContext 는 해당 패키지인 /ver4_1/부터 써야한다.
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/ver4_1/applicationContext.xml");
		
		Car myCar = ctx.getBean("sonata",Car.class);
		myCar.printInfo();
	}

}
