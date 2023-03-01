package day4;
import java.util.Scanner;
//종합 8

/**
* 1, 2, 3 ... 을 순서대로 계속 더해 합을 만드는데,
* 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
* 
* 즉, 1부터 n까지 정수를 하나씩 더해 합을 만드는데,
* 어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.
* <입력>
* 언제까지 합을 계산할 지, 정수 1개를 입력받는다. 단, 입력되는 자연수는 100,000,000이하이다.
* <출력>
* 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
* 그때까지의 합을 출력한다.
* @author kim baek yu
*/
public class ex86 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int inputSum=scanner.nextInt();
		int sum=0;
		int i=1;
		scanner.close();
		
		for(i=1;sum<=inputSum;i++) {
			sum+=i;
			if(sum>=inputSum)
				break;
		}
		System.out.println(i+" 까지의 합: "+sum);
		
	}
}
