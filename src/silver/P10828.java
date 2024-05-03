package silver;

import java.io.*;
import java.util.*;

public class P10828 {

	/**
	 * 문제명 : 스택
	 * 
	 * 1. 문제
	 * push X: 정수 X를 스택에 넣는 연산이다.
	 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * size: 스택에 들어있는 정수의 개수를 출력한다.
	 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
	 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * 		
	 * 2. 입력
	 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
	 * 
	 * 3. 출력
	 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
	 */
	
	//변수 초기화
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		stack = new int[cnt];
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < cnt;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			switch(command) {
				case "push" :
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					sb.append(pop() + "\n");
					break;
				case "size" :
					sb.append(size() + "\n");
					break;
				case "empty" :
					sb.append(empty() + "\n");
					break;
				case "top" :
					sb.append(top() + "\n");
					break;
			}
		}
		
		br.close();
		System.out.print(sb);
	}
	
	//stack push
	public static void push(int X) {
		stack[size] = X;
		size++;
	}
	
	//stack pop
	public static int pop() {
		if(size == 0) return -1;
		else {
			int result = stack[size - 1];
			size--;
			
			return result;
		}
	}
	
	//stack size
	public static int size() {
		return size;
	}
	
	//stack empty
	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}
	
	//stack top
	public static int top() {
		if(size == 0) return -1;
		else return stack[size - 1];
	}

}
