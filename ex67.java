package day4;
import java.util.Scanner;
//���� ����,���ý��౸�� 3

/**
* 0�� �ƴ� ���� 1���� �ԷµǾ��� ��, ��(-)/��(+)�� ¦(even)/Ȧ(odd)�� ������ �з��غ���.
* �����̸鼭 ¦���̸�, A
* �����̸鼭 Ȧ���̸�, B
* ����̸鼭 ¦���̸�, C
* ����̸鼭 Ȧ���̸�, D
* �� ����Ѵ�.
* @author kim baek yu
*/
public class ex67 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		
		//a ��(-)/��(+) ����
		
		//a�� �����϶�
		if(a<0) {
			if(a%2==0)
				System.out.println("A "+a);
			else
				System.out.println("B "+a);
		}
		
		//a�� ����϶�	
		else {
			if(a%2==0)
				System.out.println("C "+a);
			else
				System.out.println("D "+a);
		}
		
		scanner.close();
	}
}
