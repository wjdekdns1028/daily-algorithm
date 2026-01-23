package baekjoon.StackNQueue.boj_17413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean inTag = false;
        Deque<Character> stack = new ArrayDeque<>();

        String line = br.readLine();
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(ch == '<'){
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                inTag = true;
                sb.append(ch);
            } else if (ch == '>') {
                sb.append(ch);
                inTag = false;
            } else if (inTag) {
                sb.append(ch);
            } else if (ch == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            } else {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
