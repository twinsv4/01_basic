package basic;

public class Variable2 {
	int a; //필드 (클래스 소속인 필드에 존재), 이미 0이라고 초기화 되어있다. 필드는 가비지를 갖고 있지 않음
	static int b; //
	
	public static void main(String[] args) {
		//int a; =100을 하지 않으면 가비지 값이라고 해서 없애주고 ??
		int a  = 100; //local variable(지역변수), 쓰레기값이라 반드시 초기화 해줘야함
		System.out.println(a);
		
		//int a; 함수안에 이미 duplicate 중복 에러 생김
		System.out.println("필드 a = " + a); //자기 구역에서는 class가 아닌 내구역 100을 보여줌
		System.out.println("필드 a = " + new Variable2().a); //class 소속인 a를 가져옴, 클래스 만들어주세요 new사용
		System.out.println("필드 b = " + b); //static으로 썼기 때문에 class말고 지역내에서 사용가능
		
	}

}
