import java.util.*;
/*
public class SWEA_1953 {
	static int Answer = 1;
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}}; // ╩С го аб ©Л
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tt=0;tt<t;tt++) {
			int time = 1;
			int n,m,r,c,l,map[][];
			int check[][];
			Queue<Point> q = new LinkedList<Point>();
			n = sc.nextInt(); m = sc.nextInt(); r=sc.nextInt(); c=sc.nextInt(); l=sc.nextInt();
			map = new int[n][m]; check = new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					map[i][j] = sc.nextInt();
					check[i][j] = 0;
				}
			}
			q.add(new Point(r,c));
			check[r][c] = 1;
			while(!q.isEmpty()) {
				int Size = q.size();
				for(int i=0;i<Size;i++) {
					Point cur = q.poll();
					if(time == l) {
						Size = 0; q.clear();
						break;
					}
					for(int k=0;k<4;k++) {
						int nx = cur.x + dir[k][0]; int ny = cur.y + dir[k][1];
						if(isInside(nx,ny,n,m) && map[nx][ny] != 0 && check[nx][ny] == 0) {
							if(Cango(map[nx][ny],map[cur.x][cur.y],k)) {
								q.add(new Point(nx,ny));
								check[nx][ny] = 1;
								Answer++;
							}
						}	
					}
				}
				time++;
			}
			System.out.println("#"+(tt+1)+" "+Answer);
			Answer = 1;
		}
	}
	public static boolean Cango(int next_direction,int cur_direction,int k) {
		if(k==0) {
			if(cur_direction == 1 || cur_direction == 2 || cur_direction ==4 || cur_direction == 7) {
				if(next_direction == 1) {
					return true;
				}else if(next_direction == 2) {
					return true;
				}else if(next_direction == 3) {
					return false;
				}else if(next_direction == 4) {
					return false;
				}else if(next_direction == 5) {
					return true;
				}else if(next_direction == 6) {
					return true;
				}else if(next_direction == 7) {
					return false;
				}
			}
			else {
				return false;
			}
		}else if(k==1) {
			if(cur_direction == 1 || cur_direction == 2  || cur_direction == 5|| cur_direction == 6 ) {
				if(next_direction == 1) {
					return true;
				}else if(next_direction == 2) {
					return true;
				}else if(next_direction == 3) {
					return false;
				}else if(next_direction == 4) {
					return true;
				}else if(next_direction == 5) {
					return false;
				}else if(next_direction == 6) {
					return false;
				}else if(next_direction == 7) {
					return true;
				}
			}else{
				return false;
			}
		}else if(k==2) {
			if( cur_direction == 1|| cur_direction == 3|| cur_direction == 6|| cur_direction == 7) {
				if(next_direction == 1) return true;
				else if(next_direction == 2) return false;
				else if(next_direction == 3) return true;
				else if(next_direction == 4) return true;
				else if(next_direction == 5) return true;
				else if(next_direction == 6) return false;
				else if(next_direction == 7) return false;
			}
			else {
				return false;
			}
		}else {
			if( cur_direction == 1|| cur_direction == 3|| cur_direction == 4|| cur_direction == 5)
				if(next_direction == 1) return true;
				else if(next_direction == 2) return false;
				else if(next_direction == 3) return true;
				else if(next_direction == 4) return false;
				else if(next_direction == 5) return false;
				else if(next_direction == 6) return true;
				else if(next_direction == 7) return true;
			else {
				return false;
			}
		}
		return false;
	}
	public static boolean isInside(int nx,int ny,int n,int m) {
		return (nx>=0 && nx<n && ny>=0 && ny<m);
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/