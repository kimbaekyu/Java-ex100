package day3;
import java.util.Scanner;
//산술연산 4

/**
* 단어와 반복 횟수를 입력받아 여러 번 출력해보자.
* @author kim baek yu
*/
public class ex36 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		int num=scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.print(str+" ");
		}
		System.out.println();
		scanner.close();
	}
}
