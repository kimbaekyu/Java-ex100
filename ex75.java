package day4;
import java.util.Scanner;
//반복실행구조 5

/**
* 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자. while문 이용
* @author kim baek yu
*/
public class ex75 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int n=0;
		
		while(n<=num) {
			System.out.println(n++);
		}
		scanner.close();
	}
}
