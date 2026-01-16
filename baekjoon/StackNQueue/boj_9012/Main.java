package baekjoon.StackNQueue.boj_9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            String line = br.readLine();
            int cnt = 0;
            boolean ok = true;

            for (int j = 0; j < line.length(); j++){
                char ch = line.charAt(j);

                if (ch == '('){
                    cnt++;
                } else if (ch == ')'){
                    cnt--;
                    if (cnt < 0){
                        ok = false;
                        break;
                    }
                }
            }

            if (ok == true && cnt == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
