package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        int M = Integer.parseInt(br.readLine());
        String[] arr3 = br.readLine().split(" ");
        int[] arr4 = new int[M];

        for (int i = 0; i < M; i++) {
            arr4[i] = Integer.parseInt(arr3[i]);
        }

        Arrays.sort(arr2);
        for (int i = 0; i < M; i++) {
            int start = 0;
            int end = N - 1;
            int target = arr4[i];
            boolean found = false;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr2[mid] == target) {
                    found = true;
                    break;
                } else if (arr2[mid] < target) {
                    start = mid + 1;
                } else if (arr2[mid] > target) {
                    end = mid - 1;
                }
            }

            if(found) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.print(sb);
    }
}
