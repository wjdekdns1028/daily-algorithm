package cote.inf_1119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+2][N+2];

        for(int i = 1; i <= N; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j < N; j++){
                arr[i][j+1] = Integer.parseInt(str[j]);
            }
        }

        int count = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if (arr[i][j - 1] < arr[i][j] && arr[i - 1][j] < arr[i][j] &&
                        arr[i][j + 1] < arr[i][j] && arr[i + 1][j] < arr[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
