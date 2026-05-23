package cote.inf_1097;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            str = str.substring(7);

            sb.append((char)Integer.parseInt(tmp, 2));
        }

        System.out.println(sb);

    }
}
