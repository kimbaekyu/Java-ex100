package day4;
import java.util.Scanner;
//���� 10

/**
* � ��Ģ�� ���� ���� ������� ������ ���� ����(sequences)�̶�� �Ѵ�.
* ���� ��(a), ����(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��
* n��° ���� ����ϴ� ���α׷��� ������.
* 
* ���� ��(a), ������ ��(d), �� ��° �� ������ �ǹ��ϴ� ����(n)�� ������ �ΰ� �Էµȴ�.(��� 0 ~ 100)
*
* n��° ���� ����Ѵ�.
* @author kim baek yu
*/
public class ex88 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int d=scanner.nextInt();
		int n=scanner.nextInt();
		int x=a;
		for(int i=1;i<n;i++) {
			//System.out.println(x);
			x=x+d;
		}
		System.out.println(x);
		scanner.close();
		
	}
}
