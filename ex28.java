package day2;
import java.util.Scanner;
//입출력하기 19

/**
* 10진수를 입력받아 16진수(hexadecimal)대문자로 출력해보자.
* @author kim baek yu
*/
public class ex28 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.printf("%X",num);
		scanner.close();
	}
}
