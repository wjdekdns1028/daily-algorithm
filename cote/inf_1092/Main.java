package cote.inf_1092;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char[] chars = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;
        boolean isYes = false;

        while (lt < rt){
            if(chars[lt] == chars[rt]){
                isYes = true;
            } else {
                isYes = false;
                break;
            }
            ++lt;
            --rt;
        }

        if(isYes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
