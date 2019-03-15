package study;
import java.util.*;
/*
public class SWEA_1949 {
	static int n,k;
	static int Answer = -1;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			n=sc.nextInt(); k=sc.nextInt();
			ArrayList<Point> highest = new ArrayList<Point>();
			int [][]map = new int[n][n];
			boolean [][]check = new boolean[n][n];
			int max = -1;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
					if(max < map[i][j]) max = map[i][j];
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(max == map[i][j]) highest.add(new Point(i,j));
				}
			}
			for(int i=0;i<highest.size();i++) {
				Point cur = highest.get(i);
				dfs(cur.x,cur.y,1,map,check,1);
				check[cur.x][cur.y] = false;
			}
			System.out.println("#"+tc+" "+Answer);
			Answer=0;
		}
	}
	public static void dfs(int x,int y,int d,int map[][],boolean check[][],int cnt) {
		check[x][y] = true;
		Answer = Math.max(Answer, d);
		for(int i=0;i<4;i++) {
			int nx = x + dir[i][0]; int ny = y + dir[i][1];
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(map[nx][ny] - map[x][y] < k && map[nx][ny] >= map[x][y] && cnt>0 && check[nx][ny] == false) {
					int temp = map[nx][ny];
					map[nx][ny] -= (map[nx][ny]-map[x][y]+1);
					dfs(nx,ny,d+1,map,check,cnt-1);
					map[nx][ny] += (temp-map[x][y]+1);
					check[nx][ny] =false;
				}
				if(map[nx][ny] < map[x][y] && check[nx][ny] == false) {
					dfs(nx,ny,d+1,map,check,cnt);
					check[nx][ny] = false;
				}
			}
		}
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/