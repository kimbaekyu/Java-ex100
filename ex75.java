package day4;
import java.util.Scanner;
//�ݺ����౸�� 5

/**
* ����(0 ~ 100) 1���� �Է¹޾� 0���� �� ������ ������� ����غ���. while�� �̿�
* @author kim baek yu
*/
public class ex75 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int n=0;
		
		while(n<=num) {
			System.out.println(n++);
		}
		scanner.close();
	}
}
