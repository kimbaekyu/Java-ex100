package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 5

/**
* 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
* 평가 내용
* 평가 : 내용
* A : best!!!
* B : good!!
* C : run!
* D : slowly~
* 나머지 문자들 : what?
* @author kim baek yu
*/
public class ex69 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("A : best!!!");
				break;
			case 'B':
			case 'b':	
				System.out.println("B : good!!");
				break;
			case 'C':
			case 'c':	
				System.out.println("C : run!");
				break;
			case 'D':
			case 'd':	
				System.out.println("D : slowly~");
				break;
			default:
				System.out.println("나머지 문자들 : what?");
				break;
		}
		
		scanner.close();
	}
}
