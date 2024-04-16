package bronze;

import java.io.*;
import java.util.*;

public class P2675 {

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
