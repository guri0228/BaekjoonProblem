package silver;

import java.io.*;
import java.util.*;

public class P28278 {

    /**
     * 문제명 : 스택 2
     * 
     * 1. 문제
     * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오. 명령은 총 다섯 가지이다. 1
     * X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000) 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을
     * 대신 출력한다. 3: 스택에 들어있는 정수의 개수를 출력한다. 4: 스택이 비어있으면 1, 아니면 0을 출력한다. 5: 스택에 정수가
     * 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
     * 
     * 2. 입력 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000) 둘째 줄부터 N개 줄에 명령이 하나씩 주어진다. 출력을
     * 요구하는 명령은 하나 이상 주어진다.
     * 
     * 3. 출력 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
     */
    
    private static int size = 0;
    private static int[] stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            
            switch(command) {
            case 1 : 
                push(Integer.parseInt(st.nextToken()));
                break;
            case 2 :
                sb.append(pop()).append("\n");
                break;
            case 3 : 
                sb.append(size()).append("\n");
                break;
            case 4 : 
                sb.append(empty()).append("\n");
                break;
            case 5 : 
                sb.append(top()).append("\n");
                break;
            }
        }
        
        br.close();
        System.out.println(sb);
    }
    
    // stack push
    public static void push(int X) {
        stack[size] = X;
        size++;
    }

    // stack pop
    public static int pop() {
        if (size == 0)
            return -1;
        else {
            int result = stack[size - 1];
            size--;

            return result;
        }
    }

    // stack size
    public static int size() {
        return size;
    }

    // stack empty
    public static int empty() {
        if (size == 0)
            return 1;
        else
            return 0;
    }

    // stack top
    public static int top() {
        if (size == 0)
            return -1;
        else
            return stack[size - 1];
    }
}
