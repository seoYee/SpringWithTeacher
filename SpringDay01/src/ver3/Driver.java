package ver3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/ver3/applicationContext.xml");
	
	Car myCar = ctx.getBean("sonata",Car.class);
	Tire tire = ctx.getBean("koreaTire", KoreaTire.class);
	
	myCar.setTire(tire);
	myCar.printInfo();
	
	}
	

}
