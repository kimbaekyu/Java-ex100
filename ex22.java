package day2;
import java.util.Scanner;
//입출력하기 14

/**
* 6자리의 연월일(YYMMDD)을 입력받아 나누어 출력해보자.
* 6자리 숫자로 이루어진 연월일(YYMMDD)이 입력된다.
* 년도(YY) 월(MM) 일(DD)을 공백으로 구분해 한 줄로 출력한다.
* @author kim baek yu
*/

public class ex22 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
	
		String year=str.substring(0, 2);
		String month=str.substring(2, 4);
		String day=str.substring(4,6);
		System.out.println(year+" "+month+" "+day);
		scanner.close();
	}
}
