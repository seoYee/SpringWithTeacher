package ver4;

import java.util.Random;

public class Boy implements Person{

	@Override
	public String makeFood(int arg) throws Exception {
		
		System.out.println("냉면을 만든다."+arg);
		if(new Random().nextBoolean()){
			throw new Exception("불났다!!");
		}
		return "맛있는 냉면을 완성했다.";
	}
	

}
