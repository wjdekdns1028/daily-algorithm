package cote.inf_1096;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 0; i < str.length(); i++){
            if(i + 1 < str.length() && chars[i] == chars[i + 1]){
                count++;
            } else {
                if(count != 1){
                    sb.append(chars[i]).append(count);
                    count = 1;
                } else {
                    sb.append(chars[i]);
                }
            }
        }

        System.out.println(sb);
    }
}
