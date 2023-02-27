package day3;
import java.util.Scanner;
//비트 단위 논리 연산 2

/**
* 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
* 2개의 정수가 공백을 두고 입력된다.(-2147483648 ~ +2147483647)
* 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.
* 
* 실제로 이 계산은 네트워크에 연결되어 있는 두 개의 컴퓨터가 데이터를 주고받기 위해
* 같은 네트워크에 있는지 아닌지를 판단하는데 사용된다.
* 이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서
* 마스크연산(특정 부분을 가리고 출력하는)을 수행하는 데에도 효과적으로 사용된다.
* @author kim baek yu
*/

public class ex60 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		//이진수로 나타내기 위해 Integer.toBinaryString(변수) 사용
		String binaryA=Integer.toBinaryString(a);
		String binaryB=Integer.toBinaryString(b);
		
		System.out.println("이진수 A: "+binaryA);
		System.out.println("이진수 B: "+binaryB);
		int result=a&b;
		String binaryC=Integer.toBinaryString(result);
		System.out.println("AND 연산 결과(이진수): "+binaryC);
		System.out.println("AND 연산 결과(십진수): "+result);
		scanner.close();
	}
}
