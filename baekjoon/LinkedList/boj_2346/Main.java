package baekjoon.LinkedList.boj_2346;

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

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        int[] paper = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++){
            int x = Integer.parseInt(st.nextToken());
            paper[i] = x;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++){
            int cur = dq.pollFirst();

            if (i > 0) {
                sb.append(" ");
            }
            sb.append(cur);

            if(dq.isEmpty()){
                break;
            }
            if(paper[cur] < 0){
                for (int j = 0; j < -(paper[cur]); j++){
                    dq.addFirst(dq.pollLast());
                }
            } else {
                for (int j = 0; j < (paper[cur] - 1); j++){
                    dq.addLast(dq.pollFirst());
                }
            }
        }

        System.out.println(sb);
    }
}
