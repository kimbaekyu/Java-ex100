package day4;
import java.util.Scanner;
//���� 3

/**
* 1, 2, 3 ... �� ��� ���� ���� ��,
* �� ���� �Է��� ����(0 ~ 1000)���� ���ų� ���� ��������
* ��� ���ϴ� ���α׷��� �ۼ��غ���.
* ��, 1���� n���� ������ ��� ���� �����ٰ� �� ��,
* ������ ���ؾ� �Է��� ������ ���ų� Ŀ���� ���� �˾ƺ������ϴ� �����̴�.
* @author kim baek yu
*/
public class ex79 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int inputSum=scanner.nextInt();
		int sum=0;
		int i=1;
		scanner.close();
		
		for(i=1;i<=1000;i++) {
			sum+=i;
			if(sum==inputSum)
				break;
		}
		
		System.out.println(i+"������ ��: "+inputSum);
		
		
	}
}
