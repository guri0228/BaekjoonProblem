package bronze;

import java.io.*;

public class P2754 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String grade = br.readLine();
		double point = 0.0;
		char c = grade.charAt(0);
		
		if(c == 'A') {
			point = 4;
		}else if(c == 'B') {
			point = 3;
		}else if(c == 'B') {
			point = 3;
		}
		
		c = grade.charAt(1);
		if(c == '+') {
			point += 0.3;
		}else if(c == '-') {
			point -= 0.3;
		}
		
		System.out.println(point);
		
		br.close();
	}

}
