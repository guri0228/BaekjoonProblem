package bronze;

import java.util.*;

public class P10872 {
	
	/**
	 * 문제명 : 팩토리얼
	 * 
	 * 1. 문제
	 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다. 
	 * 
	 * 3. 출력
	 * 첫째 줄에 N!을 출력한다.
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        //팩토리얼 메소드 생성 후 구현
        System.out.println(factorial(a));
        
        sc.close();
    }
    
    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

}
