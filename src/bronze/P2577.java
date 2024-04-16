package bronze;

import java.util.*;

public class P2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		String sum = Long.toString(A * B * C);
		
		for(int i = 0;i < 10;i++) {
			int printCnt = 0;
			
			for(int j = 0;j <sum.length();j++) {
				String D = sum.substring(j, j + 1);
				
				if(i == Integer.parseInt(D)) {
					printCnt++;
				}
			}
			
			System.out.println(printCnt);
		}
		
		//String.valueOf 사용 가능
		//charAt 강제 int 변경은 아스키 코드 반환으로 인해 -'0' or -48을 해줘야함
		//'0'은 아스키코드 48에 해당
		
		sc.close();
	}
}
