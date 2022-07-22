import java.util.*;
import java.io.*;

public class CF546ASoldiers {
	static BufferedReader bf;
	static long k,w;
	static long ans,n;
	static StringTokenizer sk;
	
	public static void main(String[] args) throws IOException {
		bf=  new BufferedReader(new InputStreamReader(System.in));
		sk = new StringTokenizer(bf.readLine());
		k = Long.parseLong(sk.nextToken());
		w = Long.parseLong(sk.nextToken());
		n = Long.parseLong(sk.nextToken());
		
		ans = n*(n+1)/2*k-w;
		if(ans < 0) {
			System.out.println(0);
		}else System.out.println(ans);

		
	}
}
