package day4;
import java.util.Scanner;
//���� 11

/**
* ��� ���� ���ϱ�
* 
* � ��Ģ�� ���� ���� ������� ������ ���� ����(sequences)�̶�� �Ѵ�.
* ���� ��(a), ����� ��(r), �� ��° ������ ��Ÿ���� ����(n)�� ������ �ΰ� �Էµȴ�.(��� 0 ~ 10)
* n��° ���� ����Ѵ�.
* @author kim baek yu
*/
public class ex89 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int r=scanner.nextInt();
		int n=scanner.nextInt();
		int x=a;
		
		for(int i=1;i<n;i++) {
			//System.out.println(x);
			x=x*r;
		}
		System.out.println(x);
		scanner.close();
		
	}
}
