package cote.pro_43162;

class Solution {
    private static boolean[] visited = null;
    private static int[][] list = null;
    private static int N = 0;
    private static int count;

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        list = computers;
        N = n;
        count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){ // 방문 전인 노드를 기준으로 시작한다
                dfs(i); // dfs를 돌고
                count++; // 한 묶음을 카운트한다
            }
        }

        return count;
    }

    private static void dfs(int target){
        visited[target] = true; // 우선 방문한 노드는 방문으로 바꾸고

        for(int i = 0; i < N; i++){ // 매개변수 배열에서 해당 컴퓨터의 연결을 확인한다
            if(list[target][i] == 1 && !visited[i]){ // 연결되어있고 방문 전이면
                dfs(i); // 그대로 내려간다
            }
        }
    }
}
