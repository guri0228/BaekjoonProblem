package silver;

import java.io.*;
import java.util.*;

public class P25497 {
	
	/**
	 * 문제명 : 기술 연계마스터 임스
	 * 
	 * 1. 문제
	 * 임스는 연계 기술을 사용하는 게임을 플레이 중에 있다. 연계 기술은 사전 기술과 본 기술의 두 개의 개별 기술을 순서대로 사용해야만 정상적으로 사용 가능한 기술을 말한다.
	 * 하나의 사전 기술은 하나의 본 기술과만 연계해서 사용할 수 있으며, 연계할 사전 기술 없이 본 기술을 사용했을 경우에는 게임의 스크립트가 꼬여서 이후 사용하는 기술들이 정상적으로 발동되지 않는다. 그렇지만 반드시 사전 기술을 사용한 직후에 본 기술을 사용할 필요는 없으며, 중간에 다른 기술을 사용하여도 연계는 정상적으로 이루어진다.
	 * 임스가 사용할 수 있는 기술에는 1~9, L, R, S, K가 있다.
	 * 1~9는 연계 없이 사용할 수 있는 기술이고, L은 R의 사전 기술, S은 K의 사전 기술이다.
	 * 임스가 정해진 순서대로 N개의 기술을 사용할 때, 기술이 몇 번이나 정상적으로 발동하는지를 구해보자.
	 * 단, 연계 기술은 사전 기술과 본 기술 모두 정상적으로 발동되었을 때만 하나의 기술이 발동된 것으로 친다. 
	 * 
	 * 2. 입력
	 * 첫 번째 줄에는 총 기술 사용 횟수 N이 주어진다. (1 <= N <= 200000)
	 * 두 번째 줄에는 임스가 사용할 N개의 기술이 공백 없이 주어진다.
	 * 
	 * 3. 출력
	 * 임스가 정상적으로 기술을 사용한 총 횟수를 출력한다.
	 */
	
	//스택
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Character> lStack = new Stack<>();
		Stack<Character> sStack = new Stack<>();
		
		//조건을 활용하여 스택 사용, 기술 사용 관련하여 선기술 확인
		int result = 0;
		String word = br.readLine();
		for(int i = 0;i < N;i++) {
			char c = word.charAt(i);
			
			if(Character.isDigit(c)) {
				result++;
			}else if(c == 'L') {
				lStack.push(c);
			}else if(c == 'S') {
				sStack.push(c);
			}else if(c == 'R') {
				if(!lStack.isEmpty()) {
					lStack.pop();
					result++;
				}else { //사전기술이 발동 안되면 즉시 종료
					break;
				}
			}else if(c == 'K') {
				if(!sStack.isEmpty()) {
					sStack.pop();
					result++;
				}else { //사전기술이 발동 안되면 즉시 종료
					break;
				}
			}
		}
		
		br.close();
		System.out.print(result);
	}

}
