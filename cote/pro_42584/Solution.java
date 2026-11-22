package cote.pro_42584;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> que = new ArrayDeque<>();
        for (int n : prices) {
            que.add(n);
        }

        int[] answer = new int[prices.length];
        int idx = 0;

        while (!que.isEmpty()) {
            int cur = que.poll();
            int time = 0;

            for (int i = idx + 1; i < prices.length; i++) {
                time++;
                if (prices[i] < cur) {
                    break;
                }
            }

            answer[idx] = time;
            idx++;
        }

        return answer;
    }
}
