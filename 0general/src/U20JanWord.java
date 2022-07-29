import java.util.*;
import java.io.*;

public class U20JanWord {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "word";
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
        ans = a[0];
        int len = a[0].length();
       	for(int i =1;i<n;i++){
       		String nw = a[i];
       		if(len+nw.length()>k) {
       			ans += "\n"+nw;
       			len = nw.length();
       		}else {
       			ans+= " "+nw;
       			len += nw.length();
       		}
       	}
       	out.println(ans);
        
        
    }
}