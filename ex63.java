package day4;
import java.util.Scanner;
//���� 3�� ���� 1

/**
* �Էµ� �� ����(a, b) �� ū ���� ����ϴ� ���α׷��� �ۼ��غ���. ��, 3�� ������ ����Ѵ�.
* @author kim baek yu
*/

public class ex63 {
	public static void main(String[] args) {
		int a;
		int b;
		
		int max;
		
		Scanner scanner=new Scanner(System.in);
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		//3�� ������ (���ǹ�)?(���϶�):(�����϶�)
		max=a>b?a:b;		 
		System.out.println(max);
		 
		scanner.close();
	}
}
