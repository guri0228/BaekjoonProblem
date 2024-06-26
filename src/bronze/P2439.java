package bronze;

import java.util.*;

public class P2439 {
	
	/**
	 * 문제명 : 별 찍기 - 2
	 * 
	 * 1. 문제
	 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. 
	 * 
	 * 3. 출력
	 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < N;i++) {
			int starCnt = 1;
			int spaceCnt = 1;
			
			while(i + spaceCnt < N) {
				sb.append(" ");
				spaceCnt++;
			}
			
			while(starCnt <= i + 1) {
				sb.append("*");
				starCnt++;
			}
			
			sb.append("\n");
		}
		
		sc.close();
		System.out.print(sb);

	}

}
