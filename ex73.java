package day4;
import java.util.Scanner;
//반복실행구조 3

/**
* 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
* 1만큼씩 줄이면서 카운트다운 수가 0이 될 때까지 한 줄에 1개씩 출력한다.
* @author kim baek yu
*/
public class ex73 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int count=n-1;
		while(count!=-1) {
			System.out.println(count);
			count--;	
		}
		scanner.close();
	}
}
