import java.util.*;
/*
public class _1726 {
	static int sx,sy,sd,ex,ey,ed;
	static int n,m;
	static int map[][];
	static int dist[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); n = sc.nextInt();
		map = new int[m][n];
		dist = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		sx = sc.nextInt(); sy = sc.nextInt(); sd = sc.nextInt();
		ex = sc.nextInt(); ey = sc.nextInt(); ed = sc.nextInt();
		Queue<Point> q = new LinkedList<Point>();
		Move(q);
	}
	public static void Move(Queue<Point> q) {
		q.add(new Point(sx-1,sy-1));
		dist[sx-1][sy-1] = 0;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == ex-1 && cur.y == ey-1) {
				if(sd == ed) {
					System.out.println(dist[ex-1][ey-1]);
					return;
				}else {
					if(sd == 1) {
						if(ed == 2) {
							System.out.println(dist[ex-1][ey-1]+2);
							return;
						}
						else {
							System.out.println(dist[ex-1][ey-1]+1);
							return;
						}
					}else if(sd == 2) {
						if(ed == 1) {
							System.out.println(dist[ex-1][ey-1]+2);
							return;
						}else {
							System.out.println(dist[ex-1][ey-1]+1);
							return;
						}
					}else if(sd == 3) {
						if(ed == 4) {
							System.out.println(dist[ex-1][ey-1]+2);
							return;
						}else {
							System.out.println(dist[ex-1][ey-1]+1);
							return;
						}
					}else if(sd == 4) {
						if(ed == 3) {
							System.out.println(dist[ex-1][ey-1]+2);
							return;
						}else {
							System.out.println(dist[ex-1][ey-1]+1);
							return;
						}
					}
				}
			}
			for(int k=0;k<4;k++) {
				for(int i=1;i<=3;i++) {
					int nx = cur.x + dir[k][0]*i;
					int ny = cur.y + dir[k][1]*i;
					if(isInside(nx,ny)) {
						if(dist[nx][ny] == 0 && map[nx][ny] == 0) {
							q.add(new Point(nx,ny));
							dist[nx][ny] = dist[cur.x][cur.y]+1;
						}
					}
				}
			}
		}
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<m && ny>=0 && ny<n);
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/