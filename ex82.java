package day4;
import java.util.Scanner;
//���� 6

/**
* ģ����� �Բ� 3 6 9 ������ �ϴ� �����̴� ���� �Ǽ� ������ ����ؼ� ��Ģ�� �ް� �Ǿ���.
* 3 6 9 ������ ���� �Ǳ� ���� 369 ������ ���α׷��� �ۼ��� ����.
* 30 ���� ���� ���� 1���� �Էµȴ�.(1 ~ 29)
* 1 ���� �� ������ ������� ������ �ΰ� ���� ����ϴµ�,
* 3 �Ǵ� 6 �Ǵ� 9�� ���� �Ǿ��ִ� ���� ���, �� �� ��� ���� �빮�� X �� ����Ѵ�.
* @author kim baek yu
*/
public class ex82 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%10==3) {
				System.out.print("X ");
			}
			else if(i%10==6) {
				System.out.print("X ");
			}
			else if(i%10==9) {
				System.out.print("X ");
			}
			else
				System.out.print(i+" ");
		}
		scanner.close();
	}
}
