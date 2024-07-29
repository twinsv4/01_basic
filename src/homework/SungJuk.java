package homework;

public class SungJuk {

	public static void main(String[] args) {
		String name = "L"; //char name = "L"; 한글자여서 char도 가능 string-> double로 잡는다?
		int kor = 85;
		int eng = 90;
		int math = 100;
		//	int kor = 85, eng = 90, math = 100; 
		
		int tot = kor + eng + math;
		float avg = tot / 3;
		//double avg =  (double)tot /3;
		
		System.out.println(" *** L 성젹표 ***");
		System.out.println(" 국어 영어 수학 총점 평균 ");
		System.out.println(kor +" "+ eng +" "+ math +" "+ tot +" "+ String.format("%.3f", avg));
		//System.out.println(kor +"\t"+ eng +"\t"+ math +"'t"+ tot +"\t"+ String.format("%.3f", avg));
	}

}
/*
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수

평균의 소수이하 3째자리까지 출력

[실행결과]
 *** L 성적표 ***
국어 영어 수학 총점 평균
85 90 100 xxx xx.xxx
*/