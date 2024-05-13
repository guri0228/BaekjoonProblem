package silver;

import java.io.*;
import java.util.*;

public class P1181 {

	/**
	 * 문제명 : 단어 정렬
	 * 
	 * 1. 문제
	 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
	 * 길이가 짧은 것부터
	 * 길이가 같으면 사전 순으로
	 * 단, 중복된 단어는 하나만 남기고 제거해야 한다.
	 * 		
	 * 2. 입력
	 * 첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
	 * 
	 * 3. 출력
	 * 조건에 따라 정렬하여 단어들을 출력한다.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		StringTokenizer st;
		for(int i = 0;i < N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken();
		}
		
		//1차원 배열이기에 String
		//비교군이 String이기에 compare 오버라이드
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) { //문자열 길이가 같을 시 오름차순 정리
					return s1.compareTo(s2);
				}else { //문자열 길이로 정렬
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for(int i = 1;i < N;i++) {
			if(!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
