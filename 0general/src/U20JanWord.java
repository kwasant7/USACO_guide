import java.util.*;
import java.io.*;

public class U20JanWord {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "test";
    static String b, e, ans;
    
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
        b = in.readLine();
        e = in.readLine();
    }
    
    static void solve() {
        String[] a = e.split(" ");
        String[] temp = b.split(" ");
        
       	int n = Integer.parseInt(temp[0]);
       	int k = Integer.parseInt(temp[1]);
        int charcnt = 0;
        ans = a[0];
       	
        for(int i =0;i<n+1;i++) {
        	String curr = a[i+1];
        	if(curr.length()+charcnt>k) {
        		ans +="\n"+curr;
        		charcnt = curr.length();
        	}else {
        		ans+=" "+curr;
        		charcnt+=curr.length();
        	}
        }
        System.out.println(ans);
    }
}