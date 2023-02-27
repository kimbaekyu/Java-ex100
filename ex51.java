package day3;
import java.util.Scanner;
//비교 연산 4

/**
* 두 정수(a, b)를 입력받아 a의 값이 b의 값과 서로 다르면 True 를, 같으면 False 를 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex51 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		boolean boo=false;
		if(a!=b) {
			boo=true;
		}
		else {
			boo=false;
		}
		
		System.out.println(boo);
		
		scanner.close();
	}
}
