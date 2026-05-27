package cote.inf_1118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            String[] list = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(list[j]);
            }
        }

        int[] rowsum = new int[N];
        int[] colSum = new int[N];
        int diag1 = 0;
        int diag2 = 0;

        int max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                rowsum[i] += arr[i][j];
                colSum[j] += arr[i][j];

                if(max < colSum[j]){
                    max = colSum[j];
                }
            }
            diag1 += arr[i][i];
            diag2 += arr[i][N - 1 - i];

            if(max < rowsum[i]){
                max = rowsum[i];
            }
        }
        if(max < diag1){
            max = diag1;
        }
        if(max < diag2){
            max = diag2;
        }

        System.out.println(max);
    }
}
