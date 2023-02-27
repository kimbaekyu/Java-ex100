package day3;
import java.util.Scanner;
//산술연산 2

/**
* 문자 1개를 입력받아 그 다음 문자를 출력해보자.
* @author kim baek yu
*/
public class ex33 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		char ch2=(char)(ch+1);
		System.out.println(ch2);
		scanner.close();
	}
}
