package day4;
import java.util.Scanner;
//���� 4

/**
* 1���� n����, 1���� m���� ���ڰ� ���� ���� �ٸ� �ֻ��� 2���� ������ ��,
* ���� �� �ִ� ��� ��츦 ����غ���.
* @author kim baek yu
*/
public class ex80 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		System.out.println("i"+" "+"j");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
