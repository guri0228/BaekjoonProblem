package bronze;

import java.io.*;
import java.util.*;

public class P10989 {
	
	/**
	 * 문제명 : 수 정렬하기 3
	 * 
	 * 1. 문제
	 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.  
	 * 
	 * 3. 출력
	 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[10001];
		
		//Arrays.sort도 가능
		//Counting sort 이용
		for(int i = 0;i < N;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int j = 1;j < 10001;j++) {
			while(arr[j] > 0) {
				sb.append(j).append("\n");
				arr[j]--;
			}
		}
		
		System.out.print(sb);
		
	}

}
