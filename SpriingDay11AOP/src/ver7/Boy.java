package ver7;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Boy implements Person{

	@Override
	public void makeFood() throws Exception {
		System.out.println("냉면을 만든다.");
		if(new Random().nextBoolean()){
			throw new Exception("면이 없다!");
		}
	}
	
	

}
