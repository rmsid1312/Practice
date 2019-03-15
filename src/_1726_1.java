import java.util.*;
/*
public class _1726_1 {
	static int Answer = Integer.MAX_VALUE;
	static int map[][];
	static boolean check[][][];
	static int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}}; // µ¿ ¼­ ³² ºÏ
	static int n,m;
//	µ¿ 1 ¼­ 2 ³²3 ºÏ 4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx,sy,sd,ex,ey,ed;
		int i,j;
		Queue<Point> q = new LinkedList<Point>();
		n=sc.nextInt(); m=sc.nextInt();
		map=new int[n][m];
		check =new boolean[n][m][4];
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		sx=sc.nextInt();sy=sc.nextInt();sd=sc.nextInt(); sx-=1;sy-=1;sd-=1;
		ex=sc.nextInt();ey=sc.nextInt();ed=sc.nextInt(); ex-=1;ey-=1;ed-=1;
		
		q.add(new Point(sx,sy,sd,0));
		check[sx][sy][sd] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == ex && cur.y == ey) {
				Answer = Math.min(Answer, cur.cnt+turnDirection(cur.d,ed));
			}
			for(i=0;i<4;i++) {
				for(j=1;j<=3;j++) {
					int nx = cur.x + dir[i][0]*j; int ny = cur.y + dir[i][1]*j;
					if(nx>=0 && nx<n && ny>=0 && ny<m) {
						if(map[nx][ny] == 1) break;
						if(map[nx][ny] == 0 && check[nx][ny][i]==false) {
							q.add(new Point(nx,ny,i,cur.cnt+turnDirection(cur.d,i)+1));
							check[nx][ny][i] = true;
						}
					}
				}
			}
		}
		System.out.println(Answer);
	}
	public static int turnDirection(int d,int i) {
		if(d==i) {
			return 0;
		}
		else if(d==0) 
		{
			if(i==1) return 2;
		}
		else if(d==1) 
		{
			if(i==0) return 2;
		}else if(d==2) 
		{
			if(i==3) return 2;
		}
		else 
		{
			if(i==2) return 2;
		}
		return 1;
	}
}

class Point{
	int x,y,d,cnt;
	Point(int x,int y,int d,int cnt){
		this.x = x;
		this.y = y;
		this.d = d;
		this.cnt = cnt;
	}
}*/