package bronze;

import java.io.*;
import java.util.*;

public class P2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		StringTokenizer st = new StringTokenizer(t, " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = 60 + (M - 45);
			
			if(H < 0) {
				H = 23;
			}
		}else {
			M = M - 45;
		}
		
		br.close();
		
		System.out.print(H + " " + M);
	}

}
