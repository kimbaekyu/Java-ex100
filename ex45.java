package day3;
import java.util.Scanner;
//산술연산 11

/**
* 정수 3개를 입력받아 합과 평균을 출력해보자. 평균은 소숫점 이하 셋째 자리에서 반올림하여 둘째 자리까지 출력한다.
* @author kim baek yu
*/
public class ex45 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		//합
		System.out.println(a+b+c);
		
		//평균
		double result=(a+b+c)/3.0;
		System.out.printf("%.2f",result);
		
		scanner.close();
	}
}
