package day4;
import java.util.Scanner;
//종합 5

/**
* 16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를 배운
* 영일이는 16진수끼리 곱하는 16진수 구구단?에 대해서 궁금해졌다.
* A, B, C, D, E, F 중 하나가 입력될 때,
* 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.(단, A ~ F 까지만 입력된다.)
* @author kim baek yu
*/
public class ex81 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//scanner.nextInt(radix)->(radix)진수로 입력받음.
		int num=scanner.nextInt(16);
		
		for(int i=0X1;i<=0XF;i++) {
			System.out.printf("%x * %x = %x\n",i,num,num*i);
		}
		
		scanner.close();
	}
}
