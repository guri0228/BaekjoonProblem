package bronze;

import java.util.*;

public class P1157 {

	/**
	 * 문제명 : 단어 공부
	 * 
	 * 1. 문제
	 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
	 * 
	 * 2. 입력
	 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다. 
	 * 
	 * 3. 출력
	 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.next();
		word = word.toUpperCase();
		
		sc.close();
		
		int cnt = 0;
		char result = 'A';
		int arr[] = new int[26];
		
		//입력값 길이만큼 char 속성 이용하여 배열 증가
		for(int i = 0;i < word.length();i++) {
			arr[word.charAt(i) - 'A']++;
			
			if(arr[word.charAt(i) - 'A'] > cnt) {
				cnt = arr[word.charAt(i) - 'A'];
				result = word.charAt(i);
			}else if(cnt == arr[word.charAt(i) - 'A']) { //갯수가 같을시
				result = '?';
			}
		}
		
		System.out.print(result);
	}

}
