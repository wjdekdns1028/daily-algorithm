package cote.pro_87946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n = 0;
    public static int max;
    public static int[][] board = null;
    public static boolean[] visited = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int k = Integer.parseInt(arr[0]);
        n = Integer.parseInt(arr[1]);

        board = new int[n][2];
        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            String[] arr1 = br.readLine().split(" ");
            for(int j = 0; j < 2; j++){
                board[i][j] = Integer.parseInt(arr1[j]);
            }
        }

        dfs(0, k);

        System.out.println(max);
    }

    private static void dfs(int depth, int k){
        // 함수에 들어와서 바로 검사해야 해당 함수 속 depth랑 비교 가능
        if(depth > max){ // 리프까지 갯수 (=탐험한 던전의 갯수)가 가장 크면 대입
            max = depth;
        }

        for(int i = 0; i < n; i++){
            int kk = 0; // k를 수정하면 옆 노드들 검사 못하니까

            if(board[i][0] <= k && !visited[i]){
                kk = k - board[i][1];
                visited[i] = true; // 백트레킹
                dfs(depth + 1, kk); // 탐험한 던전의 갯수 증가
                visited[i] = false;
            } else {
                continue;
            }

        }
    }

    //        int count = 0;
    //        while (!map.isEmpty()) {
    //            for (int key : map.keySet()) {
    //                if (key > k) { //  내 피로도가 던전들의 최소 필요 피로도보다 작으면
    //                    map.remove(key); // 제거
    //                }
    //            }
    //
    //            for (int key : map.keySet()) {
    //                int min = k;
    //                min = Math.min(map.get(key), min);
    //                k -= min; // 그 중 가장 작은 소모 피로도를 선택해서 던전을 가고
    //                count++; // 던전 간 갯수를 세고
    //                map.remove(key); // 이미 간 곳은 map에서 없앤다
    //            }
    //
    //        }
    //        System.out.println(count);
}

