package day3;
import java.util.Scanner;
//비트 단위 논리 연산 1

/**
* 비트단위(bitwise) 연산자는,
* ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
* <<(bitwise left shift), >>(bitwise right shift)
* 가 있다.
* 입력된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
* 정수 1개가 입력된다. (-2147483648 ~ +2147483647)
* 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
* @author kim baek yu
*/
public class ex59 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println(~num);
		scanner.close();
	}
}
