package bronze;

import java.io.*;
import java.util.*;

public class P15552 {
	
	/**
	 * 문제명 : 빠른 A+B
	 * 
	 * 1. 입력
	 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다. 
	 * 
	 * 2. 출력
	 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
        
		br.close();
		bw.flush();
	}

}
