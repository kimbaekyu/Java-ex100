package day4;
import java.util.Scanner;
//�ݺ����౸�� 6

/**
* ����(0 ~ 100) 1���� �Է¹޾� 0���� �� ������ ������� ����غ���. for�� �̿�
* @author kim baek yu
*/
public class ex76 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		for(int i=0;i<=num;i++){
			System.out.println(i);
		}
		scanner.close();
	}
}

