package day3;
import java.util.Scanner;
import java.lang.Math;
//산술연산 6

/**
* 정수 2개(a, b)를 입력받아 a를 b번 곱한 거듭제곱을 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex38 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		//거듭제곱을 구하기 위해 Math 함수의 pow(double a,double b)사용 후 INT형 강제변환
		int result=(int)Math.pow(a, b);
		System.out.println(result);
		scanner.close();
	}
}
