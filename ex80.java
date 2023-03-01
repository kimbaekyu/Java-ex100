package day4;
import java.util.Scanner;
//종합 4

/**
* 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때,
* 나올 수 있는 모든 경우를 출력해보자.
* @author kim baek yu
*/
public class ex80 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		System.out.println("i"+" "+"j");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
