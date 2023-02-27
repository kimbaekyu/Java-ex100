package day3;
import java.util.Scanner;
//산술연산 3

/**
* 정수 2개(a, b)를 입력받아 a에서 b를 뺀 차를 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex34 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int result=a-b;
		System.out.println(result);
		scanner.close();
	}
}
