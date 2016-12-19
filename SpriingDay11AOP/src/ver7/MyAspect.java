package ver7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(void makeFood())")
	public void myPoint(){}
	
	@Around("myPoint()")
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
