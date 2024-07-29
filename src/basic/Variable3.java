package basic;

import java.util.Random; 

public class Variable3 {

	public static void main(String[] args) {
		int big = Math.max(25, 36); //max는 클래스가 아닌 static내 Math에 존재함
		System.out.println("큰 값 = " + big);
		
		//12.7, 78.5중에서 작은 값을 구하시오.
		double small = Math.min(12.7, 78.5);
		System.out.println("작은 값 = " + small);
		
		//2의 5승 
		double power = Math.pow(2.0,5);
		System.out.println("2의 5승 = " + power);

		//난수
		//컴퓨터가 불규칙하게 발생하는 수
		//0 <= 난수 < 1
		double a = Math.random(); //데이터를 넣지 않아도 결과가 나옴.
		//a에서 소수 2자리만 출력하세요. int형으로 출력받으면 
		int c = (int)(a*100); //0 ~ 99 까지만 나옴
		// x~y사이의 난수 발생 (int)(Math.random() * (y-x+1) + x) 
		int d = (int)(Math.random()*26 + 65); //65~90사이의 난수
		char e = (char)(Math.random()*26 + 65); //A~Z사이의 난수
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		
		double b = new Random().nextDouble();
		System.out.println(b);
		
	}

}
