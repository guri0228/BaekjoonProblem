package bronze;

import java.util.*;

public class P2439 {

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
