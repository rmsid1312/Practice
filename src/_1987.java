import java.util.*;
/*
public class _1987 {
	static int Answer = 0;
	static int map[][];
	static int alpabet[];
	static int r,c;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); c = sc.nextInt();
		map = new int[r][c];
		alpabet = new int[26];
		Arrays.fill(alpabet, 0);
		for(int i=0;i<r;i++) {
			String s = sc.next();
			for(int j=0;j<c;j++) {
				map[i][j] = s.charAt(j)-65;
			}
		}
		dfs(0,0,1);
		System.out.println(Answer);
	}
	public static void dfs(int x,int y,int cnt) {
		alpabet[map[x][y]] = 1;
		if(Answer < cnt) {
			Answer = cnt;
		}
		for(int k=0;k<4;k++) {
			int nx = x + dir[k][0];
			int ny = y + dir[k][1];
			if(isInside(nx,ny) && alpabet[map[nx][ny]] == 0) {
				dfs(nx,ny,cnt+1);
			}
		}
		cnt--;
		alpabet[map[x][y]] = 0;
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<r && ny>=0 && ny<c);
	}
}
*/