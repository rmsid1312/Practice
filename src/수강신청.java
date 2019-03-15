
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
			int d[] = new int[n+1];
			int map[] = new int[n+1];
			for(int i=1;i<=n;i++) {
				map[i] = sc.nextInt();
			}
//			Arrays.sort(map);
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					int reset = d[i];
					d[i] = Math.max(d[i-1]+map[j], d[i]);
					if(d[i] > m) {
						d[i] = reset;
					}
				}
			}
			for(int i=1;i<d.length;i++) {
				Answer = Math.max(d[i], Answer);
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}*/