package bronze;

import java.io.*;

public class P2744 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < word.length();i++) {
			char c = word.charAt(i);
			
			if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}

}
