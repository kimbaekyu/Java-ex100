package day4;
import java.util.Scanner;
import java.util.ArrayList;
//리스트 1

/**
* 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
* 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
* 
* 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
* @author kim baek yu
*/
public class ex92 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> check = new ArrayList<Integer>();
		int n=scanner.nextInt();
		scanner.nextLine();
		String str=scanner.nextLine();
		String[] a=str.split(" ");
		
		//리스트 초기화
		for(int i=0;i<23;i++) {
			check.add(0);
		}
		
		//출석 불린 횟수 증가
		for(int i=0;i<n;i++) {
			int idx=Integer.valueOf(a[i])-1;
			int chk=check.get(idx);
			check.set(idx, chk+1);
		}
		
		System.out.println(check);
		scanner.close();
	}
}
