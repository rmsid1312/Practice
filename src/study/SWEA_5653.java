package study;
//생명력 수치가 높은 줄기 세포가 해당 그리드 셀을 혼자서 차지하게 된다.
//N, M은 각각 1 이상 50 이하의 정수이다
/*
import java.util.*;
public class SWEA_5653 {
	static int Answer=0;
	static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int n,m,k;
			Queue<Point> q = new LinkedList<Point>();
			Queue<Point> tmp = new LinkedList<Point>();
			n=sc.nextInt();m=sc.nextInt();k=sc.nextInt();
			int map[][] = new int[701][701];
			boolean check[][] = new boolean[701][701];
			for(int i=300;i<300+n;i++) {	//i,j 300
				for(int j=300;j<300+m;j++) {
					map[i][j]=sc.nextInt();
					if(map[i][j]==0) continue;
					q.add(new Point(i,j,map[i][j],map[i][j]*2));
					check[i][j] = true;
				}
			}
			while(!q.isEmpty() && k>0) {
				int Size = q.size();
				for(int z=0;z<Size;z++) {
					Point cur = q.poll();
					if(cur.time == 0) {
						if(cur.life-1 == 0) {
							map[cur.x][cur.y] = 11;
							
						}else {
							q.add(new Point(cur.x,cur.y,0,cur.life-1));
						}
						continue;
					}
					if(cur.life > cur.time) {
						q.add(new Point(cur.x,cur.y,cur.time,cur.life-1));
						continue;
					}
					for(int i=0;i<4;i++) {
						int nx = cur.x + dir[i][0]; int ny = cur.y + dir[i][1];
						if(check[nx][ny] == false && map[nx][ny] < map[cur.x][cur.y]) {
							map[nx][ny] = map[cur.x][cur.y];
							tmp.add(new Point(nx,ny,0,0));
						}
					}
					if(cur.life-1==0) {
						map[cur.x][cur.y] = 11;
					}else {
						q.add(new Point(cur.x,cur.y,0,cur.life-1));
					}
				}
				int SSize = tmp.size();
				for(int z=0;z<SSize;z++) {
					Point add = tmp.poll();
					if(check[add.x][add.y] == false) {
						check[add.x][add.y] = true;
						q.add(new Point(add.x,add.y,map[add.x][add.y],map[add.x][add.y]*2));
					}
				}
				k--;
			}
			System.out.println("#"+t+" "+q.size());
			
		}
	}
}

class Point{
	int x,y,time,life;
	Point(int x,int y,int time,int life){
		this.x =x;
		this.y =y;
		this.time = time;
		this.life = life;
	}
}

 */