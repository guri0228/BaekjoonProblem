package bronze;

import java.io.*;
import java.util.*;

public class P15964 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		System.out.print((A + B) * (A - B));
		
		br.close();
	}

}
