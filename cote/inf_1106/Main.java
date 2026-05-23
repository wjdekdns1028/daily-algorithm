package cote.inf_1106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");

        int[] num = new int[N];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++) {
            num[i] = Integer.parseInt(arr[i]);
            if(i == 0) {
                sb.append(num[0]);
                sb.append(" ");
            } else if(num[i - 1] < num[i]){
                sb.append(num[i]);
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
