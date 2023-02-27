package day3;
import java.util.Scanner;
//비트 단위 논리 연산 4

/**
* 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
* 비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.

* 2개의 정수가 공백을 두고 입력된다.(-2147483648 ~ +2147483647)
* 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
* 이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.
* 구체적으로 설명하자면, 두 장의 이미지가 겹쳐졌을 때 색이 서로 다른 부분만 처리할 수 있다.
* 배경이 되는 그림과 배경 위에서 움직이는 그림이 있을 때, 두 그림에서 차이만 골라내 배경 위에서 움직이는 그림의 색으로 바꿔주면
* 전체 그림을 구성하는 모든 점들의 색을 다시 계산해 입히지 않고 보다 효과적으로 그림을 처리할 수 있게 되는 것이다.
* 비행기 슈팅게임 등을 상상해보면 된다.
* @author kim baek yu
*/
public class ex62 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		//이진수로 나타내기 위해 Integer.toBinaryString(변수) 사용
		String binaryA=Integer.toBinaryString(a);
		String binaryB=Integer.toBinaryString(b);
		
		System.out.println("이진수 A: "+binaryA);
		System.out.println("이진수 B: "+binaryB);
		int result=a^b;
		String binaryC=Integer.toBinaryString(result);
		System.out.println("AND 연산 결과(이진수): "+binaryC);
		System.out.println("AND 연산 결과(십진수): "+result);
		scanner.close();
	}
}
