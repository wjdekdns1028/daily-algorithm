package cote.pro_12909;

import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c =='('){
                stack.push('(');
            } else if(!stack.isEmpty() && c == ')'){
                stack.pop();
            } else if(stack.isEmpty() && c == ')'){
                return false;
            }
        }

        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(s1 + " -> " + sol.solution(s1));
        System.out.println(s2 + " -> " + sol.solution(s2));
        System.out.println(s3 + " -> " + sol.solution(s3));
        System.out.println(s4 + " -> " + sol.solution(s4));
    }
}
