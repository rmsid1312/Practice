import java.util.*;
/*
public class _1600 {
	static int res = -1;
	static int k,w,h;
	static int map[][];
	static int check[][][];
	static int horse[][] = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		w = sc.nextInt(); h = sc.nextInt();
		map = new int[h][w];
		check = new int[h][w][k+1];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				map[i][j] = sc.nextInt();
				for(int z=0;z<k+1;z++) {
					check[i][j][z] = 0;
				}
			}
		}
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(0,0,k));
		check[0][0][k] = 1;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == h-1 && cur.y == w-1) {
				break;
			}
			if(cur.k > 0) {
				for(int i=0;i<8;i++) {
					int nx = cur.x + horse[i][0];
					int ny = cur.y + horse[i][1];
					if(isInside(nx,ny)) {
						if(map[nx][ny]==0 && check[nx][ny][cur.k-1] == 0) {
							q.add(new Point(nx,ny,cur.k-1));
							check[nx][ny][cur.k-1] = check[cur.x][cur.y][cur.k]+1;
						}
					}
					
				}
			}
			for(int i=0;i<4;i++) {
				int nx = cur.x + dir[i][0];
				int ny = cur.y + dir[i][1];
				if(isInside(nx,ny)) {
					if(map[nx][ny]==0 && check[nx][ny][cur.k] == 0) {
						q.add(new Point(nx,ny,cur.k));
						check[nx][ny][cur.k] = check[cur.x][cur.y][cur.k]+1;
					}
				}
			}
		}
		if(check[h-1][w-1][0]==0) {
			System.out.println("-1");
		}
		else {
			System.out.println(check[h-1][w-1][0]-1);
		}
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<h && ny>=0 && ny<w);
	}
}

class Point{
	int x,y,k;
	Point(int x,int y,int k){
		this.x = x;
		this.y = y;
		this.k = k;
	}
}*/