package ver5;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire{
	public String getModel(){
		return "국산";
	}
}
