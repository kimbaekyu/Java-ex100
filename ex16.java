// 입출력하기 8

/**
 * 공백을 두고 문자(character) 2개를 입력받아 순서를 바꿔 출력해보자.
 * @author kim baek yu
*/
import java.util.Scanner;
public class ex16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//입력
		String s1=scanner.next();
		char c1=s1.charAt(0);
		String s2=scanner.next();
		char c2=s2.charAt(0);
		
		//출력
		System.out.println(c2);
		System.out.println(c1);
		
		scanner.close();
	}
}
