package day4;
import java.util.Scanner;
import java.util.ArrayList;
//리스트 3

/**
* 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
* n개의 랜덤 번호(k)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
* 
* 출석을 부른 번호 중에 가장 빠른 번호를 출력한다.
* @author kim baek yu
*/
public class ex94 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		int min=23;
		
		//리스트 초기화
		for(int i=0;i<n;i++) {
			arrayList.add(0);
		}
			
		//출석 부른 번호 리스트에 저장
		for(int i=0;i<n;i++) {
			arrayList.set(i, Integer.valueOf(a[i]));
		}
		
		//출석 부른 번호 중 가장 빠른 번호 저장
		for(int i=0;i<n;i++) {
			int num=arrayList.get(i);
			
			if(num<=min) {
				min=num;
				//System.out.println(min);
			}
		}
		
		System.out.println("min: "+min);
		scanner.close();
	}
}
