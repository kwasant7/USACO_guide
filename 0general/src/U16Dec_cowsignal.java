import java.util.*;
import java.io.*;

public class U16Dec_cowsignal {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "test";
    static int m,n,k;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        
    	Scanner q = new Scanner(System.in);
    	
    	m = q.nextInt();
    	n = q.nextInt();
    	k = q.nextInt();
    	char[][] plane = new char[m][];
    	for(int i = 0;i<m;i++) {
    		plane[i] = q.next().toCharArray();
    	}
    	
    	char[][] res =new char[m*k][n*k];
    	
    	for(int i =0;i< m*k;i+=k) {
    		for(int j = 0;j<n*k;j+=k) {
    			for(int a = 0;a<k;a++) {
    				for(int b = 0;b<k;b++) {
    					res[i+a][j+b] = plane[i/k][j/k];
    				}
    			}
    		}
    	}
    	
    	for(int i = 0;i<m*k;i++) {
    		System.out.println(new String(res[i]));
    	}
        
        in.close();
        out.close();
    }


}