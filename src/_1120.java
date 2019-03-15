import java.util.*;

public class _1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int sum=0;
		String a = sc.next(); String b =sc.next();
		for(int i=0;i<=b.length()-a.length();i++) {
			sum=0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(j) != b.charAt(j+i)) sum++;
			}			
			min=Math.min(min, sum);
		}
		System.out.println(min);
	}
}
