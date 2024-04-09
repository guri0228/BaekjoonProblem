package bronze;

import java.io.*;

public class P9086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0;i < a;i++) {
			String word = br.readLine();
			
			System.out.println(word.substring(0, 1) + word.substring(word.length() - 1));
		}
		
		br.close();
		
	}

}
