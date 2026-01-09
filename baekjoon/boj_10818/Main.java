package baekjoon.boj_10818;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            if(min > num){
                min = num;
            }
            if(max < num) {
                max = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
