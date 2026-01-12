package baekjoon.boj_2563;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] p = new int[100][100];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < (x + 10); j++) {
                for(int k = y; k < (y + 10); k++) {
                    p[j][k] = 1;
                }
            }
        }

        int count = 0;
        for(int col = 0; col < 100; col++) {
            for(int row = 0; row < 100; row++){
                if(p[col][row] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
