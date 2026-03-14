package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj_11478 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        HashSet<String> set = new HashSet<>(); // HashMap 보단 HashSet이 효율적

        for(int len = 1; len <= st.length(); len++) {
            for(int i = 0; i <= st.length() - len; i++) {
                set.add(st.substring(i, i + len));
            }
        }

        System.out.println(set.size());

    }
}
