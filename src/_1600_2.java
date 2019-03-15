import java.util.*;
/*
public class _1600_2 {
	static int res = -1;
	static int k,w,h;
	static int map[][];
	static boolean check[][][];
	static int horse[][] = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		w = sc.nextInt(); h = sc.nextInt();
		map = new int[h][w];
		check = new boolean[h][w][k+1];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				map[i][j] = sc.nextInt();
			} 
		}
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(0,0,0,k));
		check[0][0][0] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == h-1 && cur.y == w-1) {
				res = cur.dist;
				break;
			}
			if(cur.k > 0) {
				for(int i=0;i<8;i++) {
					int nx = cur.x + horse[i][0];
					int ny = cur.y + horse[i][1];
					if(isInside(nx,ny)) {
						if(map[nx][ny]==0 && check[nx][ny][cur.k-1] == false) {
							q.add(new Point(nx,ny,cur.dist+1,cur.k-1));
							check[nx][ny][cur.k-1] = true;
						}
					}
					
				}
			}
			for(int i=0;i<4;i++) {
				int nx = cur.x + dir[i][0];
				int ny = cur.y + dir[i][1];
				if(isInside(nx,ny)) {
					if(map[nx][ny]==0 && check[nx][ny][cur.k] == false) {
						q.add(new Point(nx,ny,cur.dist+1,cur.k));
						check[nx][ny][cur.k] = true;
					}
				}
			}
		}
		System.out.println(res);
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<h && ny>=0 && ny<w);
	}
}

class Point{
	int x,y,dist,k;
	Point(int x,int y,int dist,int k){
		this.x = x;
		this.y = y;
		this.dist = dist;
		this.k = k;
	}
}*/