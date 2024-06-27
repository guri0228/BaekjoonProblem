package bronze;

import java.io.*;

public class P28702 {
	
	/**
	 * 문제명 : FizzBuzz
	 * 
	 * 1. 문제
	 * FizzBuzz 문제는
	 * $i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다. 
	 * $i$가 $3$의 배수이면서 $5$의 배수이면 “FizzBuzz”를 출력합니다.
	 * $i$가 $3$의 배수이지만 $5$의 배수가 아니면 “Fizz”를 출력합니다.
	 * $i$가 $3$의 배수가 아니지만 $5$의 배수이면 “Buzz”를 출력합니다.
	 * $i$가 $3$의 배수도 아니고 $5$의 배수도 아닌 경우 $i$를 그대로 출력합니다.
	 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?
	 * 
	 * 2. 입력
	 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 한 줄에 하나씩 주어집니다. 각 문자열의 길이는 $8$ 이하입니다. 입력이 항상 FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열에 대응됨이 보장됩니다.  
	 * 
	 * 3. 출력
	 * 연속으로 출력된 세 개의 문자열 다음에 올 문자열을 출력하세요. 여러 문자열이 올 수 있는 경우, 아무거나 하나 출력하세요.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String result = "";
		
		for(int i = 3;i > 0;i--) {
			String s = br.readLine();
			
			if(s.matches("^[0-9]*$")) {
				int num = Integer.parseInt(s) + i;
				
				if(num % 3 == 0) {
					if(num % 5 == 0) {
						result = "FizzBuzz";
					}else {
						result = "Fizz";
					}
				}else if(num % 5 == 0) {
					result = "Buzz";
				}else {
					result = String.valueOf(num);
				}
				
				break;
			}
		}
		
		br.close();
		System.out.print(result);
	}

}
