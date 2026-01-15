package baekjoon.LinkedList.boj_2840;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] wheel = new char[N];
        for (int i = 0; i < N; i++){
            wheel[i] = '?';
        }
        int pos = 0;
        boolean[] used = new boolean[26];

        for (int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            String string = st.nextToken();
            char ch = string.charAt(0);

            pos = (pos - (S % N) + N) % N;
            if (wheel[pos] == '?'){
                if (used[ch - 'A']){
                    System.out.println("!");
                    return;
                }
                wheel[pos] = ch;
                used[ch - 'A'] = true;
            } else {
                if (wheel[pos] != ch) {
                    System.out.println("!");
                    return;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            sb.append(wheel[(pos + i) % N]);
        }

        System.out.println(sb);
    }
}
