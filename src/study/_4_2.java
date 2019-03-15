package study;
import java.util.*;
/*
public class _4_2 {
	static int Answer = Integer.MAX_VALUE;
	static int map[][];
	static int d[][];
	static boolean check[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
	//d[][] 2차원 배열에 거리 작은것으로 기록하면서 이동하고 마지막에 d[n-1][n-1]출력	
		Scanner sc = new Scanner(System.in);
		int tc =sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int n=sc.nextInt();
			String s;
			map = new int[n][n]; d = new int[n][n]; check = new boolean[n][n];
			for(int i=0;i<n;i++) {
				Arrays.fill(d[i], 0);
				s = sc.next();
				for(int j=0;j<n;j++) {
					map[i][j] =s.charAt(j)-'0';
				}
			}
			Answer = Integer.MAX_VALUE;
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(0,0));
			while(!q.isEmpty()) {
				Point cur = q.poll();
				if(cur.x == n-1 && cur.y == n-1) {
					Answer = Math.min(Answer, d[n-1][n-1]);
				}
				for(int k=0;k<4;k++) {
					int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
					if(nx>=0 && nx<n && ny>=0 && ny<n ) {
						if(check[nx][ny]==false || d[nx][ny] > d[cur.x][cur.y] + map[nx][ny]) {
							d[nx][ny] = d[cur.x][cur.y] + map[nx][ny];
							q.add(new Point(nx,ny));
							check[nx][ny] = true;
						}
					}
				}
			}
			System.out.println("#"+t+" "+Answer);
		}
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