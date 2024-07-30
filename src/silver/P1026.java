package silver;

import java.io.*;
import java.util.*;

public class P1026 {
	
	/**
	 * 문제명 : 기술 연계마스터 임스
	 * 
	 * 1. 문제
	 * 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
	 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
	 * S = A[0] × B[0] + ... + A[N-1] × B[N-1]
	 * S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
	 * S의 최솟값을 출력하는 프로그램을 작성하시오. 
	 * 
	 * 2. 입력
	 * 첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 셋째 줄에는 B에 있는 수가 순서대로 주어진다. N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
	 * 
	 * 3. 출력
	 * 첫째 줄에 S의 최솟값을 출력한다.
	 */
	
	//그리디
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		Integer[] B = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i < N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		//A배열은 오름차순, B배열은 내림차순
		//오름차순은 기본 타입이 가능하지만 내림차순은 그렇지 못하기에 래퍼클래스로 선언해야함
		//최소의 B에 해당하는 A의 최대수를 곱해야함
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		int result = 0;
		for(int i = 0;i < N;i++) {
			result += A[i] * B[i];
		}
		
		br.close();
		System.out.print(result);
	}

}
