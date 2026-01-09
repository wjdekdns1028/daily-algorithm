package baekjoon.boj_10807;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int v = Integer.parseInt(br.readLine());

        int result = 0;

        for (int j = 0; j < n; j++) {
            if(arr[j] == v) {
                result++;
            }
        }

        System.out.println(result);
    }
}
