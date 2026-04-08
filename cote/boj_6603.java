package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_6603 {

    static void DFS(int[] ar, int index, List<Integer> selected, int r){
        if(index >= ar.length){
            if(selected.size() == r){
                for (int i = 0; i < selected.size(); i++) {
                    System.out.print(selected.get(i));
                    if (i < selected.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            return;
        }

        selected.add(ar[index]);
        DFS(ar, index + 1, selected, r);

        selected.remove(selected.size() - 1);
        DFS(ar, index + 1, selected, r);

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] arr = br.readLine().split(" ");
            int k = Integer.parseInt(arr[0]);

            if(k == 0) break;

            int[] ar = new int[k];
            for (int i = 0; i < k; i++) {
                ar[i] = Integer.parseInt(arr[i + 1]);
            }

            DFS(ar, 0, new ArrayList<>(), 6);
            System.out.println();
        }
    }
}
