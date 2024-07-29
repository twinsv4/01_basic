package basic;

public class Variable {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println(a);

		char b ='A'; //
		System.out.println(b);
		char c = 65; // 투숙객을 문자로 표시해주세요. 0~65535는 다 문자로 받아줌, 
		System.out.println(c);		
		System.out.println();
		
		// byte d = 300; - error
		
		int e = 65; //int는 4byte
		System.out.println(e);
		int f = 'A'; //int형이지만 A를 65로 인식해서 범위내에 존재라 오류X
		System.out.println(f); //65		
		long g = 25L; //long형 상수
		System.out.println();
		
		//float h = 43.8; -error  실수형의 기본형은 double이라 더브로 가야함
		//첫번째
		//float h = 43.8f; //float형 상수로 태어남
		
		//두번째
		float h = (float)43.8; //강제형 변환 casting
		System.out.println(h);
		
		
	}
}
