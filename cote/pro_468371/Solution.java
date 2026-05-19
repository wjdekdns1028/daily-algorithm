package cote.pro_468371;

public class Solution {
    public int solution(int[][] signals){
        int N = signals.length;

        long totalLcm = signals[0][0] + signals[0][1] + signals[0][2];

        for (int j = 1; j < N; j++) {
            long cycle = signals[j][0] + signals[j][1] + signals[j][2];
            totalLcm = lcm(totalLcm, cycle);
        }

        for(long t = 1; t <= totalLcm; t++){
            boolean allYellow = true;

            for(int i = 0; i < N; i++) {
                long cycle = signals[i][0] + signals[i][1] + signals[i][2];
                long pos = (t - 1) % cycle;

                if(signals[i][0] > pos || pos >= signals[i][0] + signals[i][1]){
                    allYellow = false;
                }
            }

            if(allYellow) return (int) t;
        }
        return -1;
    }

    long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }

    long lcm(long a, long b){
        return (long) a / gcd(a, b) * b;
    }
}
