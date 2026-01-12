package baekjoon.boj_1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        String[] tokens = br.readLine().split(" ");
//        int[] input = new int[N];
//        for (int g = 0; g < N; g++) {
//            input[g] = Integer.parseInt(tokens[g]);
//        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[N];

        double M = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (M < scores[i]) {
                M = scores[i];
            }
        }

        double sum = 0;
        for (int j = 0; j < N; j++) {
            sum += (scores[j] / M * 100.0);
        }

        double avg = sum / N;
        System.out.println(avg);
    }
}
