package bronze;

import java.io.*;
import java.util.*;

public class P2869 {
	
	/**
	 * 문제명 : 달팽이는 올라가고 싶다
	 * 
	 * 1. 문제
	 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
	 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
	 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)  
	 * 
	 * 3. 출력
	 * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		//정상에 올라가면 내려오지 않기에 높이에서 미끄러짐을 마이너스함
		int day = (height - down) / (up - down);
		
		//나머지가 0이 아닐 시 한번 더 실행시켜야함
		if((height - down) % (up - down) != 0) day++;
		
		br.close();
		System.out.print(day);
	}

}
