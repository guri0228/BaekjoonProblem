package silver;

import java.util.*;

public class P14916 {

    /**
     * 문제명 : 거스름돈
     * 
     * 1. 문제
     * 춘향이는 편의점 카운터에서 일한다.
     * 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
     * 예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
     * 
     * 2. 입력
     * 첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.
     * 
     * 3. 출력
     * 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.
     */

    //그리디 알고리즘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        sc.close();

        while(true) {
            if(n % 5 == 0) { //5로 나눈몫이 제일 커야 최소 개수 충족
                result += n / 5;
                System.out.print(result);
                break;
            }else { //아닐 시 2씩 감소
                n -= 2;
                result++;
            }

            if(n < 0) { //해당되지 않는다면 -1 출력
                System.out.println(-1);
                break;
            }
        }
    }
}
