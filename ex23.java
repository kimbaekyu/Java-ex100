package day2;
import java.util.Scanner;
//입출력하기 15

/**
* 시:분:초 형식으로 시간이 입력될 때 분만 출력해보자.
* @author kim baek yu
*/


public class ex23 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		String[] a=new String[3];
		a=str.split(":");
		System.out.println(a[1]);
		scanner.close();
	}
}
