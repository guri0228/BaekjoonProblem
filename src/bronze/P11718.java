package bronze;

import java.io.*;

public class P11718 {
	
	/**
	 * 문제명 : 그래도 출력하기
	 * 
	 * 1. 문제
	 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다. 
	 * 
	 * 3. 출력
	 * 입력받은 그대로 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		/*
		//Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		*/
		
		//BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word;
		
		while((word = br.readLine()) != null) {
			System.out.println(word);
		}
		
		br.close();
		
	}

}
