package day4;
import java.util.Scanner;
//기초 조건,선택실행구조 6

/**
* 월이 입력될 때 계절 이름이 출력되도록 해보자.
* 월 : 계절 이름
* 12, 1, 2 : winter
* 3, 4, 5 : spring
* 6, 7, 8 : summer
* 9, 10, 11 : fall
* @author kim baek yu
*/
public class ex70 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		
		switch(month) {
			case 12:
			case 1:
			case 2:	
				System.out.println("winter");
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("fall");
				break;
				
			default:
				System.out.println("다시 입력해주세요(1~12)");
				break;
		}
		
		scanner.close();
	}
}
