package silver;

import java.io.*;
import java.util.*;

public class P10816 {
	
	/**
	 * 문제명 : 숫자 카드 2
	 * 
	 * 1. 문제
	 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
	 * 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.  
	 * 
	 * 3. 출력
	 *  첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] result = new int[M];
		
		st = new StringTokenizer(br.readLine());
		
		//비교 대상 세팅, 이진탐색 미사용
		/*
		for(int i = 0;i < M;i++) {
			int count = 0;
			int num = Integer.parseInt(st.nextToken());

			//arr 비교로직
			for(int j = 0;j < arr.length;j++) {
				if(num == arr[j]) count++; 
			}
			
			result[i] = count;
		}
		
		for(int i : result) {
			sb.append(i).append(" ");
		}
		*/
		
		//이진탐색을 하기 위해 정렬은 필수
		Arrays.sort(arr);
		
		//상한선, 하한선을 찾아 빼준다.
		for(int i = 0;i < M;i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
		}
		
		br.close();
		System.out.print(sb);
	}
	
	//하한선 찾기
	public static int lowerBound(int[] arr, int key) {
		int first = 0;
		int last = arr.length;
		
		while(first < last) {
			int mid = (first + last) / 2;
			
			if(key <= arr[mid]) { //하한선을 찾는것이기에 작거나 같음 확인
				last = mid;
			}else {
				first = mid + 1;
			}
		}
		
		return first;
	}
	
	//상한선 찾기
	public static int upperBound(int[] arr, int key) {
		int first = 0;
		int last = arr.length;
		
		while(first < last) {
			int mid = (first + last) / 2;
			
			if(key < arr[mid]) { //하한선을 찾는것이기에 작음만 체크
				last = mid;
			}else {
				first = mid + 1;
			}
		}
		
		return first;
	}
}
