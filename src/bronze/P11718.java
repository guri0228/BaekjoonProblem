package bronze;

import java.io.*;
import java.util.*;

public class P11718 {

	public static void main(String[] args) throws IOException {
		/*
		//Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		*/
		
		//BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word;
		
		while((word = br.readLine()) != null) {
			System.out.println(word);
		}
		
		br.close();
		
	}

}
