package cote.pro_42587;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> queue = new ArrayDeque<>();
        int count = 0;

        for(int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]}); // 실제 인덱스, 우선순위값
        }

        while(!queue.isEmpty()){
            int[] target = queue.poll();
            boolean hasHigher = false;

            for(int[] x : queue) {
                if(target[1] < x[1]){
                    hasHigher = true;
                }
            }

            if(hasHigher){
                queue.offer(target);
            } else {
                count++;
                if(target[0] == location){
                    return count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;

        System.out.println(sol.solution(priorities1, location1));
        System.out.println(sol.solution(priorities2, location2));
    }
}
