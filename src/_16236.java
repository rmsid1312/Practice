import java.util.*;
import java.util.Comparator;
/*
public class _16236 {
	static int Answer = 0;
	static int n;
	static int map[][];
	static boolean visit[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n]; visit = new boolean[n][n];
		for(int i=0;i<n;i++) {
			Arrays.fill(map[i], 0);
			Arrays.fill(visit[i], false);
		}
		Point shark = null;
		Queue<Point> q = new LinkedList<Point>();
		ArrayList<Point> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 9) {
					q.add(new Point(i,j,2,0,0));
					shark = new Point(i,j,2,0,0);
					visit[i][j] = true;
				}
			}
		}
		while(true) {
			while(!q.isEmpty()) {
				Point cur = q.poll();
				for(int k=0;k<4;k++) {
					int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
					if(nx>=0 && nx<n && ny>=0 && ny<n) {
						if(visit[nx][ny] == false && (map[nx][ny] == 0 || map[nx][ny] == cur.size)) {
							q.add(new Point(nx,ny,cur.size,cur.count,cur.dist+1));
							visit[nx][ny] = true;
						}
						if(visit[nx][ny] == false && map[nx][ny] != 0 && map[nx][ny] < cur.size) {
							al.add(new Point(nx,ny,map[nx][ny],0,cur.dist+1));
						}
					}
				}
			}
			if(al.size() == 0) {
				System.out.println(Answer);
				break;
			}
			else {
				for(int i=0;i<n;i++) {
					Arrays.fill(visit[i], false);
				}
				Collections.sort(al, new MyComparator());
				map[shark.x][shark.y] = 0;
				shark.x = al.get(0).x;
				shark.y = al.get(0).y;
				visit[shark.x][shark.y] = true;
				shark.count++;
				Answer += al.get(0).dist;
				if(shark.count == shark.size) {
					shark.count = 0;
					shark.size++;
				}
				q.add(shark);
				map[al.get(0).x][al.get(0).y] = 9;
				al.clear();
			}
		}
	}
}

class MyComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1,Point p2) {
		if(p1.dist > p2.dist) {
			return 1;
		}else if(p1.dist == p2.dist) {
			if(p1.x > p2.x) {
				return 1;
			}else if(p1.x == p2.x) {
				if(p1.y > p2.y) {
					return 1;
				}else return -1;
			}else return -1;
		}else return -1;
	}
}

class Point{
	int x,y,dist,size,count;
	Point(int x,int y,int size,int count,int dist){
		this.x = x;
		this.y = y;
		this.size = size;
		this.count = count;
		this.dist = dist;
	}
}*/