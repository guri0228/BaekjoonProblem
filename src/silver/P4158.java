package silver;

import java.io.*;
import java.util.*;

public class P4158 {
	
	/**
	 * 문제명 : CD
	 * 
	 * 1. 문제
	 * 상근이와 선영이는 동시에 가지고 있는 CD를 팔려고 한다. CD를 몇 개나 팔 수 있을까? 
	 * 
	 * 2. 입력
	 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스의 첫째 줄에는 상근이가 가지고 있는 CD의 수 N, 선영이가 가지고 있는 CD의 수 M이 주어진다. N과 M은 최대 백만이다. 다음 줄부터 N개 줄에는 상근이가 가지고 있는 CD의 번호가 오름차순으로 주어진다. 다음 M개 줄에는 선영이가 가지고 있는 CD의 번호가 오름차순으로 주어진다. CD의 번호는 십억을 넘지 않는 양의 정수이다. 입력의 마지막 줄에는 0 0이 주어진다.
	 * 상근이와 선영이가 같은 CD를 여러장 가지고 있는 경우는 없다.  
	 * 
	 * 3. 출력
	 * 두 사람이 동시에 가지고 있는 CD의 개수를 출력한다.
	 */
	
	public static int N;
	public static int[] arr;
	
	//Binary Search
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(true) {
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(N == 0 & M == 0) break;
			
			arr = new int[N];
			int result = 0;
			
			//배열에 넣음
			for(int i = 0;i < N;i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i = 0;i < M;i++) {
				int num = Integer.parseInt(br.readLine());
				
				if(binarySearch(num)) result++;
			}
			
			System.out.print(result);
		}
		
		br.close();
	}
	
	public static boolean binarySearch(int num) {
		int left = 0;
		int right = N - 1;
		
		while(left <= right) {
			int midIndex = (left + right) / 2;
			int mid = arr[midIndex];
			
			if(num > mid) left = mid + 1;
			else if(num < mid) right = mid - 1;
			else return true;
		}
		
		return false;
	}

}
