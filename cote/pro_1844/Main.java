package cote.pro_1844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] stringMap = new String[n];
        int[][] map = new int[n][m];

        for(int i = 0; i < n; i++){
            stringMap = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(stringMap[j]);
            }
        }

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] {0,0});
        int[][] count = new int[n][m];
        count[0][0] = 1;

        while (!q.isEmpty()){
            int[] xy = q.poll();
            int x = xy[0];
            int y = xy[1];

            if(x+1 < n && count[x+1][y] == 0){
                if(map[x+1][y] == 1){
                    q.add(new int[] {x+1, y});
                    count[x+1][y] = count[x][y] + 1;
                }
            }

            if(x > 0 && count[x-1][y] == 0) {
                if (map[x - 1][y] == 1) {
                    q.add(new int[]{x - 1, y});
                    count[x - 1][y] = count[x][y] + 1;
                }
            }

            if(y+1 < m && count[x][y+1] == 0) {
                if (map[x][y + 1] == 1) {
                    q.add(new int[]{x, y + 1});
                    count[x][y + 1] = count[x][y] + 1;
                }
            }

            if(y > 0 && count[x][y-1] == 0) {
                if (map[x][y - 1] == 1) {
                    q.add(new int[]{x, y - 1});
                    count[x][y - 1] = count[x][y] + 1;
                }
            }
        }

        if(count[n-1][m-1] == 0){
            System.out.println("-1");
        } else {
            System.out.println(count[n-1][m-1]);
        }
    }
}
