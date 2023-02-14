// 입출력하기 6

/**
 * 실수(real number) 1개를 입력받아 줄을 바꿔 3번 출력해보자.
 * @author kim baek yu
*/

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//입력
		double num=scanner.nextDouble();
		
		//출력
		for(int i=0;i<3;i++) {
			System.out.println(num);
		}
		
		scanner.close();
	}
}
