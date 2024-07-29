package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); //FALSE
		System.out.println("!a = " + !a);//TRUE
		System.out.println();
		
		String b = "apple";
		String c = "apple";
		String d = new String("apple");

		System.out.println("b == c : "+(b == c ? "같다" :"다르다"));//주소 비교
		//주소 같음
		System.out.println("b == d : "+(b == d ? "같다" :"다르다"));//주소 비교
		//주소 다름
		System.out.println();
		
		System.out.println("b.equals(c) : "+(b.equals(c) ? "같다" :"다르다"));//문자열 자체 비교
		//같다
		System.out.println("b.equals(d) : "+(b.equals(d) ? "같다" :"다르다"));//문자열 자체 비교
		//문자열 같다
		System.out.println("!b.equals(c) : "+(!b.equals(c) ? "같다" :"다르다"));//문자열 자체 비교
		System.out.println("!b.equals(d) : "+(!b.equals(d) ? "같다" :"다르다"));//문자열 자체 비교
		//문자열 같다
		
	}

}
