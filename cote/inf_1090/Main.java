package cote.inf_1090;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int lt = 0;
        int rt = str.length() - 1;

        char[] chars = str.toCharArray();
        while (lt < rt) {
            if(!Character.isAlphabetic(chars[rt])){
                --rt;
            } else if(!Character.isAlphabetic(chars[lt])){
                ++lt;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;

                ++lt;
                --rt;
            }
        }

        System.out.print(chars);
    }
}
