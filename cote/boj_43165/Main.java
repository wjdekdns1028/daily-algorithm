package cote.boj_43165;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n = 0;
    public static int target = 0;
    public static int count = 0;
    public static int[] numList = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fList = br.readLine().split(" ");
        n = Integer.parseInt(fList[0]);
        target = Integer.parseInt(fList[1]);

        numList = new int[n];
        String[] sList = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            numList[i] = Integer.parseInt(sList[i]);
        }

        dfs(0, 0);
        System.out.println(count);

    }

    private static void dfs(int depth, int sum){
        if(depth == n){
            if(sum == target){
                count++;
            }
            return;
        }

        dfs(depth+1, sum + numList[depth]);
        dfs(depth+1, sum - numList[depth]);
    }
}
