package operator;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		int ths = money/1000;
		int ths_mod = money % 1000;
		
		int hun = ths_mod/100;
		int hun_mod = ths_mod % 100;
		
		int ten = hun_mod/10;
		
		int one = hun_mod % 10;

		System.out.println("천원 : "+ths+"장");
		System.out.println("백원 : "+hun+"개");
		System.out.println("십원 : "+ten+"개");
		System.out.println("일원 : "+one+"개");
		
	}

}
/*[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개*/