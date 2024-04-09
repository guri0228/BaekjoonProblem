package bronze;

import java.io.*;
import java.util.*;


public class P10807 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[a];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0;i < a;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int b = Integer.parseInt(br.readLine());
        for(int j = 0;j < arr.length;j++) {
            if(arr[j] == b) {
                count++;
            }
        }
        
        System.out.println(count);
        
        br.close();
    }

}
