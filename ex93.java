package day4;
import java.util.Scanner;
import java.util.ArrayList;
//����Ʈ 2

/**
* ��ȣ�� �θ� Ƚ��(n, 1 ~ 10000)�� ù �ٿ� �Էµȴ�. 
* n���� ���� ��ȣ(k, 1 ~ 23)�� �� ��° �ٿ� ������ ���̿� �ΰ� ������� �Էµȴ�.
* 
* �⼮�� �θ� ��ȣ ������ �ٲپ� ������ �ΰ� ����Ѵ�.
* @author kim baek yu
*/
public class ex93 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		
		//����Ʈ �ʱ�ȭ
		for(int i=0;i<n;i++) {
			arrayList.add(0);
		}
			
		//�⼮ �θ� ��ȣ ���� �ٲپ� ���
		for(int i=n;i>0;i--) {
			arrayList.set(n-i, Integer.valueOf(a[i-1]));
		}
		
		System.out.println(arrayList);
		scanner.close();
	}
}
