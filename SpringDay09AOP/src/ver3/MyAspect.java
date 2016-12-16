package ver3;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	public void myAround(ProceedingJoinPoint target){
		System.out.println("배가 고프다.");
		try {
			target.proceed();
			System.out.println("밥을 먹는다.");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("엄마!");
		} finally {
			System.out.println("설거지를 한다.");
		}
	}
}
