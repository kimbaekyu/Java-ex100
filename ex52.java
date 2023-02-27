package day3;
import java.util.Scanner;
//논리 연산 1

/**
* 정수가 입력되었을 때, True/False 로 평가해주는 프로그램을 작성해보자.
* 입력된 값이 0이면 False, 0이 아니면 True 를 출력한다.
* @author kim baek yu
*/
public class ex52 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		
		boolean boo=false;
		if(a!=0) {
			boo=true;
		}
		else {
			boo=false;
		}
		
		System.out.println(boo);
		
		scanner.close();
	}
}
