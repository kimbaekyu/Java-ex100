package day4;
import java.util.Scanner;
//���� 7

/**
* ����(red), �ʷ�(green), �Ķ�(blue) ���� ���� ���� ���� �ٸ� �� ���� ����� ������ �Ѵ�.
* ����(r), �ʷ�(g), �Ķ�(b) �� ���� �������� �־��� ��,
* �־��� rgb ������ ���� ���� �� �ִ� ��� ����� ����(r g b)�� ���� �� �ִ� ���� ���� ���� ����غ���.  
* �����, ����Ʈ���� ���� ���÷��̿��� �� �ȼ��� ���� ������ ���ؼ� r, g, b ���� ������ �� �ִ�.
* �ȼ�(pixel)�� �׸�(picture)�� �����ϴ� ��(cell)���� �̸��� ���������.
* 
* ������(r, g, b) �� ���� �������� ������ �ΰ� �Էµȴ�.
* ���� ���, 3 3 3 �� ������ ���� ���ؼ� ���� 0~2���� 3���� ���� ������ �ǹ��Ѵ�.
* 0 <= r,g,b <= 127

* ���� �� �ִ� rgb ���� ������ ��������(����� �ö󰡴� ��, 12345... abcde..., �����ٶ�...)����
* ���� �ٲ� ��� ����ϰ�, �������� �� ������ ����Ѵ�.
* @author kim baek yu
*/
public class ex83 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int r=scanner.nextInt();
		int g=scanner.nextInt();
		int b=scanner.nextInt();
		int cnt=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.println(i+" "+j+" "+k);
					cnt++;
				}
			}
		}
		System.out.println("���� �� �ִ� rgb �� ����: "+cnt);
		scanner.close();
	}
}
