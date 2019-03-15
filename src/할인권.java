/*
import java.util.Arrays;
import java.util.Scanner;
class 할인권 {
	static int Answer;
	static int map[][];
	static int n,m,k,p;
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;//할인권의 총 개수
			n=sc.nextInt(); m=sc.nextInt(); k=sc.nextInt();
			map= new int[n+1][n+1];
			for(int i=1;i<=n;i++) {
				Arrays.fill(map[i], 0);
			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==j) map[i][j]=0;
					else map[i][j] = 9999;
				}
			}
			for(int i=0;i<m;i++) {
				int x = sc.nextInt(); int y = sc.nextInt();
				int c = sc.nextInt();
				map[x][y] = map[y][x] = c;
			}
			
			for(int mid=1;mid<=n;mid++) {
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( map[i][j] > map[i][mid] + map[mid][j]) {
							map[i][j] = map[i][mid] + map[mid][j];
						}
					}
				}
			}
			p = sc.nextInt();
			for(int i=0;i<p;i++) {
				int start = sc.nextInt(); int end =sc.nextInt();
				if(map[start][end] > k) {
					Answer++;
				}
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}*/