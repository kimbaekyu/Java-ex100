package day4;
import java.util.Scanner;
//���� ����,���ý��౸�� 5

/**
* �򰡸� ����(A, B, C, D, ...)�� �Է¹޾� ������ �ٸ��� ����غ���.
* �� ����
* �� : ����
* A : best!!!
* B : good!!
* C : run!
* D : slowly~
* ������ ���ڵ� : what?
* @author kim baek yu
*/
public class ex69 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("A : best!!!");
				break;
			case 'B':
			case 'b':	
				System.out.println("B : good!!");
				break;
			case 'C':
			case 'c':	
				System.out.println("C : run!");
				break;
			case 'D':
			case 'd':	
				System.out.println("D : slowly~");
				break;
			default:
				System.out.println("������ ���ڵ� : what?");
				break;
		}
		
		scanner.close();
	}
}
