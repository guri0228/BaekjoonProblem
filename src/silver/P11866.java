package silver;

import java.io.*;
import java.util.*;

public class P11866 {

	/**
	 * 문제명 : 달팽이는 올라가고 싶다
	 * 
	 * 1. 문제
	 * 요세푸스 문제는 다음과 같다.
	 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
	 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000)  
	 * 
	 * 3. 출력
	 * 예제와 같이 요세푸스 순열을 출력한다.
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		//큐에 데이터 넣기
		for(int i = 1;i <= N;i++) {
			q.add(i);
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		//마지막 1개 제외 K - 1만큼 큐에 다시 넣고 출력
		while(q.size() > 1) {
			//큐의 특성을 사용하여 빼고 다시 넣기 > q.add(q.poll())
			for(int i = 0;i < K - 1;i++) {
				int temp = q.poll();
				q.add(temp);
			}
			
			sb.append(q.poll()).append(", ");
		}
		
		//마지막 큐 데이터 뽑기
		sb.append(q.poll()).append(">");
		
		System.out.print(sb);
	}

}
