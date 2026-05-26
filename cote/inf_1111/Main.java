package cote.inf_1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
            arr[i] = Integer.parseInt(str[i]);

            if(isPrime(arr[i])){
                sb.append(arr[i] + " ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
