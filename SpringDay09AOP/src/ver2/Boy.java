package ver2;

import java.util.Random;

public class Boy implements Person{

	@Override
	public void makeFood() throws Exception {
		System.out.println("갈비를 만든다.");
		if(new Random().nextBoolean()){
			throw new Exception("불났다!");
		}
	}
	

}
