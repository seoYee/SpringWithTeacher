package ver2;
//공통으로 적용하려고 하는 기능들

public class MyAspect {
	public void myBefore(){
		System.out.println("배가 고프다.");
	}
	
	public void myAfterReturning(){
		System.out.println("잘 먹었다~~");
	}
	
	public void myAfterThrowing(){
		System.out.println("엄마~~!!!");
	}
	public void myAfter(){
		System.out.println("설거지를 한다.");
	}

}
