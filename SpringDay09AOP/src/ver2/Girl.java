package ver2;

import java.util.Random;

public class Girl implements Person{

	@Override
	public void makeFood() throws Exception {

		System.out.println("냉면을 만든다.");
		if(new Random().nextBoolean()){
			throw new Exception("불났다!");
		}
	}

}
