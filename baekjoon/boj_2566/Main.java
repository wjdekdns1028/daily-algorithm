package baekjoon.boj_2566;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX = Integer.MIN_VALUE;
        int I = 0;
        int J = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int value = Integer.parseInt(st.nextToken());

                if (MAX < value) {
                    MAX = value;
                    I = i;
                    J = j;
                }
            }
        }
        System.out.println(MAX);
        System.out.println((I + 1) + " " + (J + 1));
    }
}
