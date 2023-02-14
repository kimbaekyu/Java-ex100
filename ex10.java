// 입출력하기 2

/**
 * 변수에 정수값을 저장한 후 정수로 변환하여 출력해보자.
 * @author kim baek yu
*/

import java.util.Scanner;
public class ex10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//입력
		int num=scanner.nextInt();
		
		//출력
		System.out.println(num);
		
		scanner.close();
	}
}
