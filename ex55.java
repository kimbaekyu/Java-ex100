package day3;
import java.util.Scanner;
//논리 연산 4

/**
* 2개의 정수값이 입력될 때(0 OR 1로 입력), 그 불 값이 하나라도 True 일 때 True 를 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex55 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean boo=false;
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		if(a==0&b==0) {
			boo=false;
		}
		else
			boo=true;
		
		//결과 출력
		System.out.println(boo);
		scanner.close();
	}
}
