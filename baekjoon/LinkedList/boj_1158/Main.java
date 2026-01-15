package baekjoon.LinkedList.boj_1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (K-1); j++) {
                dq.addLast(dq.pollFirst());
            }

            result.addLast(dq.pollFirst());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Iterator<Integer> it = result.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()){
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
