package baekjoon.StackNQueue.boj_1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        boolean possible = true;
        int next = 1;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (next <= num) {
                stack.addLast(next);
                next++;
                sb.append("+\n");
            }

            if(stack.peekLast() != null && stack.peekLast() == num) {
                stack.pollLast();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (!possible) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
