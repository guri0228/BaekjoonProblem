package silver;

import java.util.*;

public class P1676 {
	
	/**
	 * 문제
	 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
	 */
	
	/**
	 * 입력
	 * 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
	 */
	
	/**
	 * 출력
	 * 첫째 줄에 구한 0의 개수를 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int N = sc.nextInt();
		
		while(N >= 5) {
			cnt += N / 5;
			N /= 5;
		}
		
		sc.close();
		System.out.print(cnt);
	}
}