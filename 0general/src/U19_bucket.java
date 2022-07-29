import java.util.*;
import java.io.*;

public class U19_bucket {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "buckets";
    static char[][] a;
    static int bl,br,ll,lr,rl,rr,ans;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() throws IOException {
        a = new char[10][];
        for(int i = 0;i<10;i++) {
        	a[i] = in.readLine().toCharArray();
        }
    }
    
    static void solve() {
        for(int i = 0;i<10;i++) {
        	for(int j = 0;j<10;j++) {
        		if(a[i][j]=='B') {
        			bl = i;
        			br = j;
        		}else if(a[i][j] == 'R') {
        			rl = i;
        			rr = j;
        		}else if(a[i][j] == 'L') {
        			ll = i;
        			lr = j;
        		}
        	}
        }
        
        if((br == rr) && (rr == lr)&&((ll<rl) && (rl<bl) || (bl<rl) && (rl<ll))) {
        	ans = Math.abs(bl-ll)+1;
        }else if((bl == rl) && (rl == ll) && ((lr<rr) && (rr<br) || (br<rr) && (rr<lr))) {
        	ans = Math.abs(br-lr)+1;
        }else {
        	ans = Math.abs(br-lr)+Math.abs(bl-ll)-1;
        }
       // out.println(bl+" "+br+" "+rl+" "+rr+" "+ll+" "+lr);
        out.println(ans);
    }
    

}