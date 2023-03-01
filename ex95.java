package day4;
import java.util.Scanner;
//����Ʈ 4
//2���� �迭�� ����
/**
* �ٵ��ǿ� �÷� ���� �� ���� ����(n)�� ù �ٿ� �Էµȴ�.
* ��° �� ���� n+1 ��° �ٱ��� �� ���� ���� ��ǥ(x, y)�� n�� �Էµȴ�.
* n�� 10������ �ڿ����̰� x, y ��ǥ�� 1 ~ 19 �����̸�, �Ȱ��� ��ǥ�� �Էµ��� �ʴ´�.
* 
* �� ���� �÷��� �ٵ����� ��Ȳ�� ����Ѵ�.
* �� ���� �ִ� ��ġ�� 1, ���� ���� 0���� ����Ѵ�.
* @author kim baek yu
*/
public class ex95 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=19;
		int col=19;
		
		int[][] arr=new int[row][col];
		
		//2���� �迭 �ʱ�ȭ
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=0;
			}
		}
		//�ٵ��ǿ� �÷� ���� �� ���� ����(n) �Է�
		int n=scanner.nextInt();
		
		//�� ���� ���� ��ǥ �Է�
		for(int i=0;i<n;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			arr[x-1][y-1]=1;
		}
		
		//�� ���� �÷��� �ٵ����� ��Ȳ�� ����Ѵ�.
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
