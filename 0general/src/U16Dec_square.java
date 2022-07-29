import java.util.*;
import java.io.*;

public class U16Dec_square {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "test";
    static int x1,x2,y1,y2,x3,y3,x4,y4;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(in.readLine());
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());
        x4 = Integer.parseInt(st.nextToken());
        y4 = Integer.parseInt(st.nextToken());
        
        int mix = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        int max = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        int miy = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        int may = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        
        int slen = Math.max((max-mix), (may-miy));
        out.println(slen*slen);
    }
    
    static void solve() {
        
    }

}