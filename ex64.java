package day4;
import java.util.Scanner;
//���� 3�� ���� 2

/**
* �Էµ� �� ���� a, b, c �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��غ���. ��, 3�� ������ ����Ѵ�.
* @author kim baek yu
*/

public class ex64 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int min;
		
		Scanner scanner=new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		
		//3�� ������ (���ǹ�)?(���϶�):(�����϶�)
		min=a<b?a:b;
		min=c<min?c:min;
		 
		System.out.println(min);
		scanner.close();
	}
}
