package day4;
import java.util.Scanner;
//종합 2

/**
* 영문 소문자 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
* @author kim baek yu
*/
public class ex78 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch='0';
		while(ch!='q') {
			ch=scanner.next().charAt(0);
			if(ch=='q')
				System.out.println("Exit \n"+ch);
			else
				System.out.println(ch);
		}
		scanner.close();
	}
}
