package day2;

import java.util.Scanner;
//값변환 2

/**
* 실수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex26 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double sum=a+b;
		System.out.println(sum);
		scanner.close();
	}
}

