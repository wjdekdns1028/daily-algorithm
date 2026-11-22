package cote.pro_42578;

import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        Queue<Integer> que = new ArrayDeque<>();
        int min = Integer.MAX_VALUE;

        int count = 0;
        for(int i = 0; i <= number.length-10; i++){
            HashMap<String, Integer> discountMap = new HashMap<>();
            for(int j = i; j < j+10; j++){
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            if(wantMap.equals(discountMap)){
                count++;
            }
        }

        return count;

    }
}
