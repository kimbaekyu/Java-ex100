package day4;
import java.util.Scanner;
//���� 13

/**
* ���� �� ���ÿ� ������ �ο� 3���� ��Ģ������ �湮�ϴ�,\
* �湮 �ֱⰡ ������ �ΰ� �Էµȴ�. (��, �Է°��� 100������ �ڿ����̴�.)
* 
* 3���� �ٽ� ��� �Բ� �湮�� ������ Ǯ��� ��(���� ����/��� �� ��ĥ ��?)�� ����Ѵ�.
* @author kim baek yu
*/
public class ex91 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		int d=1;
		while(d%a!=0||d%b!=0||d%c!=0) {
			d++;
		}
		System.out.println(d);
		scanner.close();
	}
}
