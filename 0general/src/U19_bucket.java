import java.util.*;
import java.io.*;

public class U19_bucket {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "test";
    static String[][] n;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
        for(int i = 0; i<10; i++) {
        	for(int j = 0; j<10; j++) {
        		n[i][j] = Integer.toString(in.read());
        		System.out.println(n[i][j]);
        	}
        }
    }
    
    static void solve() {
        
    }
    

}