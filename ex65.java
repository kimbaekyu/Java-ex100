package day4;
import java.util.Scanner;
//���� ����,���ý��౸�� 1

/**
* 3���� ����(a, b, c)�� �ԷµǾ��� ��, ¦���� ����غ���.
* @author kim baek yu
*/
public class ex65 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		if(a%2==0)
			System.out.println(a);
		if(b%2==0)
			System.out.println(b);
		if(c%2==0)
			System.out.println(c);
		
		scanner.close();
	}
}
