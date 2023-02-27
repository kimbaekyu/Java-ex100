package day3;
import java.util.Scanner;
//값변환 6

/**
* 실수 1개를 입력받아 소숫점 이하 두 번째 자리까지의 정확도로 반올림한 값을 출력해보자.
* @author kim baek yu
*/
public class ex42 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double num=scanner.nextDouble();
		System.out.printf("%.2f", num);
		scanner.close();
	}
}
