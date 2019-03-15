import java.util.*;
/*
public class _3055 {
	static int end_x,end_y;
	static int r,c;
	static char map[][];
	static int water[][];
	static int move[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); c = sc.nextInt();
		map = new char[r][c];
		water = new int[r][c];
		move = new int[r][c];
		String s;
		Queue<Point> w = new LinkedList<Point>();
		Queue<Point> go = new LinkedList<Point>();
		for(int i=0;i<r;i++) {
			s = sc.next();
			for(int j=0;j<c;j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == '*') {
					w.add(new Point(i,j));
				}
				if(map[i][j] == 'S') {
					go.add(new Point(i,j));
				}
				if(map[i][j] == 'D') {
					end_x = i;
					end_y = j;
				}
				water[i][j] = move[i][j] = 0;
			}
		}
		//water시간돌리기
	 	Water(w);
		
		//move돌리기
		Move(go);

		
	}
	public static boolean Water(Queue<Point> q) {
		while(!q.isEmpty()) {
			is = true;
			Point cur = q.poll();
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0];
				int ny = cur.y + dir[k][1];
				if(isInside(nx,ny) && water[nx][ny] == 0) {
					if(map[nx][ny] == '.' || map[nx][ny] == 'S') {
						water[nx][ny] = water[cur.x][cur.y] + 1;
						q.add(new Point(nx,ny));
					}
				}
			}
		}
	}
	public static void Move(Queue<Point> q) {
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == end_x && cur.y == end_y) {
				System.out.println(move[end_x][end_y]);
				return;
			}
			for(int k=0;k<4;k++) {
				int nx = cur.x + dir[k][0];
				int ny = cur.y + dir[k][1];
				if(isInside(nx,ny) && map[nx][ny] == 'X') continue;
				if(isInside(nx,ny) && move[nx][ny] == 0) {
					if((map[nx][ny] == '.') && (move[cur.x][cur.y] + 1 < water[nx][ny]) || water[nx][ny] == 0) {
						move[nx][ny] = move[cur.x][cur.y] + 1;
						q.add(new Point(nx,ny));
					}
					if(map[nx][ny] == 'D') {
						move[nx][ny] = move[cur.x][cur.y] + 1;
						q.add(new Point(nx,ny));
					}
				}
			}
		}
		System.out.println("KAKTUS");
	}
	public static boolean isInside(int nx,int ny) {
		return (nx>=0 && nx<r && ny>=0 && ny<c);
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/