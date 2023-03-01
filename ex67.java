package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 3

/**
* 0이 아닌 정수 1개가 입력되었을 때, 음(-)/양(+)과 짝(even)/홀(odd)을 구분해 분류해보자.
* 음수이면서 짝수이면, A
* 음수이면서 홀수이면, B
* 양수이면서 짝수이면, C
* 양수이면서 홀수이면, D
* 를 출력한다.
* @author kim baek yu
*/
public class ex67 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		
		//a 음(-)/양(+) 구별
		
		//a가 음수일때
		if(a<0) {
			if(a%2==0)
				System.out.println("A "+a);
			else
				System.out.println("B "+a);
		}
		
		//a가 양수일때	
		else {
			if(a%2==0)
				System.out.println("C "+a);
			else
				System.out.println("D "+a);
		}
		
		scanner.close();
	}
}
