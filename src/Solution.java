import java.util.Arrays;
import java.util.Scanner;
class Solution {
	static int Answer;
	static long ans=0;
	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int n = sc.nextInt(); int m = sc.nextInt();
			long p = 1000000007;
			long t1 = 1;
			long t2 = 1;
			for(long i=1;i<=n;i++) {
				t1 *= i;
				t1 %= p;
			}
			for(long i=1;i<=m;i++) {
				t2 *= i;
				t2 %= p;
			}
			for(long i=1;i<=n-m;i++) {
				t2 *= i;
				t2 %= p;
			}
			long t3 = mul(t2,p-2,p);
			t3 %= p;
			ans = t1*t3;
			ans %= p;
			for(int i=0;i<=n;i++){
			    for(int j=i;j<=m+i;j++){
			        Answer += mul(j,i,1000000007);
			    }
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	public static long mul(long x,long y,long p) {
		long ans = 1;
		while(y>0) {
			if(y%2 != 0) {
				ans *= x;
				ans %= p;
			}
			x *= x;
			x %= p;
			y /= 2;
		}
		return ans;
	}
}