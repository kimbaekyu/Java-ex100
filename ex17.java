// 입출력하기 9

/**
 * 정수(integer), 실수, 문자(character), 문자열(string) 등 1개만 입력받아 한 줄로 3번 출력해보자.
 * @author kim baek yu
*/

import java.util.Scanner;
public class ex17 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		double n2=scanner.nextDouble();
		String s1=scanner.next();
		char c1=s1.charAt(0);
		String s2=scanner.next();
		
		System.out.printf("%d %f %c %s",n1,n2,c1,s2);
		scanner.close();
	}
}
