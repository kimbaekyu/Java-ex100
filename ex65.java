package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 1

/**
* 3개의 정수(a, b, c)가 입력되었을 때, 짝수만 출력해보자.
* @author kim baek yu
*/
public class ex65 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		if(a%2==0)
			System.out.println(a);
		if(b%2==0)
			System.out.println(b);
		if(c%2==0)
			System.out.println(c);
		
		scanner.close();
	}
}
