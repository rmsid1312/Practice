import java.util.*;
/*
public class _7569 {
	static int Answer=0;
	static int d[][][];
	static int map[][][];
	static int n,m,h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt(); n=sc.nextInt(); h=sc.nextInt();
		map = new int[n][m][h];
		d = new int[n][m][h];
		ArrayList<Point> dirs = new ArrayList<Point>();
		Queue<Point> q = new LinkedList<Point>();
		
		dirs.add(new Point(-1,0,0)); dirs.add(new Point(1,0,0));
		dirs.add(new Point(0,-1,0)); dirs.add(new Point(0,1,0));
		dirs.add(new Point(0,0,1)); dirs.add(new Point(0,0,-1));
		
		for(int k=0;k<h;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					d[i][j][k] = 0;
					map[i][j][k] = sc.nextInt();
					if(map[i][j][k] == 1) q.add(new Point(i,j,k));
				}
			}
		}
		if(Checking()) {
			System.out.println("0");
		}else {
			while(!q.isEmpty()) {
				Point cur = q.poll();
				for(int i=0;i<6;i++) {
					Point direction = dirs.get(i);
					int nx = cur.x +  direction.x; int ny = cur.y +direction.y; int nz = cur.z + direction.z;
					if(nx>=0 && nx<n && ny>=0 && ny<m && nz>=0 && nz<h) {
						if(d[nx][ny][nz] == 0 && map[nx][ny][nz] == 0) {
							map[nx][ny][nz] = 1;
							q.add(new Point(nx,ny,nz));
							d[nx][ny][nz] = d[cur.x][cur.y][cur.z] + 1;
							Answer = Math.max(d[nx][ny][nz], Answer);
						}
					}
				}
			}
			if(!Checking()) {
				System.out.println("-1");
			}else {
				System.out.println(Answer);
			}
		}
	}
	public static boolean Checking() {
		for(int k=0;k<h;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(map[i][j][k] == 0) return false;
				}
			}
		}
		return true;
	}
}

class Point{
	int x,y,z;
	Point(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}*/