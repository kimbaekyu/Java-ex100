package day4;
import java.util.Scanner;
//���� 5

/**
* 16����(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)�� ���
* �����̴� 16�������� ���ϴ� 16���� ������?�� ���ؼ� �ñ�������.
* A, B, C, D, E, F �� �ϳ��� �Էµ� ��,
* 1���� F���� ���� 16���� �������� ������ ����غ���.(��, A ~ F ������ �Էµȴ�.)
* @author kim baek yu
*/
public class ex81 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//scanner.nextInt(radix)->(radix)������ �Է¹���.
		int num=scanner.nextInt(16);
		
		for(int i=0X1;i<=0XF;i++) {
			System.out.printf("%x * %x = %x\n",i,num,num*i);
		}
		
		scanner.close();
	}
}
