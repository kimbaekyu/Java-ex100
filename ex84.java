package day4;
import java.util.Scanner;
//종합 7

/**
* 소리가 컴퓨터에 저장될 때에는 디지털 데이터화 되어 저장된다.
* 마이크를 통해 1초에 적게는 수십 번, 많게는 수만 번 소리의 강약을 체크하고,
* 한 번씩 체크할 때 마다 그 값을 정수값으로 바꾸어 저장하는 방식으로 소리를 파일로 저장할 수 있다.
* 1초 동안 마이크로 소리강약을 체크하는 횟수를 h(헤르쯔, Hz 는 1초에 몇 번? 체크하는가를 의미한다.)
* 한 번 체크한 값을 저장할 때 사용하는 비트수를 b(2비트를 사용하면 0 또는 1 두 가지, 16비트를 사용하면 65536가지..)
* 좌우 등 소리를 저장할 트랙 개수인 채널 개수를 c(모노는 1개, 스테레오는 2개의 트랙으로 저장함을 의미한다.)
* 녹음할 시간(초) s가 주어질 때, 필요한 저장 용량을 계산하는 프로그램을 작성해보자.
* 
* h, b, c, s 가 공백을 두고 입력된다.
* h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
* 
* 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 단, 소수점 첫째 자리까지의 정확도로 출력하고 MB를 공백을 두고 출력한다.
* @author kim baek yu
*/
public class ex84 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double h=scanner.nextInt();
		double b=scanner.nextInt();
		double c=scanner.nextInt();
		double s=scanner.nextInt();
		
		double data=(((h*b*c*s)/8)/1024)/1024;
		System.out.printf("%.1f MB",data);
		scanner.close();
	}
}
