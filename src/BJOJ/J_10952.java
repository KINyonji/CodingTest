package BJOJ;

import java.io.*;
import java.util.StringTokenizer;

public class J_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            int sum = A+B;
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
