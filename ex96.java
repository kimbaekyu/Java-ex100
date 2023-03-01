package day4;
import java.util.Scanner;
//리스트 5
//2차원 배열로 접근
/**
* 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
* 십자 뒤집기 횟수(n)가 입력된다.
* 십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
* 
* 십자 뒤집기 결과를 출력한다.
* @author kim baek yu
*/
public class ex96 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row=20;
		int col=20;
		
		int[][] arr=new int[row][col];
		
		//2차원 배열 초기화
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		//십자 뒤집기 횟수(n)가 입력
		int n=scanner.nextInt();
		
		//십자 뒤집기 좌표 입력. 단, n은 10이하의 자연수이다.
		for(int k=0;k<n;k++) {
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			
			//x행 전체 뒤집기
			for(int i=1;i<col;i++) {
				if(arr[x][i]==0)
					arr[x][i]=1;
				else
					arr[x][i]=0;
			}
			//y열 전체 뒤집기
			for(int j=1;j<row;j++) {
				if(arr[j][y]==0)
					arr[j][y]=1;
				else
					arr[j][y]=0;
			}
			
		}
		
		//바둑판의 상황을 출력한다.
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
