package day4;
import java.util.Scanner;
//종합 11

/**
* 등비 수열 구하기
* 
* 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(sequences)이라고 한다.
* 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
* n번째 수를 출력한다.
* @author kim baek yu
*/
public class ex89 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int r=scanner.nextInt();
		int n=scanner.nextInt();
		int x=a;
		
		for(int i=1;i<n;i++) {
			//System.out.println(x);
			x=x*r;
		}
		System.out.println(x);
		scanner.close();
		
	}
}
