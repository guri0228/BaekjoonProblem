package silver;

import java.io.*;
import java.util.*;

public class P2563 {

    /**
     * 문제명 : 색종이
     * 
     * 1. 문제
     * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
     * 예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
     * 
     * 2. 입력
     * 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
     * 
     * 3. 출력 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //도화지 기본 세팅
        boolean area[][] = new boolean[101][101];
        int N = Integer.parseInt(br.readLine());
        int x, y;
        int count = 0;

        StringTokenizer st;
        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            //입력받은 x, y값의 +10 만큼 정사각형 true로 변환
            for(int j = x;j < x + 10;j++) {
                for(int k = y;k < y + 10;k++) {
                    area[j][k] = true;
                }
            }
        }

        //true인 면적이 곧 색종이 붙여진 위치(겹쳐진 위치도 확인 가능)
        for(int i = 0;i <= 100;i++) {
            for(int j = 0;j <= 100;j++) {
                if(area[i][j])
                    count++;
            }
        }

        br.close();
        System.out.print(count);
    }
}
