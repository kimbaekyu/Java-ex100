package day3;
import java.util.Scanner;
//비교 연산 1

/**
* 두 정수(a, b)를 입력받아 a가 b보다 작으면 True 를, a가 b보다 크거나 같으면 False 를 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex48 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		boolean boo=false;
		if(a<b) {
			boo=true;
		}
		else if(a>=b){
			boo=false;
		}
		
		System.out.println(boo);
		
		scanner.close();
	}
}
