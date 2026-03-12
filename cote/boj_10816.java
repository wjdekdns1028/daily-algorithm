package cote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj_10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arrN = br.readLine().split(" ");
        int[] arrNI = new int[N];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            arrNI[i] = Integer.parseInt(arrN[i]);
            map.put(arrNI[i], map.getOrDefault(arrNI[i], 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] arrM = br.readLine().split(" ");
        int[] arrMI = new int[M];
        for (int i = 0; i < M; i++) {
            arrMI[i] = Integer.parseInt(arrM[i]);
        }

        for (int i = 0; i < M; i++) {
            if(!map.containsKey(arrMI[i])){
                sb.append("0").append(" ");
            } else {
                sb.append(map.get(arrMI[i])).append(" ");
            }
        }

        System.out.print(sb);

    }
}
