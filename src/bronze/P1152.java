package bronze;

import java.io.*;
import java.util.*;

public class P1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//StringTokenizer method
		//System.out.print(st.countTokens());
		
		int word = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			word++;
		}
		
		br.close();
		
		System.out.print(word);
		
	}

}
