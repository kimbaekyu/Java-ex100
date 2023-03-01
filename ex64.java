package day4;
import java.util.Scanner;
//기초 3항 연산 2

/**
* 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자. 단, 3항 연산을 사용한다.
* @author kim baek yu
*/

public class ex64 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int min;
		
		Scanner scanner=new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		//3항 연산자 (조건문)?(참일때):(거짓일때)
		min=a<b?a:b;
		min=c<min?c:min;
		 
		System.out.println(min);
		scanner.close();
	}
}
