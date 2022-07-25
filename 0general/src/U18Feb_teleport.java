import java.util.*;
import java.io.*;

public class U18Feb_teleport {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "teleport";
    static String s;
    static int x,y,a,b;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
        s = in.readLine();
        String[] arr = s.split(" ");
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
        x = Integer.parseInt(arr[2]);
        y = Integer.parseInt(arr[3]);
    }
    
    static void solve() {
    	
        int ab = Math.abs(a-b);
        int axb = Math.abs(a-x)+Math.abs(b-y);
        int ayb = Math.abs(a-y)+Math.abs(b-x);
        System.out.println(Math.min(Math.min(ab, axb), ayb));
        
    }

}