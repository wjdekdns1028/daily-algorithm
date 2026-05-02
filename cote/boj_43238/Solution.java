package cote.boj_43238;

public class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = (long) n * 1000000000;
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;

            long count = 0;
            for (int t : times) {
                count += mid / t;
                if (count >= n) break;
            }

            if (count >= n) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}


class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(6, new int[]{7, 10}));
    }
}
