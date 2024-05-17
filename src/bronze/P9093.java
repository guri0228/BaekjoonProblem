package bronze;

import java.io.*;
import java.util.*;

public class P9093 {
	
	/**
	 * 문제명 : 단어 뒤집기
	 * 
	 * 1. 문제
	 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
	 * 
	 * 2. 입력
	 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.  
	 * 
	 * 3. 출력
	 * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder result = new StringBuilder();
		
		for(int i = 0;i < T;i++) {
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				//StringBuilder 사용, Stack 사용으로 전환 가능
				StringBuilder sb = new StringBuilder(st.nextToken());
				
				//문자열 reverse, charAt으로 역순 가능
				result.append(sb.reverse()).append(" ");
			}
			
			result.append("\n");
		}
		
		br.close();
		System.out.print(result);
	}

}
