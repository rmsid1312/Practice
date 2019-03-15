package XX;
import java.util.*;
/*
public class _5_3 {
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
			Collections.sort(matrix, new MyComp());
			Stack<Point> st = new Stack<Point>();
			for(int i=matrix.size()-1;i>=0;i--) {
				st.push(matrix.get(i));
			}
			while(st.size()>1) {
				Point o1 = st.pop(); Point o2 = st.pop();
				sum += (o1.x * o1.y * o2.y);
				st.push(new Point(o1.x,o2.y));
			}
			System.out.println("#"+tc+" "+sum);
			matrix.clear();
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
	int x,y;
	ArrayList<Point> push;
	Push(int x,int y){
		this.x = x;
		this.y = y;
	}
}
*/
//for(int i=0;i<matrix.size();i++) {
//	System.out.println(matrix.get(i).x +" " + matrix.get(i).y);
//}
/*
public static void sort_matrix(Point start) {
	Push res = new Push(0,0);
	Queue<Point> q = new LinkedList<Point>();
	q.add(new Point(start.x,start.y));
	check[start.x][start.y] = true;
	while(!q.isEmpty()) {
		Point cur = q.poll();
		res.push.add(new Point(cur.x,cur.y));
		for(int i=0;i<matrix.size();i++) {
			if(cur.y == matrix.get(i).x) {
				q.add(new Point(matrix.get(i).x,matrix.get(i).y));
			}
		}
	}
}
*/
/*
 for(int z=0;z<matrix.size();z++) {
				ArrayList<Point> tmp = new ArrayList<Point>();
				for(int k=0;k<matrix.size();k++) {
					tmp.add(matrix.get(k));
				}
				int sum=0;
				int i=z; int j=0;
				while(tmp.size() != 1) {
					Point o1 = tmp.get(i); Point o2 = tmp.get(j);
					if(o1.y == o2.x) {
						sum += (o1.x * o1.y * o2.y);
						tmp.add(new Point(o1.x,o2.y));
						tmp.remove(o1); tmp.remove(o2);
						i=0; j=1;
						continue;
					}
					if(o1.x == o2.y) {
						sum += (o1.x * o1.y * o2.x);
						tmp.add(new Point(o2.x,o1.y));
						tmp.remove(o1);tmp.remove(o2);
						i=0;j=1;
						continue;
					}
					j++;
				}
				Answer = Math.min(Answer, sum);
				tmp.clear();
			}
 */



/*
			for(int i=0;i<matrix.size();i++) {
				System.out.print(matrix.get(i).x + " " + matrix.get(i).y);
				System.out.println();
			}
			
			
int sum = 0;
for(int i=0;i<matrix.size();i++) {
	ArrayList<Point> tmp = matrix;
	for(int j=0;tmp.size()!=1;j++) {
		if(i==j) continue;
		Point o1 = tmp.get(i); Point o2 = tmp.get(j);
		if(o1.y == o2.x) {
			sum += (o1.x * o1.y * o2.y);
			tmp.add(new Point(o1.x,o2.y));
			tmp.remove(o1); tmp.remove(o2);
		}
		if(o1.x == o2.y) {
			sum += (o2.x * o2.y + o1.x);
			tmp.add(new Point(o2.x,o1.y));
			tmp.remove(o1);tmp.remove(o2);
		}
	}
}
*/