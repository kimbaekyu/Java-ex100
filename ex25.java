package day2;
import java.util.Scanner;
//입출력하기 16

/**
* 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex25 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int sum=a+b;
		System.out.println(sum);
		scanner.close();
	}
}
