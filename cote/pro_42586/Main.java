package cote.pro_42586;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stringPro = br.readLine().split(" ");
        String[] stringSpe = br.readLine().split(" ");

        int[] pro = new int[N];
        int[] spe = new int[N];
        int[] day = new int[N];
        int point = 0;
        int count = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            pro[i] = Integer.parseInt(stringPro[i]);
            spe[i] = Integer.parseInt(stringSpe[i]);

            if((100 - pro[i]) % spe[i] == 0){
                day[i] = (100 - pro[i]) / spe[i];
            } else {
                day[i] = ((100 - pro[i]) / spe[i]) + 1;
            }

            if(i == 0){
                point = day[0];
            }
            if(day[i] <= point){
                count++;
            } else {
                sb.append(count).append(" ");
                count = 1;
                point = day[i];
            }
            if(i == N-1){
                sb.append(count).append(" ");
            }
        }

        System.out.println(sb);

    }
}
