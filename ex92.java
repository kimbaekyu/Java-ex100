package day4;
import java.util.Scanner;
import java.util.ArrayList;
//����Ʈ 1

/**
* ù ��° �ٿ� �⼮ ��ȣ�� �θ� Ƚ���� ���� n�� �Էµȴ�. (1 ~ 10000)
* �� ��° �ٿ��� �������� �θ� n���� ��ȣ(1 ~ 23)�� ������ �ΰ� ������� �Էµȴ�.
* 
* 1������ ��ȣ�� �Ҹ� Ƚ���� ������� �������� �����Ͽ� �� �ٷ� ����Ѵ�.
* @author kim baek yu
*/
public class ex92 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> check = new ArrayList<Integer>();
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		
		//����Ʈ �ʱ�ȭ
		for(int i=0;i<23;i++) {
			check.add(0);
		}
		
		//�⼮ �Ҹ� Ƚ�� ����
		for(int i=0;i<n;i++) {
			int idx=Integer.valueOf(a[i])-1;
			int chk=check.get(idx);
			check.set(idx, chk+1);
		}
		
		System.out.println(check);
		scanner.close();
	}
}
