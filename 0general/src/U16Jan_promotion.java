import java.util.*;
import java.io.*;

public class U16Jan_promotion {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "promote";
    static int Ob,Nb,Os,Ns,Og,Ng,Op,Np;
    static String b,s,g,p;

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
    	Ob = b.charAt(0)-48;
    	Nb = b.charAt(2)-48;
    	s = in.readLine();
    	Os = s.charAt(0)-48;
    	Ns = s.charAt(2)-48;
    	g = in.readLine();
    	Og = g.charAt(0)-48;
    	Ng = g.charAt(2)-48;
    	p = in.readLine();
    	Op = p.charAt(0)-48;
    	Np = p.charAt(2)-48;
    }
    
    static void solve() {
        int gp = Np-Op;
        Og -= gp;
        int sg = Ng-Og;
        Os-=sg;
        int bs = Ns-Os;
        System.out.println(bs);
        System.out.println(sg);
        System.out.println(gp);
    }
}