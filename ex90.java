package day4;
import java.util.Scanner;
//���� 12

/**
* ���� ��(a), ���� ��(m), ���� ��(d), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��,
* n��° ���� ����ϴ� ���α׷��� ������.
* @author kim baek yu
*/
public class ex90 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int m=scanner.nextInt();
		int d=scanner.nextInt();
		int n=scanner.nextInt();
		int x=a;
		
		for(int i=1;i<n;i++) {
			//System.out.println(x);
			x=x*m+d;
		}
		System.out.println(x);
		scanner.close();
	}
}
