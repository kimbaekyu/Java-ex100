// 입출력하기 1

/**
 * 문자(character)는
 * 0~9, a~z, A~Z, !, @, #, {, [, <, ... 과 같이 
 * 길이가 1인 기호라고 할 수 있다.

 * 변수에 문자 1개를 저장한 후
 * 변수에 저장되어 있는 문자를 그대로 출력해보자.
 * @author kim baek yu
*/
import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String str=scanner.next();
		char c=str.charAt(0);
		System.out.println(c);
		scanner.close();
	}
}
