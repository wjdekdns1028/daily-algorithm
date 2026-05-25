package cote.inf_1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        int[] arrA = new int[N];
        int[] arrB = new int[N];

        StringBuilder sb = new StringBuilder();
        String[] result = new String[N];

        for(int i = 0; i < N; i++){
            arrA[i] = Integer.parseInt(strA[i]);
            arrB[i] = Integer.parseInt(strB[i]);

            if(arrA[i] < arrB[i]){
                if(arrA[i] == 1 && arrB[i] == 3){
                    result[i] = "A";
                } else {
                    result[i] = "B";
                }
            } else if(arrA[i] > arrB[i]){
                if(arrA[i] == 3 && arrB[i] == 1){
                    result[i] = "B";
                } else {
                    result[i] = "A";
                }
            } else {
                result[i] = "D";
            }
        }

        for(int i = 0 ; i < N; i++){
            System.out.println(result[i]);
        }
    }
}
