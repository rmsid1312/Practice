import java.util.*;
/*
public class SWEA_2105 {
	static int Answer = -1;
	static int map[][],check[][];
	static int dir[][] = {{-1,-1},{-1,1},{1,-1},{1,1}};
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int t=1;t<=test_case;t++) {
			n = sc.nextInt();
			map = new int[n][n];
			check = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
					check[i][j] = 0;
				}
			}
			ArrayList<Point> al = new ArrayList<Point>();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					al.add(new Point(i,j,map[i][j]));
					dfs(0,0,al);
				}
			}
			System.out.println("#"+t+" "+Answer);
			Answer = -1;
			al.clear();
		}
	}
	public static void dfs(int x,int y,ArrayList<Point> al) {
		Stack<Point> st = new Stack<Point>();
		st.
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<n && ny>=0 && ny<n);
	}
	public static boolean checking(int num,ArrayList<Point> al) {
		Iterator<Point> iter = al.iterator();
		while(iter.hasNext()) {
			int cmp = iter.next().num;
			if(cmp == num) return false;
		}
		return true;
	}
}

class Point{
	int x,y,num;
	Point(int x,int y,int num){
		this.x = x;
		this.y = y;
		this.num = num;
	}
}*/