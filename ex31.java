package day3;
import java.util.Scanner;
//값변환 5

/**
* 10진 정수 1개를 입력받아 유니코드 문자로 출력해보자.
* @author kim baek yu
*/
public class ex31 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		char uni=(char)num;
		System.out.println(uni);
		scanner.close();
	}
}
