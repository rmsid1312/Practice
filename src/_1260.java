import java.util.*;
/*
public class _1260 {
	static int map[][];
	static boolean check[];
	static boolean vertex[];
	static int n,m,v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		n=sc.nextInt(); m=sc.nextInt(); v=sc.nextInt();
		map= new int[n+1][n+1];
		check = new boolean[n+1];
		vertex = new boolean[n+1];
		for(int i=0;i<m;i++) {
			x=sc.nextInt();  y=sc.nextInt();
			map[x][y] = map[y][x] = 1;
		}
		Arrays.fill(check, false);
		Arrays.fill(vertex, false);
		dfs(v);
		System.out.println();
		Arrays.fill(vertex, false);
		bfs(v);
	}
	public static void dfs(int start) {
		vertex[start] = true;
		System.out.print(start+" ");
		for(int i=1;i<=n;i++) {
			if(map[start][i] == 1 && vertex[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		check[start] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur+" ");
			for(int i=1;i<=n;i++) {
				if(map[cur][i] == 1 && vertex[i] == false) {
					q.add(i);
					vertex[i] = true;
				}
			}
		}
	}
}
*/