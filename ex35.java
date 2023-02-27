package day3;
import java.util.Scanner;
//산술연산 4

/**
* 실수 2개(f1, f2)를 입력받아 곱을 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex35 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double result=a*b;
		System.out.println(result);
		scanner.close();
	}
}
