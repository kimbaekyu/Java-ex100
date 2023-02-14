// 입출력하기 4

/**
 * 줄을 바꿔 정수(integer) 2개를 입력받아 줄을 바꿔 출력해보자.
 * @author kim baek yu
*/

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//입력
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		//출력
		System.out.println(a);
		System.out.println(b);
		
		scanner.close();
	}
}
