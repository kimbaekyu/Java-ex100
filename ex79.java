package day4;
import java.util.Scanner;
//종합 3

/**
* 1, 2, 3 ... 을 계속 더해 나갈 때,
* 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지만
* 계속 더하는 프로그램을 작성해보자.
* 즉, 1부터 n까지 정수를 계속 더해 나간다고 할 때,
* 어디까지 더해야 입력한 수보다 같거나 커지는 지를 알아보고자하는 문제이다.
* @author kim baek yu
*/
public class ex79 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int inputSum=scanner.nextInt();
		int sum=0;
		int i=1;
		scanner.close();
		
		for(i=1;i<=1000;i++) {
			sum+=i;
			if(sum==inputSum)
				break;
		}
		
		System.out.println(i+"까지의 합: "+inputSum);
		
		
	}
}
