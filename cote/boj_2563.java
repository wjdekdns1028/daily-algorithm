package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2563 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] space = new int[100][100];

        for(int i = 0;i < n; i++){
             String[] arr = br.readLine().split(" ");
             int x = Integer.parseInt(arr[0]);
             int y = Integer.parseInt(arr[1]);
             for(int j = x; j < x+10; j++){
                 for(int k = y; k < y+10; k++){
                     space[j][k] = 1;
                 }
             }
        }

        int count = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(space[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
