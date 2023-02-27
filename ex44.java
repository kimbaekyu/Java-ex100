package day3;
import java.util.Scanner;
//산술연산 10

/**
* 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
* 단, b는 0이 아니다.
* @author kim baek yu
*/
public class ex44 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		//합
		System.out.println(a+b);
		
		//차
		System.out.println(a-b);
		
		//곱
		System.out.println(a*b);
		
		//몫
		System.out.println(a/b);
		
		//나머지
		System.out.println(a%b);
		
		//나눈값
		double result=((double)a)/b;
		System.out.printf("%.2f\n",result);
		
		scanner.close();
	}
}
