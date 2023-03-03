package day5;
import java.util.Scanner;
//리스트 6
//2차원 배열로 접근

/**
* 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
* 성실한 개미가 이동한 경로를 9로 표시해 출력한다.
* 
* 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
* 먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.
* 단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 
* 먹이를 찾은 경우에는 더이상 이동하지 않고 그 곳에 머무른다고 가정한다.
* 미로 상자의 테두리는 모두 벽으로 되어 있으며,
* 개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.
* 
* @author kim baek yu
*/
public class ex98_end {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int board[][]=new int[11][11];
		
		//board[i][j] 값 입력
		for(int i=1;i<board.length;i++) {
			for(int j=1;j<board[i].length;j++) {
				board[i][j]=scanner.nextInt();
			}
		}
		
		//board[i][j] 경로 탐색(0: 갈 수 있는 곳,1:갈 수 없는 곳, 2:먹이위치)
		//시작은 board[2][2], 먹이를 발견하거나 더 이상 갈 수 없으면 종료
		int currentX=2; //가로 초기 탐색값
		int currentY=2;//세로 초기 탐색값
		for(int i=currentX;i<board.length-1;i++) {
				//먹이 발견 확인 후 경로 진행 변경 후 종료
				if(board[currentX][currentY]==8) {
					//멱이발견(값 8)확인 후 수정 후 종료
					board[currentX][currentY]=9;
					break;
				}
				//더 이상 아래로 갈수 없는지 확인 후 종료
				if(board[currentX][currentY]==5) {
					//아래로 이동할 수 없는 곳(값 5)확인 후 수정 후 종료
					board[currentX][currentY]=1;
					break;
				}
				
			for(int j=currentY;j<board[i].length-1;j++) {
				//먹이 발견 시
				if(board[i][j]==2) {
					currentX=i; //현재 X좌표 저장(종료 경로 확인하기 위해 저장)
					currentY=j; //현재 Y좌표 저장(종료 경로 확인하기 위해 저장)
					board[i][j]=8;//먹이발견후 종료 확인값 8로 설정
					//System.out.printf("END[board[%d][%d]=%d]\n",i,j,board[i][j]);
					break;
				}
				//아래로 갈 수 없는곳  발견시
				if(board[i][j]==1) {
					currentX=i; //현재 X좌표 저장(경로 유지하기 위해)
					board[i][j]=5;//먹이발견후 종료 확인값 5로 설정
					//System.out.println("meet 2. "+"i: "+i+" j: "+j+" currentX "+currentX+" currentY "+currentY+" board[i][j]"+board[i][j]);
					break;
				}
				
				//오른쪽 갈 수 없는곳  발견시
				if(board[i][j+1]==1) {
					currentY=j; //현재 Y좌표 저장(경로 유지하기 위해)
					board[i][j]=9;
					//System.out.println("meet 1. "+"i: "+i+" j: "+j+" currentX "+currentX+" currentY "+currentY);
					break;
				}
				
				//경로 진행시
				else {
					board[i][j]=9;
					//System.out.println("i: "+i+" j: "+j+" currentX "+currentX+" currentY "+currentY);
				}
				
				
			}
		}
				
		//board[i][j] 값 출력
		for(int i=1;i<board.length;i++) {
			for(int j=1;j<board[i].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
