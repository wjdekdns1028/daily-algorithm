package cote.inf_1088;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = str.split(" ");

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[max].length() < arr[i].length()){
                max = i;
            }
        }

        System.out.println(arr[max]);
    }
}
