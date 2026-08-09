package Strategy;
import java.io.*;
import java.util.*;

public class codeforces_iptemp {

//  TEMPLET 
public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }

    static void solve() throws Exception {

        String s = sc.next();
        int n = s.length();

        int bad = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                bad++;
            }
        }

        if (bad <= 2) out.println("YES");
        else out.println("NO");
    }
}    

    
    
}
