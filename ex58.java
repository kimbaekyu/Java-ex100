package day3;
import java.util.Scanner;
//논리 연산 7

/**
* 2개의 정수값이 입력될 때(0 OR 1로 입력), 그 불 값(True/False) 이 모두 False 일 때에만 True 를 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex58 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean boo=false;
		
		System.out.println("두 개의 정수를 입력하세요(0 OR 1로 입력)");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		if(a==0&b==0)
			boo=true;
		else
			boo=false;
		
		System.out.println(boo);
		scanner.close();
	}
}
