import java.util.*;
/*
public class _14502 {
	static int n,m;
	static int Answer=0;
	static int map[][];
	static int tmp[][];
	static ArrayList<Point> al;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		map = new int[n][m];
		tmp = new int[n][m];
		al = new ArrayList<Point>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				tmp[i][j] = map[i][j] = sc.nextInt();
				if(map[i][j] == 2) al.add(new Point(i,j));
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j] ==0) {
					Copy();
					tmp[i][j] = 1;
					dfs(1);
					tmp[i][j] = 0;
				}
			}
		}
		System.out.println(Answer);
	}
	public static void Copy() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				tmp[i][j] = map[i][j];
			}
		}
	}
	public static void dfs(int cnt) {
		if(cnt==3) {
			bfs();
			return;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(tmp[i][j]==0) {
					tmp[i][j] = 1;
					dfs(cnt+1);
					tmp[i][j] = 0;
				}
			}
		}
	}

	public static void bfs() {
		int tmp2[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				tmp2[i][j] = tmp[i][j];
			}
		}
		Queue<Point> q = new LinkedList<Point>();
		for(int i=0;i<al.size();i++) q.add(al.get(i));
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
				if(isInside(nx,ny) && tmp2[nx][ny] == 0) {
					tmp2[nx][ny] = 2;
					q.add(new Point(nx,ny));
				}
			}
		}
		Count(tmp2);
	}
	public static void Count(int tmp2[][]) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(tmp2[i][j] == 0) count++;
			}
		}
		Answer = Math.max(count, Answer);
	}
	
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<n && ny>=0 && ny<m);
	}
}
 
class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/