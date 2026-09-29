package cote.boj_42587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int L = Integer.parseInt(list[1]);

        int[] pro = new int[N];
        Queue<int[]> q = new LinkedList<>();
        String[] pList = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            pro[i] = Integer.parseInt(pList[i]);
            q.offer(new int[]{pro[i], i});
        }

        int count = 0;
        while (!q.isEmpty()){
            int[] que = q.poll();
            boolean hasMax = false;
            for (int[] x : q) {
                if(que[0] < x[0]) {
                    hasMax = true;
                }
            }
            if(hasMax){
                q.add(que);
            } else {
                count++;
                if(que[1] == L){
                    System.out.println(count);
                    break;
                }
            }
        }

    }
}
