package XX;
import java.util.Scanner;
import java.util.*;
/*
class 새로운방 {
	static long Answer=-1;
	static int n;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int n = sc.nextInt();
			int map[][][] = new int[n][n][2];
			int d[][][] = new int[n][n][2];
			boolean check[][] = new boolean[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int x = sc.nextInt();
					while(x%2==0) {
						x /= 2;
						map[i][j][0]++;
					}
					while(x%3==0) {
						x /= 3;
						map[i][j][1]++;
					}
					check[i][j] = false;
				}
			}
			Queue<Point> q = new LinkedList<Point>();
			d[0][0][0] = map[0][0][0];
			d[0][0][1] = map[0][0][1];
			q.add(new Point(0,0));
			while(!q.isEmpty()) {
				Point cur = q.poll();
				if(cur.x == n-1 && cur.y == n-1) {
					Answer = Math.min(d[n-1][n-1][0], d[n-1][n-1][1]);
				}
				check[cur.x][cur.y] = true;
				for(int k=0;k<4;k++) {
					int nx = cur.x + dir[k][0]; 
					int ny = cur.y + dir[k][1];
					if((nx>=0 && nx<n && ny>=0 && ny<n) && check[nx][ny] == false) {
						if(d[nx][ny][0] < d[cur.x][cur.y][0] + map[nx][ny][0]){
							d[nx][ny][0] = d[cur.x][cur.y][0] + map[nx][ny][0];
						}
						if(d[nx][ny][1] < d[cur.x][cur.y][1] + map[nx][ny][1]) {
							d[nx][ny][1] = d[cur.x][cur.y][1] + map[nx][ny][1];
						}
						q.add(new Point(nx,ny));
					}
				}
			}
			*/
			/*
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					for(int k=0;k<2;k++) {
						System.out.print(d[i][j][k]+ " ");
					}
				}
				System.out.println();
			}
			*/
/*
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
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
/*
//가로열더하기
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		
	}
}
//세로열더하기
 * */

//Answer = Math.min(d[n-1][n-1][0],d[n-1][n-1][1]);