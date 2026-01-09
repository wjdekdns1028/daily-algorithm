package baekjoon.boj_10813;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for(int idx = 0; idx < N; idx++) {
            arr[idx] = idx + 1;
        }

        for(int op = 0; op < M; op++) {
            String[] input2 = br.readLine().split(" ");
            int i = Integer.parseInt(input2[0]);
            int j = Integer.parseInt(input2[1]);

            int a = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = a;
        }

        StringBuilder sb = new StringBuilder();

        for(int pos = 0; pos < N; pos++) {
            sb.append(arr[pos]).append(" ");
        }

        System.out.println(sb);
    }
}
