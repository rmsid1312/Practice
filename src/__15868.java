import java.util.*;
/*
public class __15868 {
	static int Answer=Integer.MAX_VALUE;
	static int d[][];
	static int map[][];
	static boolean check[][];
	static int n,m;
	static ArrayList<Point> chicken = new ArrayList<Point>();
	static ArrayList<Point> house = new ArrayList<Point>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();m=sc.nextInt();
		map = new int[n][n]; check = new boolean[n][n]; d = new int[n][n];
		for(int i=0;i<n;i++) {
			Arrays.fill(d[i],Integer.MAX_VALUE);
			Arrays.fill(check[i],false);
			for(int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==1) house.add(new Point(i,j));
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]==2) {
					chicken.add(new Point(i,j));
					check[i][j] = true;
					dfs(1);
					chicken.remove(chicken.size()-1);
				}
			}
		}
		System.out.println(Answer);
	}
	public static void dfs(int cnt) {
		if(cnt==m) {
			Cal();
			return;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]==2 && check[i][j] == false) {
					chicken.add(new Point(i,j));
					check[i][j] = true;
					dfs(cnt+1);
					check[i][j] = false;
					chicken.remove(chicken.size()-1);
				}
			}
		}
	}
	public static void Cal() {
		int sum=0;
		for(int i=0;i<chicken.size();i++) {
			Point cur = chicken.get(i);
			for(int j=0;j<house.size();j++) {
				Point cmp = house.get(j);
				d[cmp.x][cmp.y] = Math.min(Math.abs(cur.x-cmp.x) + Math.abs(cur.y-cmp.y), d[cmp.x][cmp.y]);
			}
		}
		for(int i=0;i<house.size();i++) {
			sum += d[house.get(i).x][house.get(i).y];
		}
		Answer = Math.min(Answer, sum);
		for(int i=0;i<n;i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
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