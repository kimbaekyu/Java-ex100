package day4;
import java.util.Scanner;
//���� 8

/**
* 1, 2, 3 ... �� ������� ��� ���� ���� ����µ�,
* �� ���� �Է��� �������� ���� ���ȸ� ��� ���ϴ� ���α׷��� �ۼ��غ���.
* 
* ��, 1���� n���� ������ �ϳ��� ���� ���� ����µ�,
* ������ ���ؾ� �Է��� ������ ���ų� Ŀ������ �˾ƺ����� �ϴ� �����̴�.
* <�Է�>
* �������� ���� ����� ��, ���� 1���� �Է¹޴´�. ��, �ԷµǴ� �ڿ����� 100,000,000�����̴�.
* <���>
* 1, 2, 3, 4, 5 ... ������� ��� ���ذ��ٰ�, �� ���� �Էµ� �������� Ŀ���ų� �������� ���,
* �׶������� ���� ����Ѵ�.
* @author kim baek yu
*/
public class ex86 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int inputSum=scanner.nextInt();
		int sum=0;
		int i=1;
		scanner.close();
		
		for(i=1;sum<=inputSum;i++) {
			sum+=i;
			if(sum>=inputSum)
				break;
		}
		System.out.println(i+" ������ ��: "+sum);
		
	}
}
