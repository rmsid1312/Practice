import java.util.*;
/*
public class _3190 {
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}}; //╩С го аб ©Л
	static int Answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k,l,x,y,time=0,prevtime=0,nx,ny;
		int direction=3;
		String c;
		n = sc.nextInt();
		k = sc.nextInt();
		int map[][] = new int[n+1][n+1];
		for(int i=0;i<k;i++) {
			x = sc.nextInt(); y = sc.nextInt();
			map[x][y] = 1;
		}
		l = sc.nextInt();
		Queue<Point> q = new LinkedList<Point>();
		Queue<Point> snake = new LinkedList<Point>();
		q.add(new Point(1,1)); snake.add(new Point(1,1));
		
			for(int i=0;i<l;i++) {
				int Time;
				if(i==0) {
					prevtime = time = sc.nextInt();
					direction = 3;
					Time = time;
				}else {
					prevtime = time;
					c = sc.next();
					time = sc.nextInt();
					direction = turnDirection(direction,c);
					Time = time-prevtime;
				}
				
				for(int j=0;j<Time;j++) {
					while(!q.isEmpty()) {
						Point cur = q.poll();
						nx = cur.x + dir[direction][0];
						ny = cur.y + dir[direction][1];
						if(check(snake,nx,ny) || !isInside(nx,ny,n)) {
							time = 0; l=0; q.clear();
							break;
						}
						if(isInside(nx,ny,n) && map[nx][ny] == 0) {
							q.add(new Point(nx,ny));
							snake.poll(); snake.add(new Point(nx,ny));
							Answer++;
							break;
						}
						if(isInside(nx,ny,n) && map[nx][ny] == 1) {
							map[nx][ny] = 0;
							q.add(new Point(nx,ny));
							snake.add(new Point(nx,ny));
							Answer++;
							break;
						}
					}
				}
			}
			c = sc.next();
			direction = turnDirection(direction,c);
			while(!q.isEmpty()) {
				Point cur = q.poll();
				nx = cur.x + dir[direction][0];
				ny = cur.y + dir[direction][1];
				if(check(snake,nx,ny)) break;
				if(isInside(nx,ny,n) && map[nx][ny] == 0) {
					q.add(new Point(nx,ny));
					snake.poll(); snake.add(new Point(nx,ny));
					Answer++;
				}
				if(isInside(nx,ny,n) && map[nx][ny] == 1) {
					map[nx][ny] = 0;
					q.add(new Point(nx,ny));
					snake.add(new Point(nx,ny));
					Answer++;
				}
			}
		System.out.println(Answer+1);
	}
	public static boolean check(Queue<Point> snake,int nx,int ny) {
		Iterator<Point> iter = snake.iterator();
		while(iter.hasNext()) {
			Point tmp = iter.next();
//			System.out.print(tmp.x + "," + tmp.y +" ");
			if(tmp.x == nx && tmp.y== ny) {
				return true;
			}
		}
//		System.out.println();
		return false;
	}
	public static boolean isInside(int nx,int ny,int n) {
		return (nx>=1 && nx<=n && ny>=1 && ny<=n);
	}
	public static int turnDirection(int direction,String c) {
		if(c.equals("D")) {
			if(direction==0) {
				return 3;
			}else if(direction==1) {
				return 2;
			}else if(direction==2) {
				return 0;
			}else {
				return 1;
			}
		}else {
			if(direction==0) {
				return 2;
			}else if(direction==1) {
				return 3;
			}else if(direction==2) {
				return 1;
			}else {
				return 0;
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