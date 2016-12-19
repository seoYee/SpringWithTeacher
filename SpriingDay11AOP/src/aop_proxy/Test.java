package aop_proxy;

public class Test {
	public static void main(String[] args) throws Exception {
		Person boy = new Boy();
		Person girl = new Girl();
		PersonProxy proxy = new PersonProxy();
		
		proxy.setBefore(new CBefore());
		proxy.setAfter(new CAfter());
		proxy.setReturning(new CAfterReturning());
		proxy.setThrowing(new CAfterThrowing());
		
		proxy.setPerson(boy);
		proxy.makeFood(10);
		
		proxy.setPerson(girl);
		proxy.makeFood(20);
		
		
	}

}
