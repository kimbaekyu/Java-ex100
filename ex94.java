package day4;
import java.util.Scanner;
import java.util.ArrayList;
//����Ʈ 3

/**
* ��ȣ�� �θ� Ƚ��(n, 1 ~ 10000)�� ù �ٿ� �Էµȴ�.
* n���� ���� ��ȣ(k)�� �� ��° �ٿ� ������ ���̿� �ΰ� ������� �Էµȴ�.
* 
* �⼮�� �θ� ��ȣ �߿� ���� ���� ��ȣ�� ����Ѵ�.
* @author kim baek yu
*/
public class ex94 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		int min=23;
		
		//����Ʈ �ʱ�ȭ
		for(int i=0;i<n;i++) {
			arrayList.add(0);
		}
			
		//�⼮ �θ� ��ȣ ����Ʈ�� ����
		for(int i=0;i<n;i++) {
			arrayList.set(i, Integer.valueOf(a[i]));
		}
		
		//�⼮ �θ� ��ȣ �� ���� ���� ��ȣ ����
		for(int i=0;i<n;i++) {
			int num=arrayList.get(i);
			
			if(num<=min) {
				min=num;
				//System.out.println(min);
			}
		}
		
		System.out.println("min: "+min);
		scanner.close();
	}
}
