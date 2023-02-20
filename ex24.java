package day2;
import java.util.Scanner;
//입출력하기 15

/**
* 알파벳 문자와 숫자로 이루어진 단어 2개를 입력받아 순서대로 붙여 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/


public class ex24 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String w1=scanner.next();
		String w2=scanner.next();
		String str=w1+w2;
		System.out.println(str);
		scanner.close();
	}
}
