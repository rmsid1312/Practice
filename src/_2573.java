import java.util.*;
/*
public class _2573 {
	static int year=0;
	static int status;
	static int n,m;
	static boolean check[][];
	static int map[][];
	static int tmp[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		map = new int[n][m]; check = new boolean[n][m]; tmp = new int[n][m];
		for(int i=0;i<n;i++) {
			Arrays.fill(map[i], 0);
			Arrays.fill(tmp[i], 0);
			Arrays.fill(check[i], false);
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				tmp[i][j] = map[i][j] = sc.nextInt();
			}
		}
		while(true) {
			status = 0;
			reset();
			status = checking();
			if(status == 0) break;
			if(status >= 2) break;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(map[i][j] == 0) continue;
					int cnt = 0;
					for(int k=0;k<4;k++) {
						int nx = i + dir[k][0]; 
						int ny = j + dir[k][1];
						if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny] == 0) {
							cnt++;
						}
					}
					if(map[i][j] - cnt <= 0) {
						tmp[i][j] = 0;
					}
					else {
						tmp[i][j] -= cnt;
					}
				}
			}
			for(int i=0;i<n;i++) {
				map[i] = Arrays.copyOf(tmp[i], tmp[i].length);
			}
			year++;
		}
		//분리되지않을때 예외처리
		if(status ==0) System.out.println("0");
		else System.out.println(year);
	}
	public static int checking() {
		Queue<Point> q = new LinkedList<Point>();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j] == 0 || check[i][j] == true) continue;
				q.add(new Point(i,j));
				check[i][j] = true;
				while(!q.isEmpty()) {
					Point cur = q.poll();
					for(int k=0;k<4;k++) {
						int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
						if(nx>=0 && nx< n && ny>=0 && ny<m && check[nx][ny] == false && map[nx][ny] != 0) {
							q.add(new Point(nx,ny));
							check[nx][ny] = true;
						}
					}
				}
				cnt++;
			}
		}
		return cnt;
	}
	public static void reset() {
		for(int i=0;i<n;i++) {
			Arrays.fill(check[i], false);
		}
	}
}

class Point{
	int x,y,year;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/