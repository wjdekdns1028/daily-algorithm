package cote.pro_42746;

import java.util.*;

public class Solution {

    public String solution(int[] numbers) {
        String[] st = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            st[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(st, (a, b) -> (b + a).compareTo(a + b));

        if (st[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : st) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3 = {0, 0, 0};

        System.out.println(sol.solution(numbers1));
        System.out.println(sol.solution(numbers2));
        System.out.println(sol.solution(numbers3));
    }
}
