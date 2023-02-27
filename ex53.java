package day3;
import java.util.InputMismatchException;
import java.util.Scanner;
//논리 연산 2

/**
* 정수값이 입력될 때(0 OR 1로 입력), 그 불 값을 반대로 출력하는 프로그램을 작성해보자. 입력된 정수의 불 값이 False 이면 True, True 이면 False 를 출력한다.
* @author kim baek yu
*/
public class ex53 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean boo=false;
		//입력된 값이 정수가 아닐때는 boolean값이 false로 지정하기위해 try{}catch(){} 사용.
		try {
			scanner.nextInt();
			boo=true;
		} catch(InputMismatchException e) {
			boo=false;
		}
		
		
		if(boo==true)
			System.out.println(!boo);
		else
			System.out.println(!boo);
		
		scanner.close();
	}
}
