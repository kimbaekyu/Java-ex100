package day4;
import java.util.Scanner;
//�ݺ����౸�� 4

/**
* ���� �ҹ���(a ~ z) 1���� �ԷµǾ��� ��, a���� �� ���ڱ����� ���ĺ��� ������� ����غ���.
* @author kim baek yu
*/
public class ex74 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char ch=scanner.next().charAt(0);
		char alpha='a';
		while(ch>=alpha) {
			System.out.println(alpha);
			alpha++;
		}
		scanner.close();
	}
}
