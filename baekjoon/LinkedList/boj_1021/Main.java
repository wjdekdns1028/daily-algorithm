package baekjoon.LinkedList.boj_1021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        int ans = 0;

        for(int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());

            int idx = 0;

            for(int v : dq) {
                if(v == x){
                    break;
                }
                idx++;
            }

            int left = idx;
            int right = dq.size() - idx;

            if(left <= right) {
                for(int j = 0; j < left; j++) {
                    dq.addLast(dq.pollFirst());
                }
                ans += left;
            }
            else {
                for(int t = 0; t < right; t++){
                    dq.addFirst(dq.pollLast());
                }
                ans += right;
            }

            dq.pollFirst();
        }

        System.out.println(ans);
    }
}
