import java.util.*;
import java.io.*;

public class CSES1068Weird {
	static Scanner in;
	static long n;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		n = in.nextLong();
		StringBuilder sb = new StringBuilder();
		while(n!=1){
			sb.append(n).append(" ");
			if(n%2==0) {
				n/=2;
			}else
				n=n*3+1;
			
		}
		sb.append(n);
		
		System.out.println(sb.toString());
		
	}
	
}
