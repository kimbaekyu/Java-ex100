package day4;
import java.util.Scanner;
//�ݺ����౸�� 1

/**
* ������ ������ ���� �ٲ� ��� �Էµȴ�.(-2147483648 ~ +2147483647)
* �� ������ �� �� ����.
* 0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
* @author kim baek yu
*/
public class ex71 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//while�� ó�� ���� �˻縦 ����ϱ� ���� 0 �ƴ� ���� ���Ƿ� ����
		int n=1;
		
		while(n!=0) {
			n=scanner.nextInt();
			if(n!=0)
				System.out.println(n);
			else
				break;
		}
		scanner.close();
	}
}
