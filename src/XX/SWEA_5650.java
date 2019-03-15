package XX;
import java.util.*;
/*
public class SWEA_5650 {
	static int Answer = -1;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	static int ex,ey;
	static int n;
	static int map[][];
//	static Hole hole[][];
	static ArrayList<ArrayList<Hole>> hole = new ArrayList<>();
	static int cnt[];
//	static ArrayList<Hole> BlackHole = new ArrayList<Hole>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			n=sc.nextInt();
			map = new int[n+2][n+2];
			cnt = new int[11];
			for(int i=0;i<=11;i++) {
				hole.add(new ArrayList<Hole>());
			}
			Arrays.fill(cnt, 0);
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					map[i][j] = sc.nextInt();
//					if(map[i][j]==-1) BlackHole.add(new Hole(i,j));
					if(map[i][j]==6) {
						hole.get(map[i][j]).add(new Hole(i,j));
					}
					if(map[i][j]==7) {
						hole.get(map[i][j]).add(new Hole(i,j));
					}
					if(map[i][j]==8) {
						hole.get(map[i][j]).add(new Hole(i,j));
					}
					if(map[i][j]==9) {
						hole.get(map[i][j]).add(new Hole(i,j));
					}
					if(map[i][j]==10) {
						hole.get(map[i][j]).add(new Hole(i,j));
					}
				}
			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(map[i][j] != 0) continue;
					bfs(i,j);
					System.out.println(i+" "+j);
					System.out.println(Answer);
				}
			}
			System.out.println(Answer);
			Answer = -1;
		}
	}
	public static void bfs(int x,int y) {
		Queue<Ball> q = new LinkedList<Ball>();
		//상하좌우 방향을 큐에 넣음
		q.add(new Ball(x,y,0,0));
		q.add(new Ball(x,y,1,0));
		q.add(new Ball(x,y,2,0));
		q.add(new Ball(x,y,3,0));
		while(!q.isEmpty()) {
			Ball cur = q.poll();
			if((cur.x == x && cur.y == y && cur.count>0) || map[cur.x][cur.y] == -1) {
				Answer = Math.max(Answer, cur.count);
				continue;
			}
			int nx = cur.x + dir[cur.direction][0];
			int ny = cur.y + dir[cur.direction][1];
			if(nx>0 && nx<=n && ny>0 && ny<=n) {
//				0:상 1:하 2:좌 3:우
				if(map[nx][ny] == 1) {
					if(cur.direction == 0) {//위로 가다 만나면 아래로
						q.add(new Ball(cur.x,cur.y,1,cur.count+1));
					}else if(cur.direction == 1) {//아래로 가다 만나면 오른쪽으로
						q.add(new Ball(nx,ny,3,cur.count+1));
					}else if(cur.direction == 2) {//왼쪽으로 가다 만나면 위로
						q.add(new Ball(nx,ny,0,cur.count+1));
					}else {//오른쪽으로 가다 만나면 왼쪽으로
						q.add(new Ball(cur.x,cur.y,2,cur.count+1));
					}
				}else if(map[nx][ny]==2) {
					if(cur.direction == 0) {
						q.add(new Ball(nx,ny,3,cur.count+1));
					}else if(cur.direction == 1) {
						q.add(new Ball(cur.x,cur.y,0,cur.count+1));
					}else if(cur.direction == 2) {
						q.add(new Ball(nx,ny,1,cur.count+1));
					}else {
						q.add(new Ball(cur.x,cur.y,2,cur.count+1));
					}
				}else if(map[nx][ny]==3) {
					if(cur.direction == 0) {
						q.add(new Ball(nx,ny,2,cur.count+1));
					}else if(cur.direction == 1) {
						q.add(new Ball(cur.x,cur.y,0,cur.count+1));
					}else if(cur.direction == 2) {
						q.add(new Ball(cur.x,cur.y,3,cur.count+1));
					}else {
						q.add(new Ball(nx,ny,1,cur.count+1));
					}
				}else if(map[nx][ny]==4) {
					if(cur.direction == 0) {
						q.add(new Ball(cur.x,cur.y,1,cur.count+1));
					}else if(cur.direction == 1) {
						q.add(new Ball(nx,ny,2,cur.count+1));
					}else if(cur.direction == 2) {
						q.add(new Ball(cur.x,cur.y,3,cur.count+1));
					}else {
						q.add(new Ball(nx,ny,0,cur.count+1));
					}
				}else if(map[nx][ny]==5){
					if(cur.direction == 0) {
						q.add(new Ball(cur.x,cur.y,1,cur.count+1));
					}else if(cur.direction == 1) {
						q.add(new Ball(cur.x,cur.y,0,cur.count+1));
					}else if(cur.direction == 2) {
						q.add(new Ball(cur.x,cur.y,3,cur.count+1));
					}else {
						q.add(new Ball(cur.x,cur.y,2,cur.count+1));
					}
				}else if(map[nx][ny]==6) {
					for(int i=0;i<hole.get(map[nx][ny]).size();i++) {
						if(hole.get(map[nx][ny]).get(i).x != nx && hole.get(map[nx][ny]).get(i).y != ny) {
							q.add(new Ball(hole.get(map[nx][ny]).get(i).x, hole.get(map[nx][ny]).get(i).y,cur.direction,cur.count));
						}
					}
				}else if(map[nx][ny]==7) {
					for(int i=0;i<hole.get(map[nx][ny]).size();i++) {
						if(hole.get(map[nx][ny]).get(i).x != nx && hole.get(map[nx][ny]).get(i).y != ny) {
							q.add(new Ball(hole.get(map[nx][ny]).get(i).x, hole.get(map[nx][ny]).get(i).y,cur.direction,cur.count));
						}
					}
				}else if(map[nx][ny]==8) {
					for(int i=0;i<hole.get(map[nx][ny]).size();i++) {
						if(hole.get(map[nx][ny]).get(i).x != nx && hole.get(map[nx][ny]).get(i).y != ny) {
							q.add(new Ball(hole.get(map[nx][ny]).get(i).x, hole.get(map[nx][ny]).get(i).y,cur.direction,cur.count));
						}
					}
				}else if(map[nx][ny]==9) {
					for(int i=0;i<hole.get(map[nx][ny]).size();i++) {
						if(hole.get(map[nx][ny]).get(i).x != nx && hole.get(map[nx][ny]).get(i).y != ny) {
							q.add(new Ball(hole.get(map[nx][ny]).get(i).x, hole.get(map[nx][ny]).get(i).y,cur.direction,cur.count));
						}
					}
				}else if(map[nx][ny]==10) {
					for(int i=0;i<hole.get(map[nx][ny]).size();i++) {
						if(hole.get(map[nx][ny]).get(i).x != nx && hole.get(map[nx][ny]).get(i).y != ny) {
							q.add(new Ball(hole.get(map[nx][ny]).get(i).x, hole.get(map[nx][ny]).get(i).y,cur.direction,cur.count));
						}
					}
				}else if(map[nx][ny] == 0){//-1일 경우
					q.add(new Ball(nx,ny,cur.direction,cur.count));
				}else {
					q.add(new Ball(nx,ny,cur.direction,cur.count));
				}
			}else {//벽에 부딪힐 때
				if(cur.direction == 0) {
					q.add(new Ball(nx,ny,1,cur.count+1));
				}else if(cur.direction == 1) {
					q.add(new Ball(nx,ny,0,cur.count+1));
				}else if(cur.direction == 2) {
					q.add(new Ball(nx,ny,3,cur.count+1));
				}else {
					q.add(new Ball(nx,ny,2,cur.count+1));
				}
			}
		}
	}
}

class Ball{
	int x,y,direction,count;
	Ball(int x,int y,int direction,int count){
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.count = count;
	}
}

class Hole{
	int x,y;
	Hole(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/