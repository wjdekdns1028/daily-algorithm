package cote.inf_1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] g = new int[N][5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                g[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (g[i][k] == g[j][k]) {
                        count++;
                        break;
                    }
                }
            }

            if(count > max){
                max = count;
                result = i + 1;
            }
        }

        System.out.println(result);


    }
}
