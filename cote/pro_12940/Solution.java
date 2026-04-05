package cote.pro_12940;

class Solution {

    static int max(int n, int m) {
        while(m != 0) {
            int t = n % m;
            n = m;
            m = t;
        }
        return n;
    }

    static int min(int n, int m) {
        return (n * m) / max(n, m);
    }

    public int[] solution(int n, int m) {
        int[] arr = new int[2];
        arr[0] = max(n, m);
        arr[1] = min(n, m);

        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] result = sol.solution(3, 12);

        System.out.println(result[0] + " " + result[1]);
    }
}
