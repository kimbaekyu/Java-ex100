package day3;
import java.util.Scanner;
//산술연산 8

/**
* 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
* @author kim baek yu
*/
public class ex41 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int result=a%b;
		System.out.println(result);
		scanner.close();
	}
}
