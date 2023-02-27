package day3;
import java.util.Scanner;
//비트시프트 연산 1

/**
* 정수 1개를 입력받아 2배 곱해 출력해보자. 비트연산 이용
* @author kim baek yu
*/
public class ex46 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int result=a<<1;
		System.out.println(result);
		scanner.close();
	}
}
