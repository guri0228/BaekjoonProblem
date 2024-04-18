package bronze;

import java.io.*;

public class P10809 {
	
	/*
	 * 입력
	 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
	 */
	
	/*
	 * 출력
	 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
	 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26];
		for(int i = 0;i < arr.length;i++) {
			 arr[i] = -1;
		}
		
		String word = br.readLine();
		for(int j = 0;j < word.length();j++) {
			char c = word.charAt(j);
			
			if(arr[c - 'a'] == -1) {
				arr[c - 'a'] = j;
			}
		}
		
		for(int z : arr) {
			System.out.print(z + " ");
		}
	}

}
