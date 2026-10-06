package cote.pro_42885;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int limit = Integer.parseInt(arr[1]);

        String[] arr2 = br.readLine().split(" ");
        int[] wList = new int[n];
        for(int i = 0; i < n; i++){
            wList[i] = Integer.parseInt(arr2[i]);
        }

        // 50 50 70 90
        Arrays.sort(wList);
        int min = 0;
        int max = n-1;
        int count = 0;
        while (min <= max) {
            if ((wList[max] + wList[min]) > limit) {
                // max 혼자 탑승
                count++;
                max--;
            } else {
                // max, min 같이 탑승
                count++;
                max--;
                min++;
            }
        }

        System.out.println(count);

    }
}
