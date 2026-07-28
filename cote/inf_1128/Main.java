package cote.inf_1128;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nList = new int[n];
        for(int i = 0; i < n; i++){
            nList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] mList = new int[m];
        for(int i = 0; i < m; i++){
            mList[i] = Integer.parseInt(st.nextToken());
        }

        int[] resultList = new int[n+m];
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m){
            if (nList[i] <= mList[j]){
                resultList[count] = nList[i];
                i++;
                count++;
            } else if (mList[j] < nList[i]){
                resultList[count] = mList[j];
                j++;
                count++;
            }
        }

        while (i < n){
            resultList[count] = nList[i];
            i++;
            count++;
        }

        while (j < m){
            resultList[count] = mList[j];
            j++;
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for(int z = 0; z < resultList.length; z++){
            if(z < resultList.length-1) {
                sb.append(resultList[z]).append(" ");
            } else {
                sb.append(resultList[z]);
            }
        }

        System.out.println(sb);

    }
}
