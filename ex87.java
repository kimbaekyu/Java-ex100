package day4;
import java.util.Scanner;
//���� 9

/**
* 1���� �Է��� �������� 1�� �������� ����ϴ� ���α׷��� �ۼ��ϵ�,
* 3�� ����� ���� ������� �ʵ��� ������.
* 
* ���� 1���� �Է¹޴´�.(1 ~ 100)
* 1���� �Է��� �������� �۰ų� ���� ������ 1�� �������� ����ϵ� 3�� ����� ������� �ʴ´�.
* @author kim baek yu
*/
public class ex87 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				
			}
			else {
				System.out.printf(i+" ");
			}
		}
		scanner.close();
		
	}
}
