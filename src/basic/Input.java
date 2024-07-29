package basic;

import java.util.Scanner; // Scanner는 java.lang에 없기 때문에 불러와야함

public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드를 통해서 입력할 수 있는 클래스 생성
		
		System.out.print("정수형 데이터 입력 : ");
		int a = scan.nextInt(); //static이 아님 위에서 new로 생성했으니까
		
		System.out.print("실수형 데이터 입력 : ");
		double b = scan.nextDouble(); //
		
		System.out.println(a + " + " + b+ " = " + (a+b));
		
		//int scan; 정수형 변수
		//double scan; 실수형 변수
		//Scanner scan; 객체(클래스형 변수)

	}

}
