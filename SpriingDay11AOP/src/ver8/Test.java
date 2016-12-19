package ver8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("ver8/ApplicationContext.xml");
		Person p = context.getBean("girl",Person.class);
		p.makeFood(777);
		
	}


}
