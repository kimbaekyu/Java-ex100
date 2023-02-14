// 입출력하기 3

/**
 * 변수에 실수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력해보자.
 * @author kim baek yu
*/
import java.util.Scanner;
public class ex11 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//입력
		Double num=scanner.nextDouble();
		
		//출력
		System.out.println(num);
		
		scanner.close();
	}
}
