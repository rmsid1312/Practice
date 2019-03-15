import java.util.*;
/*
public class _1010 {
	static int test_case,n,m;
	static int d[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test_case = sc.nextInt();
		for(int t=0; t<test_case;t++) {
			n = sc.nextInt(); m = sc.nextInt();
			d = new int[m+1][m+1];
			//mCn
			int Answer = comb(m,n);
			System.out.println(Answer);
			}
	}
	public static int comb(int n,int k) {
		if(d[n][k] != 0) {
			return d[n][k];
		}
		if(n == k || k == 0) {
			return d[n][k]=1;
		}
		return d[n][k] = comb(n-1,k)+comb(n-1,k-1);
	}
}
*/