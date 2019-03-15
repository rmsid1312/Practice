package XX;
import java.util.*;
//항상 맨 위에 있는 벽돌만 깨트릴 수 있다.
//벽돌은 숫자 1 ~ 9 로 표현되며,
//구술이 명중한 벽돌은 상하좌우로 ( 벽돌에 적힌 숫자 - 1 ) 칸 만큼 같이 제거된다.
/*
public class SWEA_5656 {
	static int Answer = Integer.MAX_VALUE;
	static int map[][];
	static int n,w,h;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			n=sc.nextInt();h=sc.nextInt();w=sc.nextInt();
			map = new int[w][h];
			int tmp[][] = new int[w][h];
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			//j i 바꾸기
			for(int i=0;i<w;i++) {
				for(int j=0;j<h;j++) {
					if(map[i][j]==0 || map[i-1][j] != 0)continue;
					Copy(tmp);
					Break(i,j,tmp);
					dfs(1,tmp);
				}
			}
		}
	}
	public static void dfs(int cnt,int tmp[][]) {
		if(cnt == n) {
			Cal(tmp);
			Print(tmp);
			System.out.println();
			return;
		}
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				if(tmp[i][j]==0 || tmp[i-1][j] != 0)continue;
				Break(i,j,tmp);
				dfs(cnt+1,tmp);
			}
		}
	}
	public static void Break(int x,int y,int tmp[][]) {
		if(tmp[x][y] == 1) {
			tmp[x][y] = 0;
			return;
		}else {
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(x,y,tmp[x][y]));
			while(!q.isEmpty()) {
				Point cur = q.poll();
				for(int i=1;i<=tmp[cur.x][cur.y]-1;i++) {
					for(int k=0;k<4;k++) {
						int nx = (cur.x + dir[k][0])*i; int ny = (cur.y + dir[k][1])*i;
						if(nx>=0 && nx<w && ny>=0 && ny<h && tmp[nx][ny] > 0) {
							if(tmp[nx][ny] == 1) {
								tmp[nx][ny] = 0;
							}
							else {
								q.add(new Point(nx,ny,tmp[nx][ny]));
							}
						}
					}
				}
				tmp[cur.x][cur.y] = 0;
			}
		}
		Move(tmp);
	}
	public static void Move(int tmp[][]) {
		Queue<Integer> move = new LinkedList<Integer>();
		for(int i=0;i<w;i++) {
			for(int j=h-1;j>=0;j--) {
				if(tmp[j][i] != 0) {
					move.add(tmp[j][i]);
					tmp[j][i] = 0;
				}
			}
			int Size = move.size();
			for(int j=h-1;j>=h-1-1-Size;j--) {
				tmp[j][i] = move.poll();
			}
		}
	}
	public static void Copy(int tmp[][]) {
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				tmp[i][j] = map[i][j];
			}
		}
	}
	public static void Cal(int tmp[][]) {
		int cnt=0;
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				if(tmp[i][j] != 0) cnt++;
			}
		}
		Answer = Math.min(cnt, Answer);
	}
	public static void Print(int tmp[][]) {
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				 System.out.print(tmp[i][j]);
			}
			System.out.println();
		}
	}
}

class Point{
	int x,y,boom;
	Point(int x,int y,int boom){
		this.x = x;
		this.y = y;
		this.boom = boom;
	}
}*/