package day4;
import java.util.Scanner;
//���� ����,���ý��౸�� 4

/**
* ����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ����غ���.
* �� ����
* ���� ���� : ��
*  90 ~ 100 : A
*  70 ~  89 : B
*  40 ~  69 : C
*  0 ~   39 : D
* �� �򰡵Ǿ�� �Ѵ�.
* @author kim baek yu
*/
public class ex68 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		if(n>=90&&n<=100)
			System.out.println("A");
		if(n>=70&&n<90)
			System.out.println("B");
		if(n>=40&&n<70)
			System.out.println("C");
		if(n>=0&&n<40)
			System.out.println("D");
		
		scanner.close();
	}
}
