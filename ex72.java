package day4;
import java.util.Scanner;
//반복실행구조 2

/**
* 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
* 1만큼씩 줄이면서 카운트다운 수가 1이 될 때까지 한 줄에 1개씩 출력한다.
* @author kim baek yu
*/
public class ex72 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		while(n!=0) {
			System.out.println(n);
			n--;	
		}
		scanner.close();
	}
}
