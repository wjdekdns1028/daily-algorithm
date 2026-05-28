package cote.inf_1119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
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

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int count = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){

                boolean isBig = true;
                for(int k = 0; k < 4; k++){
                    if(arr[i][j] <= arr[i + dx[k]][j + dy[k]]){
                        isBig = false;
                        break;
                    }
                }

                if(isBig){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
