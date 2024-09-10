package chapter03.used;

import chapter03.used.AddCalc;
import chapter03.used.SubCalc;

public class Call {

	public static void main(String[] args) {
		Calculator calculator = new AddCalc();
		Calculator calculator2 = new SubCalc();
		
		Integer result = calculator.calc(10, 5);
		Integer result2 = calculator2.calc(10, 5);
		
		System.out.println("계산 결과는 (" + result + ")입니다.");
		System.out.println("계산 결과는 (" + result2 + ")입니다.");
	}

}
