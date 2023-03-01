package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 4

/**
* 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
* 평가 기준
* 점수 범위 : 평가
*  90 ~ 100 : A
*  70 ~  89 : B
*  40 ~  69 : C
*  0 ~   39 : D
* 로 평가되어야 한다.
* @author kim baek yu
*/
public class ex68 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		if(n>=90&&n<=100)
			System.out.println("A");
		if(n>=70&&n<90)
			System.out.println("B");
		if(n>=40&&n<70)
			System.out.println("C");
		if(n>=0&&n<40)
			System.out.println("D");
		
		scanner.close();
	}
}
