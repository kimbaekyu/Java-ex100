package day2;
import java.util.Scanner;
// 입출력하기 13

/**
 * 문자로 이루어진 단어 1개가 입력된다. 각 문자를 한 줄에 한 문자씩 줄을 바꿔 출력한다.
 * @author kim baek yu
*/
public class ex21 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str;
		str=scanner.next();
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		scanner.close();
	}
}
