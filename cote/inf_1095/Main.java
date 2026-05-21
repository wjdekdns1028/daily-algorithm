package cote.inf_1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] list = str.split(" ");
        String s = list[0];
        char t = list[1].charAt(0);

        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();

        int p = 101;
        for(int i = 0 ; i < s.length(); i++) {
            if(chars[i] == t){
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            if(chars[i] == t){
                p = 0;
            } else {
                p++;
            }
            answer[i] = Math.min(answer[i], p);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            sb.append(answer[i]);
            if(i < answer.length - 1){
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
