import java.util.*;
/*
public class _5427 {
	static int res = -1;
	static int t,w,h;
	static int sx,sy;
	static char map[][];
	static int check[][];
	static int move[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++) {
			w = sc.nextInt(); h= sc.nextInt();
			map = new char[h][w];
			check = new int[h][w];
			move = new int[h][w];
			Queue<Point> fire = new LinkedList<Point>();
			for(int j=0;j<h;j++) {
				String s = sc.next();
				for(int k=0;k<w;k++) {
					 map[j][k] = s.charAt(k);
					if(map[j][k] == '@') {
						sx = j; sy = k;
					}
					if(map[j][k]=='*') {
						fire.add(new Point(j,k));
					}
					move[j][k] = 0;
					check[j][k] = 0;
				}
			}
			while(!fire.isEmpty()) {
				Point cur = fire.poll();
				for(int k=0;k<4;k++) {
					int nx = cur.x + dir[k][0];
					int ny = cur.y + dir[k][1];
					if(isInside(nx,ny)) {
						if((map[nx][ny] == '.' || map[nx][ny] == '@')) {
							if(check[nx][ny]==0) {
								fire.add(new Point(nx,ny));
								check[nx][ny] = check[cur.x][cur.y]+1;
							}
						}
					}
				}
			}
			bfs(sx,sy);
		}
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<h && ny>=0 && ny<w);
	}
	public static void bfs(int sx,int sy) {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(sx,sy));
		move[sx][sy] = 0;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == 0 || cur.y == 0 || cur.x == h-1 || cur.y == w-1) {
				System.out.println(move[cur.x][cur.y]+1);
				return;
			}
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0];
				int ny = cur.y + dir[k][1];
				if(isInside(nx,ny)) {
					if(move[nx][ny] == 0 && map[nx][ny] == '.') {
						if(check[nx][ny] > move[cur.x][cur.y]+1 || check[nx][ny] == 0) {
							q.add(new Point(nx,ny));
							move[nx][ny] = move[cur.x][cur.y] + 1;
						}
					}
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
*/