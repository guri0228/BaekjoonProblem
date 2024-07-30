package silver;

import java.io.*;
import java.util.*;

public class P11047 {

	/**
	 * 문제명 : 동전 0
	 * 
	 * 1. 문제
	 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
	 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
	 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)  
	 * 
	 * 3. 출력
	 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
	 */
	
	//그리디 알고리즘
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int result = 0;
		
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//큰 수부터 체크를 해야함
		for(int i = N - 1;i >= 0;i--) {
			if(arr[i] <= K) {
				result += K / arr[i];
			}
			
			K = K % arr[i];
		}
		
		br.close();
		System.out.print(result);
	}
	
}
