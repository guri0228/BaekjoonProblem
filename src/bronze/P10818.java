package bronze;

import java.io.*;
import java.util.*;

public class P10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		br.close();
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length - 1]);
	}

}
