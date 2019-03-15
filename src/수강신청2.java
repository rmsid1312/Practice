
import java.util.Arrays;
import java.util.Scanner;
/*
class 수강신청 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int n = sc.nextInt(); int m = sc.nextInt();
			int d[] = new int[m+1];
			int map[] = new int[n+1];
			for(int i=1;i<=n;i++) {
				map[i] = sc.nextInt();
				d[map[i]] = 1;
			}
			for(int i=1;i<=m;i++) {
				if(d[i]==0) continue;
				for(int j=1;j<=n;j++) {
					if(d[i]==1) {
						if(map[j]+i<=m) {
							d[map[j]+i] = 1;
						}
					}
				}
			}
			for(int i=m;i>=1;i--) {
				if(d[i] == 1) {
					Answer = i;
					break;
				}
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}*/