// 입출력하기 11

/**
 * "연도.월.일"을 입력받아 "일-월-연도" 순서로 바꿔 출력해보자.
 * @author kim baek yu
*/

import java.util.Scanner;
public class ex19 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//연도.월.일 입력
		String str=scanner.next();
		//.으로 구분할 결과를 저장할 배열 선언
		String[] ymd=new String[3];
		
		//.으로 연도, 월, 일 구분
		ymd=str.split("\\.");
		
		String year=ymd[0];
		String month=ymd[1];
		String day=ymd[2];
		
		//결과 출력
		System.out.println(day+"-"+month+"-"+year);
		
		scanner.close();
	}
}
