import java.util.*;
import java.io.*;

public class U20Dec_ABC {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "test";
    static String n;
    static int a,b,c,ab,bc,ca,abc;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        
        init();
        solve();

    }
    
    static void init() throws IOException {
        n = in.readLine();
        String[] p = n.split(" ");
        int[] arr = new int[p.length];
        for(int i =0;i<p.length;i++) {
        	arr[i] = Integer.parseInt(p[i]);
        }
        Arrays.sort(arr);
    }
    
    static void solve() {
        String[] p = n.split(" ");
        int[] arr = new int[p.length];
        for(int i =0;i<p.length;i++) {
        	arr[i] = Integer.parseInt(p[i]);
        }
        Arrays.sort(arr);
    	a = arr[0];
    	b = arr[1];
    	abc = arr[6];
    	c = abc-a-b;
    	System.out.println(a+" "+b+" "+c);
    	
    
    }

}