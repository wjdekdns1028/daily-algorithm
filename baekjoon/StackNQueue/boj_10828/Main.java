package baekjoon.StackNQueue.boj_10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            String line = br.readLine();
            String[] arr = line.split(" ");
            String cmd = arr[0];

            if (cmd.equals("push")){
                stack.addLast(Integer.parseInt(arr[1]));
            } else if (cmd.equals("pop")){
                if (stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pollLast());
                }
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.isEmpty()){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("top")) {
                if (stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peekLast());
                }
            }
        }
    }
}
