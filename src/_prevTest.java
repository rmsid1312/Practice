import java.util.*;
//dfs정리하기
/*
public class _prevTest {
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}}; //상 하 좌 우
	static int Answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int min_length = 13;
		ArrayList<Point> al = new ArrayList<Point>();
		for(int t=0;t<test_case;t++) {
			int n = sc.nextInt();
			int [][]map = new int[n][n];
			int [][]check = new int[n][n];
			Queue<Point> q = new LinkedList<Point>();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					check[i][j] = map[i][j] = sc.nextInt();
					if(i!=0 && j!=0 && i!=n-1 && j!=n-1) al.add(new Point(i,j,0));
				}
			}
			int Size = al.size();
			for(int i=0;i<Size;i++) {
				Point cur = al.get(i);
				dfs(cur.x,cur.y,n,map,check,al);
			}
			System.out.println(Answer);
		}
	}
	public static void dfs(int cur_x,int cur_y,int n,int [][]map,int [][]check,ArrayList<Point> al) {
		for(int i=0;i<4;i++) {
			int nx = cur_x+dir[i][0]; int ny = cur_y+dir[i][1];
			if(!isInside(nx,ny,n) || check[nx][ny] == 1) {
				return;
			}
			if(isInside(nx,ny,n) && check[nx][ny] == 0) {
				check[nx][ny] = 1;
				dfs(nx,ny,n,map,check);
			}
		}
	}
	public static boolean isInside(int nx,int ny,int n) {
		return (nx>=0 && nx<n && ny>=0 && ny<n);
	}
}

class Point{
	int x,y,length;
	Point(int x,int y,int length){
		this.x = x;
		this.y = y;
		this.length = length;
	}
}*/