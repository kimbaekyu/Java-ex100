package day3;
import java.util.Scanner;
//산술연산 9

/**
* 실수 2개(f1, f2)를 입력받아 f1 을 f2 로 나눈 값을 출력해보자. 이 때 소숫점 넷째자리에서 반올림하여 무조건 소숫점 셋째 자리까지 출력한다.
* @author kim baek yu
*/
public class ex43 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double f1=scanner.nextDouble();
		double f2=scanner.nextDouble();
		double result=f1/f2;
		System.out.printf("%.3f", result);
		scanner.close();
	}
}
