package day4;
import java.util.Scanner;
//���� 2

/**
* ���� �ҹ��� 'q'�� �Էµ� ������ �Է��� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��غ���.
* @author kim baek yu
*/
public class ex78 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch='0';
		while(ch!='q') {
			ch=scanner.next().charAt(0);
			if(ch=='q')
				System.out.println("Exit \n"+ch);
			else
				System.out.println(ch);
		}
		scanner.close();
	}
}
