package baekjoon.Array.boj_10811;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for (int idx = 0; idx < N; idx++) {
            arr[idx] = idx + 1;
        }

        for (int op = 0; op < M; op++) {
            String[] input2 = br.readLine().split(" ");

            int i = Integer.parseInt(input2[0]);
            int j = Integer.parseInt(input2[1]);

            int left = i - 1;
            int right = j - 1;

            while (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int pos = 0; pos < N; pos++) {
            if (pos > 0) {
                sb.append(" ");
            }
            sb.append(arr[pos]);
        }

        System.out.println(sb);
    }
}
