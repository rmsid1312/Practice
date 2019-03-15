import java.util.*;
/*
public class _2606 {
	static int Answer=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int map[][] = new int[n+1][n+1];
		boolean check[] = new boolean[n+1];
		int k = sc.nextInt();
		for(int i=0;i<k;i++) {
			int x = sc.nextInt(); int y = sc.nextInt();
			map[x][y] = map[y][x] = 1;
		}
		Arrays.fill(check, false);
		dfs(1,map,check,n);
		System.out.println(Answer);
	}
	public static void dfs(int start,int map[][],boolean[] check,int n) {
		check[start] = true;
		for(int i=1;i<=n;i++) {
			if(map[start][i] == 1 && check[i] == false) {
				dfs(i,map,check,n); Answer++;
			}
		}
	}
}
*/