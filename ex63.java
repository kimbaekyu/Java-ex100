package day4;
import java.util.Scanner;
//기초 3항 연산 1

/**
* 입력된 두 정수(a, b) 중 큰 값을 출력하는 프로그램을 작성해보자. 단, 3항 연산을 사용한다.
* @author kim baek yu
*/

public class ex63 {
	public static void main(String[] args) {
		int a;
		int b;
		
		int max;
		
		Scanner scanner=new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		//3항 연산자 (조건문)?(참일때):(거짓일때)
		max=a>b?a:b;		 
		System.out.println(max);
		 
		scanner.close();
	}
}
