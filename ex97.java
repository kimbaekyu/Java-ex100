package day4;
import java.util.Scanner;
//����Ʈ 6
//2���� �迭�� ����
/**
* ù �ٿ� �������� ����(h), ����(w) �� ������ �ΰ� �Էµǰ�,
* �� ��° �ٿ� ���� �� �ִ� ������ ����(n)
* �� ��° �ٺ��� �� ������ ����(l), ����(d), ��ǥ(x, y)�� �Էµȴ�.
* 1 <= w, h <= 100
* 1 <= n <= 10
* d = 0 or 1
* 1 <= x <= 100-h
* 1 <= y <= 100-w
* 
* ��� ���븦 ���� �������� ���¸� ����Ѵ�.
* ���뿡 ���� ������ ��� 1, �ƴ� ��� 0���� ����Ѵ�. ��, �� ���ڴ� �������� �����Ͽ� ����Ѵ�.
* @author kim baek yu
*/
public class ex97 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//�������� ����(w), ����(h) �Է�
		int w=scanner.nextInt();
		int h=scanner.nextInt();
		
		//������ ����
		int[][] board=new int[w][h];
		
		//������ �ʱ�ȭ
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				board[i][j]=0;
			}
		}
		
		//���� �� �ִ� ������ ����(n) �Է�
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			//�� ������ ����(l), ����(d), ��ǥ(x, y)�� �Է�
			int l=scanner.nextInt();
			int d=scanner.nextInt();
			int x=scanner.nextInt()-1;
			int y=scanner.nextInt()-1;
			
			int initX=x;int initY=y;
			
			//���� ���ι��� �϶� �� ����, �� ����
			if(d==0) {
				for(int idx=0;idx<l;idx++) {
					board[x][initY++]=1;
				}
			}
			//���� ���ι��� �϶� �� ����, �� ����
			if(d==1){
				for(int idx=0;idx<l;idx++) {
					board[initX++][y]=1;
				}
			}
			
		}
		
		//��� ���븦 ���� �������� ���¸� ����Ѵ�.
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				System.out.printf(board[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
