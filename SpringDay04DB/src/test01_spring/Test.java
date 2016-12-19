package test01_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test01_spring.vo.BookVO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test01_spring/applicationContext.xml");
		BookDao dao = context.getBean("dao", BookDao.class);
		
		BookVO book = new BookVO("Tobi", "yangyu", "sds", 35000);
		System.out.println("insert result : " + dao.insert(book));
		
		System.out.println("--모든 책 정보--");
		for(BookVO b : dao.selectAll()){
			System.out.println(b);
		}
		
		System.out.println("--2번 책 정보--");
		System.out.println(dao.select(2));
	}
}
