package operator;

public class Operator04 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1+=10)<0&&(num2+=10)>0); //num1에서 이미 조건이 틀림 num2의 연산은 진행x num2=0
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2); //num1 = 10 num2 = 0
		//|| or로 하나만 참이면 참 앞이 참이기 때문에 뒤에 num2는 또 계산안함
		result = ((num1+=10)>0||(num2+=10)>0); 
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+" num2 = "+num2); //num1 = 20 num2 = 0
	}

}
