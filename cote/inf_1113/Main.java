package cote.inf_1113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[N];
        int[] rank = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < N; j++) {
                if(arr[i] < arr[j]){
                    count++;
                }
            }

            rank[i] = count + 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(rank[i] + " ");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
