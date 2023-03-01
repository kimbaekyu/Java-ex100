package day4;
import java.util.Scanner;
//종합 9

/**
* 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
* 3의 배수인 경우는 출력하지 않도록 만들어보자.
* 
* 정수 1개를 입력받는다.(1 ~ 100)
* 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되 3의 배수는 출력하지 않는다.
* @author kim baek yu
*/
public class ex87 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				
			}
			else {
				System.out.printf(i+" ");
			}
		}
		scanner.close();
		
	}
}
