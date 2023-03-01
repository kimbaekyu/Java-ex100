package day4;
import java.util.Scanner;
//����Ʈ 5
//2���� �迭�� ����
/**
* �ٵϾ��� ��� �ִ� ��Ȳ�� 19 * 19 ũ���� ���������� �Էµȴ�.
* ���� ������ Ƚ��(n)�� �Էµȴ�.
* ���� ������ ��ǥ�� Ƚ��(n) ��ŭ �Էµȴ�. ��, n�� 10������ �ڿ����̴�.
* 
* ���� ������ ����� ����Ѵ�.
* @author kim baek yu
*/
public class ex96 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=20;
		int col=20;
		
		int[][] arr=new int[row][col];
		
		//2���� �迭 �ʱ�ȭ
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		//���� ������ Ƚ��(n)�� �Է�
		int n=scanner.nextInt();
		
		//���� ������ ��ǥ �Է�. ��, n�� 10������ �ڿ����̴�.
		for(int k=0;k<n;k++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			
			//x�� ��ü ������
			for(int i=1;i<col;i++) {
				if(arr[x][i]==0)
					arr[x][i]=1;
				else
					arr[x][i]=0;
			}
			//y�� ��ü ������
			for(int j=1;j<row;j++) {
				if(arr[j][y]==0)
					arr[j][y]=1;
				else
					arr[j][y]=0;
			}
			
		}
		
		//�ٵ����� ��Ȳ�� ����Ѵ�.
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
