package basic;

import java.text.DecimalFormat;

public class Computel {

	public static void main(String[] args) {
		short a = 320; //정수형 디폴트는 int 4byte지만 용량 작은 short로 사용
		short b = 258; 
		
		int sum = a + b;//계산 결과를 디폴트 int로 내보내줬기 때문에 short로 하면 에러뜸
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b; // 둘 중 하나를 실수로 바꿔야 결과값도 실수 -> 하나 이상 형변환 해주기
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));

	}

}

/* 
 [문제] 변수를 이용하여 320(a), 258(b)의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오

[실행결과]
320 + 258 = xxx
*/
 
 