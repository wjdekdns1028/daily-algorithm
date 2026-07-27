package cote.inf_1121;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[m][n];
        int[][] index = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int mo = board[i][j];
                for(int k = j+1; k < n; k++){
                    int my = board[i][k];
                    index[mo][my] += 1;
                }
            }
        }

        int count = 0;
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(index[i][j] == m){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
