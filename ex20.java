// 입출력하기 12

/**
 * 주민번호를 입력받아 형태를 바꿔 출력(입력은 -로 구분=>출력은 -을 제외한 13자리만 출력)
 * @author kim baek yu
*/

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	//XXXXXX-XXXXXXX 형식으로 주민번호 입력
	String reg=scanner.next();
	//-으로 나눠진 결과를 저장하는 배열 선언
	String[] str=new String[2];
	//-으로 결과 분할 
	str=reg.split("-");
	//XXXXXXXXXXXX 형태로 결과출력
	System.out.println(str[0]+str[1]);
	
	scanner.close();
	}
}
