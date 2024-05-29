package bronze;

import java.io.*;
import java.util.*;

public class P11050 {

	/**
	 * 문제명 : 이항 계수 1
	 * 
	 * 1. 문제
	 * 자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수 \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤\(N\) ≤ 10, 0 ≤\(K\) ≤\(N\))  
	 * 
	 * 3. 출력
	 *  \(\binom{N}{K}\)를 출력한다.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		br.close();

		//수학적 공식 : nCk = n! / ((n-k)! * k!)
		System.out.print(factorial(N) / (factorial(K) * factorial(N - K)));
		
		//그 외 풀이
		/*
		int top = 1;
		int bottom = 1;
		for(int i = 0;i < K;i++) {
			top *= (N - i);
			bottom *= (i + 1);
		}
		
		System.out.print(top / bottom);
		*/
	}
	
	//팩토리얼 메소드 구현
	public static long factorial(int num) {
		if(num <= 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}
}
