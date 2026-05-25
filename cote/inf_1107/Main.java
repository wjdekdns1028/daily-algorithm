package cote.inf_1107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int count = 1;
        int max = arr[0];

        for(int i = 1; i < N; i++) {
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);

    }
}
