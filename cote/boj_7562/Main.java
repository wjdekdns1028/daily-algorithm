package cote.boj_7562;

import java.util.*;

public class Main {
    static int L;

    static int BFS(int rStart, int cStart, int rGoal, int cGoal) {
        var visited = new boolean[L][L];
        var queue = new ArrayDeque<int[]>();
        queue.add(new int[] {rStart, cStart, 0});

        // 나이트 8방향 이동
        final int[][] MV = {{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2}};

        while (queue.size() > 0) {
            int[] u = queue.remove();
            int r = u[0], c = u[1], distance = u[2];
            if (visited[r][c]) continue;
            visited[r][c] = true;
            if (r == rGoal && c == cGoal) return distance;
            for (int[] mv : MV) {
                int rr = r + mv[0], cc = c + mv[1];
                if (rr < 0 || cc < 0 || rr >= L || cc >= L) continue;
                queue.add(new int[] {rr, cc, distance + 1});
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            L = sc.nextInt();
            int r1 = sc.nextInt(), c1 = sc.nextInt();
            int r2 = sc.nextInt(), c2 = sc.nextInt();
            System.out.println(BFS(r1, c1, r2, c2));
        }
    }
}
