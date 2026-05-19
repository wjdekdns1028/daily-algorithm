package cote.inf_1089;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            char[] chars = arr[i].toCharArray();

            int len = arr[i].length();
            for (int j = 0; j < len / 2; j++) {
                char temp = chars[j];
                chars[j] = chars[len - j - 1];
                chars[len - j - 1] = temp;
            }

            System.out.println(chars);
        }
    }
}
