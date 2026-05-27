package cote.inf_1112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[N];
        int[] score = new int[N];
        int count = 0;
        int result = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(str[i]);

            if(arr[i] == 0){
                score[i] = 0;
                count = 0;
            } else {
                ++count;
                score[i] =count;
            }

            result += score[i];
        }

        System.out.println(result);

    }
}
