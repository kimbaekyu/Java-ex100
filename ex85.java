package day4;
import java.util.Scanner;
//���� 7

/**
* �̹����� ��ǻ�Ϳ� ����� ������ ������ ������ȭ �Ǿ� ����ȴ�.
* w, h, b �� ������ �ΰ� �Էµȴ�. ��, w, h�� ��� �����̰� 1~1024 �̴�. b�� 40������ 4�� ����̴�.
* �ʿ��� ���� ������ MB ������ �ٲپ� ����Ѵ�.
* ��, �Ҽ��� ��° �ڸ����� �ݿø��Ͽ� ��° �ڸ����� ����Ѵ�.
* @author kim baek yu
*/
public class ex85 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] data=str.split(" ");
		
		double result=0;
		
		for(int i=0;i<3;i++)
			System.out.println(data[i]);
		
		double w=Double.valueOf(data[0]);
		double h=Double.valueOf(data[1]);
		double b=Double.valueOf(data[2]);
		result=w*h*b/8/1024/1024;
		
		System.out.printf("%.2f MB",result);
		scanner.close();
		
	}
}
