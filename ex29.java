package day2;
import java.util.Scanner;
//값변환 3

/**
* 16진수를 입력받아 8진수(octal)로 출력해보자.
* @author kim baek yu
*/
public class ex29 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String data=scanner.next();
		//입력받은 수를 16진수로 변환
		int num=Integer.valueOf(data, 16);
		//16진수를 8진수로 출력
		System.out.printf("%o",num);
		scanner.close();
	}
}
