import java.util.*;
/*
public class _16234 {
	static int Answer=0;
	static int map[][];
	static boolean check[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	static int n,l,r;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); l=sc.nextInt(); r=sc.nextInt();
		map = new int[n][n]; check = new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		while(true) {
			if(!Checking()) break;
			Solve();
			Answer++;
		}
		System.out.println(Answer);
	}
	public static boolean Checking() {
		boolean flag = false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<4;k++) {
					int nx = i + dir[k][0]; int ny = j + dir[k][1];
					if(nx>=0 && nx<n && ny>=0 && ny<n) {
						if(Math.abs(map[i][j]-map[nx][ny])>=l && Math.abs(map[i][j]-map[nx][ny])<=r) {
							flag=true;
						}
					}
				}
			}
		}
		return flag;
	}
	public static void Solve() {
		int sum=0,count = 0;
		Queue<Point> q = new LinkedList<Point>();
		ArrayList<Point> al = new ArrayList<Point>();
		int tmp[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				tmp[i][j] = map[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(check[i][j]) continue;
				q.add(new Point(i,j));
				al.add(new Point(i,j));
				check[i][j] = true;
				sum += map[i][j];
				count = 1;
				while(!q.isEmpty()) {
					Point cur = q.poll();
					for(int k=0;k<4;k++) {
						int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
						if(nx>=0 && nx<n && ny>=0 && ny<n) {
							if(Math.abs(map[cur.x][cur.y]-map[nx][ny])>=l && Math.abs(map[cur.x][cur.y]-map[nx][ny])<=r && check[nx][ny]==false) {
								q.add(new Point(nx,ny));
								al.add(new Point(nx,ny));
								check[nx][ny] = true;
								sum+=map[nx][ny]; count++;
							}
						}
					}
				}
				sum /= count;
				for(int k=0;k<al.size();k++) {
					tmp[al.get(k).x][al.get(k).y] = sum;
				}
				sum=0;al.clear();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = tmp[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			Arrays.fill(check[i], false);
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