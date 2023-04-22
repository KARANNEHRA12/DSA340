package Hashing;

public class UniqueWindow {

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
            int k = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = uniqueEle(ar, n, k);

            for (int x : ans) {
                out.print(x + " ");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }

    private static ArrayList<Integer> uniqueEle(int[] ar, int n,
            int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        int L = 0;
        int R = 0;
        while (R < n) {
            hash.put(ar[R], hash.getOrDefault(ar[R], 0) + 1);
            if ((R - L + 1) != k) {
                R++;
            } else {
                ans.add(hash.size());
                int decre = hash.get(ar[L]) - 1;
                if (decre <= 0) {
                    hash.remove(ar[L]);
                } else {
                    hash.put(ar[L], decre);
                }
                L++;
                R++;
            }

        }

        return ans;
    }

}

}
