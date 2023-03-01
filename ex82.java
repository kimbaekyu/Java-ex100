package day4;
import java.util.Scanner;
//종합 6

/**
* 친구들과 함께 3 6 9 게임을 하던 영일이는 잦은 실수 때문에 계속해서 벌칙을 받게 되었다.
* 3 6 9 게임의 왕이 되기 위한 369 마스터 프로그램을 작성해 보자.
* 30 보다 작은 정수 1개가 입력된다.(1 ~ 29)
* 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
* 3 또는 6 또는 9가 포함 되어있는 수인 경우, 그 수 대신 영문 대문자 X 를 출력한다.
* @author kim baek yu
*/
public class ex82 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%10==3) {
				System.out.print("X ");
			}
			else if(i%10==6) {
				System.out.print("X ");
			}
			else if(i%10==9) {
				System.out.print("X ");
			}
			else
				System.out.print(i+" ");
		}
		scanner.close();
	}
}
