// 입출력하기 10

/**
 * 24시간 시:분 형식으로 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
 * @author kim baek yu
*/

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String hour;
		String min;
		
		//hour,min 입력
		String time=scanner.next();
		//split 변수 저장 배열a
		String[] a=new String[2];
		
		//":"로 split
		a=time.split(":");
		
		//split 결과 후 hour와 min 저장
		hour=a[0];
		min=a[1];
		
		//출력
		System.out.println(hour+":"+min);
		
		scanner.close();
	}
}
