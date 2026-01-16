package baekjoon.LinkedList.boj_1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String initial = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for (int i = 0; i < initial.length(); i++){
            left.addLast(initial.charAt(i));
        }

        for (int i = 0 ; i < M; i++){
            String line = br.readLine();
            char cmd = line.charAt(0);

            if (cmd == 'L'){
                if (!left.isEmpty()) {
                    right.addLast(left.pollLast());
                }
            } else if (cmd == 'D') {
                if (!right.isEmpty()) {
                    left.addLast(right.pollLast());
                }
            } else if (cmd == 'B') {
                if (!left.isEmpty()){
                    left.pollLast();
                }
            } else if (cmd == 'P') {
                left.addLast(line.charAt(2));
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : left){
            sb.append(c);
        }
        while(!right.isEmpty()){
            sb.append(right.pollLast());
        }

        System.out.println(sb);
    }
}
