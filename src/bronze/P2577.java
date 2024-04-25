package bronze;

import java.util.*;

public class P2577 {
	
	/**
	 * 문제명 : 숫자의 개수
	 * 
	 * 1. 문제
	 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
	 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
	 * 
	 * 2. 입력
	 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다. 
	 * 
	 * 3. 출력
	 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
	 */
	
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
