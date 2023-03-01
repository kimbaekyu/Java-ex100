package day4;
import java.util.Scanner;
//종합 7

/**
* 빨강(red), 초록(green), 파랑(blue) 빛을 섞어 여러 가지 다른 색 빛을 만들어 내려고 한다.
* 빨강(r), 초록(g), 파랑(b) 각 빛의 가짓수가 주어질 때,
* 주어진 rgb 빛들을 섞어 만들 수 있는 모든 경우의 조합(r g b)과 만들 수 있는 색의 가짓 수를 계산해보자.  
* 모니터, 스마트폰과 같은 디스플레이에서 각 픽셀의 색을 만들어내기 위해서 r, g, b 색을 조합할 수 있다.
* 픽셀(pixel)은 그림(picture)을 구성하는 셀(cell)에서 이름이 만들어졌다.
* 
* 빨녹파(r, g, b) 각 빛의 가짓수가 공백을 두고 입력된다.
* 예를 들어, 3 3 3 은 빨녹파 빛에 대해서 각각 0~2까지 3가지 색이 있음을 의미한다.
* 0 <= r,g,b <= 127

* 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
* 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
* @author kim baek yu
*/
public class ex83 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int r=scanner.nextInt();
		int g=scanner.nextInt();
		int b=scanner.nextInt();
		int cnt=0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.println(i+" "+j+" "+k);
					cnt++;
				}
			}
		}
		System.out.println("만들 수 있는 rgb 색 갯수: "+cnt);
		scanner.close();
	}
}
