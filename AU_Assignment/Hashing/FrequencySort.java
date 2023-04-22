package Hashing;

public class FrequencySort {

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
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            int[] ans = rearrange(ar, n);

            for (int i = 0; i < n; i++) {
                out.print(ans[i] + " ");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    private static int[] rearrange(int[] ar, int n) {
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }

        int[][] order = new int[map.size()][2];
        int i = 0;
        for (int x : map.keySet()) {
            order[i][0] = x;
            order[i][1] = map.get(x);
            i++;
        }
        Arrays.sort(order, (a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];
            else
                return b[1] - a[1];
        });

        int j = 0;
        for (int l = 0; l < order.length; l++) {
            for (int z = 0; z < order[l][1]; z++) {
                ans[j] = order[l][0];
                j++;
            }

        }

        return ans;
    }

}

}
