package day4;
import java.util.Scanner;
//���� ����,���ý��౸�� 2

/**
* 3���� ����(a, b, c)�� �ԷµǾ��� ��, ¦(even)/Ȧ(odd)�� ����غ���.
* @author kim baek yu
*/
public class ex66 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		//a ¦/Ȧ ����
		if(a%2==0)
			System.out.println("Even "+a);
		else
			System.out.println("Odd "+a);
		
		//b ¦/Ȧ ����
		if(b%2==0)
			System.out.println("Even "+b);
		else
			System.out.println("Odd "+b);
		
		//c ¦/Ȧ ����
		if(c%2==0)
			System.out.println("Even "+c);
		else
			System.out.println("Odd "+c);
		
		scanner.close();
	}
}
