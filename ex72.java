package day4;
import java.util.Scanner;
//�ݺ����౸�� 2

/**
* ����(1 ~ 100) 1���� �ԷµǾ��� �� ī��Ʈ�ٿ��� ����غ���.
* 1��ŭ�� ���̸鼭 ī��Ʈ�ٿ� ���� 1�� �� ������ �� �ٿ� 1���� ����Ѵ�.
* @author kim baek yu
*/
public class ex72 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		while(n!=0) {
			System.out.println(n);
			n--;	
		}
		scanner.close();
	}
}
