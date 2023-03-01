package day4;
import java.util.Scanner;
//반복실행구조 4

/**
* 영문 소문자(a ~ z) 1개가 입력되었을 때, a부터 그 문자까지의 알파벳을 순서대로 출력해보자.
* @author kim baek yu
*/
public class ex74 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		char alpha='a';
		while(ch>=alpha) {
			System.out.println(alpha);
			alpha++;
		}
		scanner.close();
	}
}
