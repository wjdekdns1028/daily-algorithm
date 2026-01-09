package baekjoon.boj_10810;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];

        for(int w = 0; w < M; w++) {
            String[] input2 = br.readLine().split(" ");

            int i = Integer.parseInt(input2[0]);
            int j = Integer.parseInt(input2[1]);
            int k = Integer.parseInt(input2[2]);


            for(int l = i-1; l < j; l++) {
                arr[l] = k;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int g = 0; g < N; g++) {
            sb.append(arr[g]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
