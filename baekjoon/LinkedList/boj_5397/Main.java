package baekjoon.LinkedList.boj_5397;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            Deque<Character> left = new ArrayDeque<>();
            Deque<Character> right = new ArrayDeque<>();

            String tc = br.readLine();

            for (int j = 0; j < tc.length(); j++) {
                char cmd = tc.charAt(j);

                if (cmd == '-') {
                    if (!left.isEmpty()) {
                        left.pollLast();
                    }
                } else if (cmd == '<') {
                    if (!left.isEmpty()) {
                        right.addLast(left.pollLast());
                    }
                } else if (cmd == '>') {
                    if (!right.isEmpty()) {
                        left.addLast(right.pollLast());
                    }
                } else {
                    left.addLast(cmd);
                }
            }

            StringBuilder sb = new StringBuilder();

            for (char c : left){
                sb.append(c);
            }
            while (!right.isEmpty()){
                sb.append(right.pollLast());
            }

            System.out.println(sb);
        }
    }
}
