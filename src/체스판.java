import java.util.*;
/*
class 체스판 {
	static int Answer;
	static int[][] dir = {{1,0},{0,1}};
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int n = sc.nextInt(); int m = sc.nextInt(); int k=sc.nextInt();
			int[] d = new int[n+m+2];
			boolean[] check = new boolean[n+m+2];
			Queue<Point> q = new LinkedList<Point>();
			int x=1,y=1;//사용할 좌표
			
			for(int i=0;i<k;i++) {
				int a=sc.nextInt(); int b=sc.nextInt();
					if(isInside(a,b,n,m)) {
						d[a+b] = -1;//장애물 표시
					}
			}
			
			d[1+1] = 1;//start표시
			q.add(new Point(1,1));
			check[1+1] = true;
			while(!q.isEmpty()) {
				Point cur = q.poll();
				if(cur.x == n && cur.y == m) {
					Answer = d[cur.x+cur.y];
				}
				for(int i=0;i<2;i++) {
					int nx = x+dir[i][0]; int ny = y+dir[i][1];
					if(isInside(nx,ny,n,m) && d[nx+ny] != -1) {
						d[nx+ny] = (d[x+y]+1)%1000000007;
						q.add(new Point(nx,ny));
						check[nx+ny] = true;
					}
				}
			}
			//(Isinside(nx,ny) && (map[x-1][y] != -1 || map[x][y+1] != -1))
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	public static boolean isInside(int nx,int ny,int n,int m) {
		return (nx>=1 && nx<=n && ny>=1 && ny<=m);
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/