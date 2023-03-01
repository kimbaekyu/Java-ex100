package day4;
import java.util.Scanner;
//반복실행구조 6

/**
* 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자. for문 이용
* @author kim baek yu
*/
public class ex76 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=0;i<=num;i++){
			System.out.println(i);
		}
		scanner.close();
	}
}

