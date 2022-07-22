import java.util.*;
import java.io.*;

public class CF231ATEAM {
	static BufferedReader bf;
	static int n,ans;
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		
		bf = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(bf.readLine());
		int sum = 0;
		for(int i = 0;i<n;i++) {
			
			st = new StringTokenizer(bf.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			if(sum >= 2) {
				ans++;
			}
		//	System.out.println(sum);
		}
		System.out.println(ans);
		
		
		
		
	}
}
