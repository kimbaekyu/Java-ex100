package day3;
import java.util.Scanner;
import java.lang.Math;
//산술연산 6

/**
* 실수 2개(f1, f2)를 입력받아 f1을 f2번 거듭제곱한 값을 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex39 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		//거듭제곱을 구하기 위해 Math 함수의 pow(double a,double b)사용
		double result=Math.pow(a, b);
		System.out.println(result);
		scanner.close();
	}
}
