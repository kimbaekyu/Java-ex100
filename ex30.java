package day2;
import java.util.Scanner;
//값변환 4

/**
* 영문자 1개를 입력받아 10진수 유니코드(Unicode) 값으로 출력해보자.
* @author kim baek yu
*/
public class ex30 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char c=scanner.next().charAt(0);
		int num=Integer.valueOf(c);
		System.out.print(num);
		scanner.close();
	}
}
