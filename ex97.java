package day4;
import java.util.Scanner;
//리스트 6
//2차원 배열로 접근
/**
* 첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
* 두 번째 줄에 놓을 수 있는 막대의 개수(n)
* 세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
* 1 <= w, h <= 100
* 1 <= n <= 10
* d = 0 or 1
* 1 <= x <= 100-h
* 1 <= y <= 100-w
* 
* 모든 막대를 놓은 격자판의 상태를 출력한다.
* 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다. 단, 각 숫자는 공백으로 구분하여 출력한다.
* @author kim baek yu
*/
public class ex97 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//격자판의 가로(w), 세로(h) 입력
		int w=scanner.nextInt();
		int h=scanner.nextInt();
		
		//격자판 생성
		int[][] board=new int[w][h];
		
		//격자판 초기화
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				board[i][j]=0;
			}
		}
		
		//놓을 수 있는 막대의 개수(n) 입력
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			//각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력
			int l=scanner.nextInt();
			int d=scanner.nextInt();
			int x=scanner.nextInt()-1;
			int y=scanner.nextInt()-1;
			
			int initX=x;int initY=y;
			
			//막대 가로방향 일때 행 고정, 열 변경
			if(d==0) {
				for(int idx=0;idx<l;idx++) {
					board[x][initY++]=1;
				}
			}
			//막대 세로방향 일때 열 고정, 행 변경
			if(d==1){
				for(int idx=0;idx<l;idx++) {
					board[initX++][y]=1;
				}
			}
			
		}
		
		//모든 막대를 놓은 격자판의 상태를 출력한다.
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				System.out.printf(board[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
