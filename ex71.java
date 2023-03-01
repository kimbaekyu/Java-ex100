package day4;
import java.util.Scanner;
//반복실행구조 1

/**
* 임의의 정수가 줄을 바꿔 계속 입력된다.(-2147483648 ~ +2147483647)
* 단 개수는 알 수 없다.
* 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
* @author kim baek yu
*/
public class ex71 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//while문 처음 조건 검사를 통과하기 위해 0 아닌 값을 임의로 저장
		int n=1;
		
		while(n!=0) {
			n=scanner.nextInt();
			if(n!=0)
				System.out.println(n);
			else
				break;
		}
		scanner.close();
	}
}
