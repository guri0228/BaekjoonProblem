package bronze;

import java.util.*;

public class P3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0;i < 10;i++) {
			int num = sc.nextInt();
			
			hs.add(num % 42);
		}
		
		System.out.print(hs.size());
	}
}
