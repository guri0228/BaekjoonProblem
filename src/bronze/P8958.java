package bronze;

import java.io.*;
import java.util.*;

public class P8958 {

	/*
	 * 입력
	 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
	 */
	
	/*
	 * 출력
	 * 각 테스트 케이스마다 점수를 출력한다.
	 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < cnt;i++) {
			st = new StringTokenizer(br.readLine());
			
			String problem = st.nextToken();
			
			int sum = 0;
			int score = 1;
			for(int j = 0;j < problem.length();j++) {
				char c = problem.charAt(j);
				
				if(c == 'O') {
					sum += score;
					score++;
				}else {
					score = 1;
				}
			}
			
			sb.append(sum + "\n");
		}
		
		br.close();
		
		System.out.print(sb);
		
	}

}
