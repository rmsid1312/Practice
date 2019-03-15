package study;
import java.util.*;
/*
public class _5_3_1 {
	static int Answer = Integer.MAX_VALUE;
	static ArrayList<Point> matrix = new ArrayList<Point>();
	static int n;
	static boolean check[][];
	static Point d[][];
	static int map[][];
	static int dir[][] = {{1,0},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			int sum = 0;
			n=sc.nextInt();
			map = new int[n][n];
			d = new Point[n][n];
			check = new boolean[101][101];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j]=sc.nextInt();
					d[i][j] = new Point(0,0);
				}
			}
			for(int i=0;i<101;i++) {
				Arrays.fill(check[i], false);
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(map[i][j]==0 || d[i][j].x != 0 || d[i][j].y != 0) continue;
					get_matrix(i,j);
				}
			}
			for(int i=0;i<matrix.size();i++) {
			System.out.println(matrix.get(i).x +" " + matrix.get(i).y);
			}
			for(int i=0;i<matrix.size();i++) {
				bfs(matrix.get(i));
				for(int j=0;j<101;j++) {
					Arrays.fill(check[j], false);
				}
			}
			System.out.println("#"+tc+" "+Answer);
			matrix.clear();
			Answer = Integer.MAX_VALUE;
		}
	}
	public static void bfs(Point start) {
		Queue<Push> q = new LinkedList<Push>();
		check[start.x][start.y] = true;
		q.add(new Push(start.x,start.y,0));
		while(!q.isEmpty()) {
			Push cur = q.poll();
			if(Answer > cur.sum && cur.sum != 0) Answer = Math.min(Answer, cur.sum);
			for(int i=0;i<matrix.size();i++) {
				if(check[matrix.get(i).x][matrix.get(i).y] ==  true) continue;
				Point cmp = matrix.get(i);
				if(cur.y == cmp.x) {
					q.add(new Push(cur.x,cmp.y,cur.sum + cur.x*cur.y*cmp.y));
					check[cur.x][cmp.y] = true;
				}
				if(cur.x == cmp.y) {
					q.add(new Push(cmp.x,cur.y,cur.sum + cmp.x*cmp.y*cur.y));
					check[cmp.x][cur.y] = true;
				}
			}
		}
	}
	public static void get_matrix(int x,int y) {
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		int lx=0,ly=0;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int k=0;k<2;k++) {
				int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
				if(nx>=0 && nx<n && ny>=0 && ny<n && (d[nx][ny].x == 0 && d[nx][ny].y == 0) && map[nx][ny] != 0) {
					if(k==0) {
						d[nx][ny].x = d[cur.x][cur.y].x + 1;
						d[nx][ny].y = d[cur.x][cur.y].y;
						q.add(new Point(nx,ny));
						if(lx < d[nx][ny].x) lx = d[nx][ny].x;
						if(ly < d[nx][ny].y) ly = d[nx][ny].y;
					}else {
						d[nx][ny].x = d[cur.x][cur.y].x;
						d[nx][ny].y = d[cur.x][cur.y].y + 1;
						q.add(new Point(nx,ny));
						if(lx < d[nx][ny].x) lx = d[nx][ny].x;
						if(ly < d[nx][ny].y) ly = d[nx][ny].y;
					}
				}
			}
		}
		matrix.add(new Point(lx+1,ly+1));
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class MyComp implements Comparator<Point>{
	@Override
	public int compare(Point arg0, Point arg1) {
		if(arg0.x < arg1.x) {
			return -1;
		}else {
			return 1;
		}
	}
}
class Push{
	int x,y,sum;
	Push(int x,int y,int sum){
		this.x = x;
		this.y = y;
		this.sum = sum;
	}
}*/