package bronze;

import java.util.*;

public class P2609 {

	/**
	 * 문제명 : 최대공약수와 최소공배수
	 * 
	 * 1. 문제
	 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 2. 입력
	 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
	 * 
	 * 3. 출력
	 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = getGCD(num1, num2);
		
		sc.close();
		System.out.println(gcd);
		System.out.println(num1 * num2 / gcd);
	}
	
	//유클리드 호제법 사용
	static int getGCD(int num1, int num2) {
		if(num1 % num2 == 0) {
			return num2;
		}else {
			return getGCD(num2, num1 % num2);
		}
	}

}
