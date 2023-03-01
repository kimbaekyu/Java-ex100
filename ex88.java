package day4;
import java.util.Scanner;
//종합 10

/**
* 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(sequences)이라고 한다.
* 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
* n번째 수를 출력하는 프로그램을 만들어보자.
* 
* 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 100)
*
* n번째 수를 출력한다.
* @author kim baek yu
*/
public class ex88 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int d=scanner.nextInt();
		int n=scanner.nextInt();
		int x=a;
		for(int i=1;i<n;i++) {
			//System.out.println(x);
			x=x+d;
		}
		System.out.println(x);
		scanner.close();
		
	}
}
