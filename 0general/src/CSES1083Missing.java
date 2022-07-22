import java.util.*;
import java.io.*;

public class CSES1083Missing {
	static BufferedReader in;
	static StringTokenizer st;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(in.readLine());
		
		st = new StringTokenizer(in.readLine());
		
		long sum = n*(n+1)/2;
		
		for(int i = 0;i<n-1;i++) {
			sum-=Long.parseLong(st.nextToken());
		}
		System.out.println(sum);
	}
}
