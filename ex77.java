package day4;
import java.util.Scanner;
//종합 1

/**
* 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
* @author kim baek yu
*/
public class ex77 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
		scanner.close();
	}
}
