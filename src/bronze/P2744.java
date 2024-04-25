package bronze;

import java.io.*;

public class P2744 {
	
	/**
	 * 문제명 : 대소문자 바꾸기
	 * 
	 * 1. 문제
	 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.  
	 * 
	 * 3. 출력
	 * 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < word.length();i++) {
			char c = word.charAt(i);
			
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
