import java.util.*;
/*
public class _1014 {
	static int[][] dir = {{0,-1},{-1,-1},{-1,1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		char [][]map = new char[n][m];
		boolean [][]check = new boolean[n][m];
		Queue<Point> q = new LinkedList<Point>();
		for(int i=0;i<n;i++) {
			String s = sc.next();
			for(int j=0;j<m;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				q.add(new Point(i,j));
				check[i][j] = true;
				while(!q.isEmpty()) {
					Point cur = q.poll();
					for(int k=0;k<4;k++) {
						int nx = cur.x +dir[k][0];
						int ny = cur.y +dir[k][1];
						if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny] == '.') {
							map[nx][ny] = 'x';
						}
					}
				}
			}
		}
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/