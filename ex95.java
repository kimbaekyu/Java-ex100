package day4;
import java.util.Scanner;
//리스트 4
//2차원 배열로 접근
/**
* 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
* 둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
* n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 똑같은 좌표는 입력되지 않는다.
* 
* 흰 돌이 올려진 바둑판의 상황을 출력한다.
* 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
* @author kim baek yu
*/
public class ex95 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=19;
		int col=19;
		
		int[][] arr=new int[row][col];
		
		//2차원 배열 초기화
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=0;
			}
		}
		//바둑판에 올려 놓을 흰 돌의 개수(n) 입력
		int n=scanner.nextInt();
		
		//흰 돌을 놓을 좌표 입력
		for(int i=0;i<n;i++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			arr[x-1][y-1]=1;
		}
		
		//흰 돌이 올려진 바둑판의 상황을 출력한다.
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
