package day4;
import java.util.Scanner;
//���� 1

/**
* ����(1 ~ 100) 1���� �Է¹޾� 1���� �� ������ ¦���� ���� ���غ���.
* @author kim baek yu
*/
public class ex77 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
		scanner.close();
	}
}
