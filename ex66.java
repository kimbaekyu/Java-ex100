package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 2

/**
* 3개의 정수(a, b, c)가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
* @author kim baek yu
*/
public class ex66 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		//a 짝/홀 구별
		if(a%2==0)
			System.out.println("Even "+a);
		else
			System.out.println("Odd "+a);
		
		//b 짝/홀 구별
		if(b%2==0)
			System.out.println("Even "+b);
		else
			System.out.println("Odd "+b);
		
		//c 짝/홀 구별
		if(c%2==0)
			System.out.println("Even "+c);
		else
			System.out.println("Odd "+c);
		
		scanner.close();
	}
}
