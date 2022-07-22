import java.util.*;
import java.io.*;

public class U15Dec_FencePainting {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "paint";
    static int s,e,a[],ans;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
    	a = new int[101];
    	painting();
    	painting();
    	for(int i =0;i<=100;i++) {
    		if(a[i] ==1)
    			ans++;
    	}
    	out.println(ans);
    }
    
    static void painting() throws IOException {
        st = new StringTokenizer(in.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        
        for(int i = s;i<e;i++) {
        	a[i] = 1;
        }
    }

}