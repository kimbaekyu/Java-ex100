package day3;
import java.util.Scanner;
//산술연산 5

/**
* 반복 횟수와 문장을 입력받아 여러 번 출력해보자.
* @author kim baek yu
*/
public class ex37 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int num=scanner.nextInt();
		for(int i=0;i<num;i++) {
			System.out.print(str+" ");
		}
		System.out.println();
		scanner.close();
	}
}
