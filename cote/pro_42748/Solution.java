import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] cutArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(cutArray);
            result[a] = cutArray[k - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        int[] answer = sol.solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}
