package day4;
import java.util.Scanner;
//�ݺ����౸�� 3

/**
* ����(1 ~ 100) 1���� �ԷµǾ��� �� ī��Ʈ�ٿ��� ����غ���.
* 1��ŭ�� ���̸鼭 ī��Ʈ�ٿ� ���� 0�� �� ������ �� �ٿ� 1���� ����Ѵ�.
* @author kim baek yu
*/
public class ex73 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int count=n-1;
		while(count!=-1) {
			System.out.println(count);
			count--;	
		}
		scanner.close();
	}
}
