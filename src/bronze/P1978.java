package bronze;

import java.io.*;
import java.util.*;

public class P1978 {

	/*
	 - 문제
	 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오. 
	 */
	
	/*
	 - 입력
	 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다. 
	 */
	
	/*
	 - 출력
	 주어진 수들 중 소수의 개수를 출력한다. 
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int N = Integer.parseInt(br.readLine()); //Buffered 사용시 의미 없음
		
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int number = Integer.parseInt(st.nextToken());
			
			for(int i = 2;i <= number;i++) {
				//자기 자신밖에 나눠서 0인 수 확인
				if(number == i) cnt++;
				
				if(number % i == 0) {
					break;
				}
			}
		}
		
		br.close();
		System.out.print(cnt);
	}

}
