package cote.inf_1086;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char ch = Character.toLowerCase(br.readLine().charAt(0));

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                ++count;
            }
        }

        System.out.println(count);
    }
}
