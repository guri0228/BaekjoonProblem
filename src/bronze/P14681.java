package bronze;

import java.util.*;

//사분면 고르기
public class P14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//삼항연산자
		System.out.println(a > 0 ? b > 0 ? 1 : 4 : b > 0 ? 2 : 3);
		
		sc.close();
	}

}
