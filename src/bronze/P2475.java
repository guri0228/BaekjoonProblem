package bronze;

import java.io.*;
import java.util.*;

public class P2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		for(int i = 0;i < 5;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			sum += tmp * tmp;
		}
		
		System.out.println(sum % 10);
		
		br.close();
	}

}
