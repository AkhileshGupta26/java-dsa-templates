package Strategy;

public class cftemplet {
/*


import java.io.*;
import java.util.*;

public class Main {

    // ================= CONSTANTS =================

    static final FastScanner fs = new FastScanner();
    static final StringBuilder out = new StringBuilder();

    static final long MOD = 1_000_000_007L;
    static final long INF = Long.MAX_VALUE;

    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    // ================= MAIN =================

    public static void main(String[] args) throws Exception {

        int tc = 1;

        // tc = fs.nextInt();

        while (tc-- > 0) {
            solve();
        }

        System.out.print(out);
    }

    // ================= SOLVE =================

    static void solve() throws Exception {

    }

    // ================= INPUT =================

    static int[] readIntArray(int n) throws Exception {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fs.nextInt();
        return a;
    }

    static long[] readLongArray(int n) throws Exception {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fs.nextLong();
        return a;
    }

    // ================= OUTPUT =================

    static void print(int[] a) {
        for (int x : a) out.append(x).append(' ');
        out.append('\n');
    }

    static void print(long[] a) {
        for (long x : a) out.append(x).append(' ');
        out.append('\n');
    }

    // ================= MATH =================

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long modPow(long a, long b, long mod) {
        long ans = 1;
        a %= mod;

        while (b > 0) {
            if ((b & 1) == 1)
                ans = (ans * a) % mod;

            a = (a * a) % mod;
            b >>= 1;
        }

        return ans;
    }

    // ================= ARRAY =================

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void reverse(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r)
            swap(a, l++, r--);
    }

    // ================= BINARY SEARCH =================

    static int lowerBound(int[] a, int x) {
        int l = 0;
        int r = a.length;

        while (l < r) {
            int m = (l + r) >>> 1;

            if (a[m] < x)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    static int upperBound(int[] a, int x) {
        int l = 0;
        int r = a.length;

        while (l < r) {
            int m = (l + r) >>> 1;

            if (a[m] <= x)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    // ================= PAIR =================

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // ================= FAST SCANNER =================

    static class FastScanner {

        private final BufferedInputStream in =
                new BufferedInputStream(System.in);

        private final byte[] buffer = new byte[1 << 16];

        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {

            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0)
                    return -1;
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {

            int c;

            while ((c = read()) <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;

            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }

            return val * sign;
        }

        long nextLong() throws IOException {

            int c;

            while ((c = read()) <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;

            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }

            return val * sign;
        }

        String next() throws IOException {

            int c;

            while ((c = read()) <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }
}














*/    
    
}
