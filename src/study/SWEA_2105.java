package study;
import java.util.*;
/*
public class SWEA_2105 {
	static int n;
	static int map[][];
	static boolean desert[];
	static int dir[][] = {{1,1},{1,-1},{-1,-1},{-1,1}}; //시계방향
	static int start_x,start_y;
	static int Answer=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			n=sc.nextInt();
			map = new int[n][n];
			desert = new boolean[101];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<n-2;i++) {
				for(int j=1;j<n-1;j++) {
					start_x = i; start_y = j;
					desert[map[i][j]] = true;
					dfs(i,j,0,0);
					desert[map[i][j]] = false;
				}
			}
			System.out.println("#"+tc+" "+(Answer));
			Answer=-1;
		}
	}
	public static void dfs(int x,int y,int count,int prev_mode) {
		if(x-1==start_x && y+1==start_y && (prev_mode == 3 || prev_mode==2)) {
			Answer = Math.max(Answer, count+1);
			return ;
		}
		for(int k=prev_mode;k<prev_mode+2;k++) {
			if(k==4) continue;
			int nx = x+dir[k][0]; int ny = y+dir[k][1];
			if(nx>=0 && nx<n && ny>=0 && ny<n && desert[map[nx][ny]] == false) {
				desert[map[nx][ny]] = true;
				dfs(nx,ny,count+1,k);
				desert[map[nx][ny]] = false;
			}
		}
	}
}
*/