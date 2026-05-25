package cote.inf_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];
        int count = 0;

        for(int i = 2; i <= N; i++) {
            if(arr[i] == 0){
                count++;
                for(int j = i*2; j <= N; j+=i) {
                    arr[j] = 1;
                }
            }
        }

        System.out.println(count);
    }
}
