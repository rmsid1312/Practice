import java.util.*;
/*
public class _2146 {
	static int min = 30000;
	static int n;
	static int map[][];
	static boolean check[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n]; check = new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
				check[i][j] = false;
			}
		}
		distinct();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	public static void distinct() {
		Queue<Point> q = new LinkedList<Point>();
		int cnt = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j] == 0 || check[i][j] == true) continue;
				q.add(new Point(i,j,0));
				check[i][j] = true;
				while(!q.isEmpty()) {
					Point cur = q.poll();
					for(int k=0;k<4;k++) {
						int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
						if(nx>=0 && nx<n && ny>=0 && ny<n && map[nx][ny]==1 && check[nx][ny]==false) {
							q.add(new Point(nx,ny,cur.dist));
							check[nx][ny] = true;
							map[nx][ny] = cnt;
						}
					}
				}
				++cnt;
			}
		}
	}
}

class Point{
	int x,y,dist;
	Point(int x,int y,int dist){
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
}*/