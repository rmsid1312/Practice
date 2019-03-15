import java.util.*;
/*
public class _1018 {
	static int n,m;
	static boolean check[][];
	static char map[][];
	static char tmp[][];
	static int res=Integer.MAX_VALUE;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		n=sc.nextInt(); m=sc.nextInt();
		map = new char[n][m];
		tmp = new char[n][m];
		check = new boolean[n][m];
		for(int i=0;i<n;i++) {
			input = sc.next();
			for(int j=0;j<m;j++) {
				map[i][j] = input.charAt(j);
			}
		}
		for(int i=0;i<=n-8;i++) {
			for(int j=0;j<=m-8;j++) {
				Copy();
				bfs_white(8+i,8+j);//white start
				Copy();
				bfs_black(8+i,8+j);//black start
			}
		}
		System.out.println(res);
	}
	public static void Copy() {
		for(int i=0;i<n;i++) {
			Arrays.fill(check[i], false);
			for(int j=0;j<m;j++) {
				tmp[i][j] = map[i][j];
			}
		}
	}
	public static void bfs_white(int height,int width) {
		int cnt=0;
		if(tmp[height-8][width-8]=='B') {
			tmp[height-8][width-8]='W';
			cnt++;
		}
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(height-8,width-8));
		check[height-8][width-8] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0]; int ny = cur.y +dir[k][1];
				if(nx>=height-8 && nx<height && ny>=width-8 && ny<width) {
					if(tmp[cur.x][cur.y] != tmp[nx][ny] && check[nx][ny]==false) {
						q.add(new Point(nx,ny));
						check[nx][ny] = true;
					}
					if(tmp[cur.x][cur.y] == tmp[nx][ny] && check[nx][ny]==false) {
						q.add(new Point(nx,ny));
						check[nx][ny] = true;
						if(tmp[cur.x][cur.y] == 'B') tmp[nx][ny]='W';
						else tmp[nx][ny] = 'B';
						cnt++;
					}
				}
			}
		}
		res = Math.min(res, cnt);
	}
	public static void bfs_black(int height,int width) {
		int cnt=0;
		if(tmp[height-8][width-8]=='W') {
			tmp[height-8][width-8]='B';
			cnt++;
		}
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(height-8,width-8));
		check[height-8][width-8] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0]; int ny = cur.y +dir[k][1];
				if(nx>=height-8 && nx<height && ny>=width-8 && ny<width) {
					if(tmp[cur.x][cur.y] != tmp[nx][ny] && check[nx][ny]==false) {
						q.add(new Point(nx,ny));
						check[nx][ny] = true;
					}
					if(tmp[cur.x][cur.y] == tmp[nx][ny] && check[nx][ny]==false) {
						q.add(new Point(nx,ny));
						check[nx][ny] = true;
						if(tmp[cur.x][cur.y] == 'B') tmp[nx][ny]='W';
						else tmp[nx][ny] = 'B';
						cnt++;
					}
				}
			}
		}
		res = Math.min(res, cnt);
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y= y;
	}
}*/