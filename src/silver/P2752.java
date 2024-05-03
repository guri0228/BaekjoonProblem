package silver;

import java.io.*;
import java.util.*;

public class P2752 {

	/**
	 * 문제명 : 수 정렬하기 2
	 * 
	 * 1. 문제
	 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.  
	 * 
	 * 3. 출력
	 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		//int arr[] = new int[N];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i < N;i++) {
			//arr[i] = Integer.parseInt(br.readLine());
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//시간복잡도에서 시간초과 걸림
		//Arrays.sort(arr);
		Collections.sort(list);
		
		//for(int j = 0;j < arr.length;j++) System.out.println(arr[j]);
		
		StringBuilder sb = new StringBuilder();
		for(int j : list) {
			sb.append(j + "\n");
		}
		
		br.close();
		System.out.print(sb);
	}

}
