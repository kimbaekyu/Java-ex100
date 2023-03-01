package day4;
import java.util.Scanner;
//종합 7

/**
* 이미지가 컴퓨터에 저장될 때에도 디지털 데이터화 되어 저장된다.
* w, h, b 가 공백을 두고 입력된다. 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
* 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
* 단, 소수점 셋째 자리에서 반올림하여 둘째 자리까지 출력한다.
* @author kim baek yu
*/
public class ex85 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] data=str.split(" ");
		
		double result=0;
		
		for(int i=0;i<3;i++)
			System.out.println(data[i]);
		
		double w=Double.valueOf(data[0]);
		double h=Double.valueOf(data[1]);
		double b=Double.valueOf(data[2]);
		result=w*h*b/8/1024/1024;
		
		System.out.printf("%.2f MB",result);
		scanner.close();
		
	}
}
