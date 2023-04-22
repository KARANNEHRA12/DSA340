package Hashing;

public class ZeroSUm {

import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new

            InputStreamReader(System.in));

        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());

        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new

            OutputStreamWriter(System.out));

        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            out.println(countZeroSubArrays(arr, n));

            out.close();

        } catch (Exception e) {
            return;
        }
    }

    private static String countZeroSubArrays(int[] arr, int n) {

        HashSet<Long> prefix = new HashSet<>();
        long curSum = 0;
        prefix.add(curSum);
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if (prefix.contains(curSum)) {
                return "YES";
            }
            prefix.add(curSum);

        }

        return "NO";
    }
}

}
