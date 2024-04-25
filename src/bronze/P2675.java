package bronze;

import java.io.*;
import java.util.*;

public class P2675 {
	
	/**
	 * 문제명 : 문자열 반복
	 * 
	 * 1. 문제
	 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
	 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
	 * 
	 * 2. 입력
	 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.  
	 * 
	 * 3. 출력
	 * 각 테스트 케이스에 대해 P를 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		String arr[] = new String[A];
		
		StringTokenizer st;
		StringBuilder sb;
		for(int i = 0;i < A;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb = new StringBuilder();
			
			int cnt = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			
			for(int j = 0;j < word.length();j++) {
				char c = word.charAt(j);
				
				int B = 0;
				while(B < cnt) {
					sb.append(c);
					B++;
				}
			}
			
			arr[i] = sb.toString();
		}
		
		for(int k = 0;k < arr.length;k++) {
			System.out.println(arr[k]);
		}
		
		br.close();
	}

}
