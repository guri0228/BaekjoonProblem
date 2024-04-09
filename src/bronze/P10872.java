package bronze;

import java.util.*;

//팩토리얼
public class P10872 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        System.out.println(factorial(a));
    }
    
    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

}
