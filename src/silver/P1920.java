package silver;

import java.io.*;
import java.util.*;

public class P1920 {
	
	/**
	 * 문제명 : 수 찾기
	 * 
	 * 1. 문제
	 * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.  
	 * 
	 * 3. 출력
	 * M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		//첫 비교의 숫자들을 해당 크기에 맞게 배열에 넣음
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//이분탐색의 필수인 정렬 실시
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		
		//이분탐색 메소드를 이용한 수 포함여부 확인
		for(int i = 0;i < M;i++) {
			if(confirm(arr, Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		
		br.close();
		System.out.print(sb);
	}
	
	//확인 메소드
	public static int confirm(int[] arr, int key) {
		int first = 0;
		int last = arr.length - 1;
		
		//이분탐색 사용, first가 last보다 최소 같을때까지 반복
		while(first <= last) {
			int mid = (first + last) / 2;
			
			if(key < arr[mid]) {
				last = mid - 1;
			}else if(key > arr[mid]) {
				first = mid + 1;
			}else {
				return mid;
			}
		}
		
		//찾는 값이 없을 시 return 값
		return -1;
	}

}
