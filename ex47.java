package day3;
import java.util.Scanner;
//비트시프트 연산 2

/**
* 정수 2개(a, b)를 입력받아 a를 2^b배 곱한 값으로 출력해보자. 비트연산 이용
* 0 <= a <= 10, 0 <= b <= 10
* @author kim baek yu
*/
public class ex47 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int result=a<<b;
		System.out.println(result);
		scanner.close();
	}
}
