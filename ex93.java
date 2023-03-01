package day4;
import java.util.Scanner;
import java.util.ArrayList;
//리스트 2

/**
* 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다. 
* n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
* 
* 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
* @author kim baek yu
*/
public class ex93 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		
		//리스트 초기화
		for(int i=0;i<n;i++) {
			arrayList.add(0);
		}
			
		//출석 부른 번호 순서 바꾸어 출력
		for(int i=n;i>0;i--) {
			arrayList.set(n-i, Integer.valueOf(a[i-1]));
		}
		
		System.out.println(arrayList);
		scanner.close();
	}
}
