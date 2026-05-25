package cote.inf_1109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 0; i < N; i++) {
            if(i == N - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
