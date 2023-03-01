package day4;
import java.util.Scanner;
//종합 13

/**
* 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,\
* 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
* 
* 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
* @author kim baek yu
*/
public class ex91 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		int d=1;
		while(d%a!=0||d%b!=0||d%c!=0) {
			d++;
		}
		System.out.println(d);
		scanner.close();
	}
}
