package day2;
import java.util.Scanner;
//입출력하기 18

/**
* 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
* @author kim baek yu
*/
public class ex27 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.printf("%x",num);
		scanner.close();
	}
}
