package bronze;

import java.io.*;
import java.util.*;

public class P2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxNumber = 0;
		int maxLocation = 0;
		StringTokenizer st;
		
		for(int i = 0;i < 9;i++) {
			st = new StringTokenizer(br.readLine());
			int comparisonNumber = Integer.parseInt(st.nextToken());
			
			if(comparisonNumber > maxNumber) {
				maxNumber = comparisonNumber;
				maxLocation = i + 1;
			}
		}
		
		System.out.println(maxNumber);
		System.out.println(maxLocation);
		
		br.close();
	}

}
