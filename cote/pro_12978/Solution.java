package cote.pro_12978;

import java.util.*;

public class Solution {

    public static int solution(int N, int[][] road, int K) {
        List<int[]>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            graph[a].add(new int[]{b, c});
            graph[b].add(new int[]{a, c});
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{1, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], cost = curr[1];

            if (cost > dist[node]) continue;

            for (int[] next : graph[node]) {
                int nextNode = next[0], nextCost = next[1];
                if (dist[node] + nextCost < dist[nextNode]) {
                    dist[nextNode] = dist[node] + nextCost;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[][]{{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}}, 3)); // 4
        System.out.println(solution(6, new int[][]{{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}}, 4)); // 4
    }
}
