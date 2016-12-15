package ver5;

import org.springframework.stereotype.Component;

@Component
public class ChinaTire implements Tire{ 
	public String getModel(){
		return "대륙";
	}

}
