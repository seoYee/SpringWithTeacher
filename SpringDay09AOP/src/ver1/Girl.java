package ver1;

import java.util.Random;

public class Girl implements Person {

	@Override
	public void makeFood() {
		System.out.println("배가 고프다.");

		try {
			System.out.println("냉면을 만든다.");
			if (new Random().nextBoolean()) {
				throw new Exception("불났다!");
			}
			System.out.println("음식을 먹는다.");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("엄마를 부른다.");
		} finally {
			System.out.println("설거지를 한다.");
		}

	}

}
