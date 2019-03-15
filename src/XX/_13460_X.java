package XX;
import java.util.*;
/*
//빨간구슬을 구멍에 통과시켜라!
//동시에 구슬이 움직이는거...
//idea = 구슬 클래스에 red,blue좌표를 넣어서 for문으로 한번에 굴린다...
public class _13460 {
	static int n,m;
	static int end_x,end_y;
	static char map[][];
	static int move[][];
	static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
 	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		n = sc.nextInt(); m = sc.nextInt();
		map = new char[n][m];
		move = new int[n][m];
		String s;
		int rx=0,ry=0,bx=0,by=0;
		Queue<Point> q = new LinkedList<Point>();
		for(int i=0;i<n;i++) {
			s = sc.next();
			for(int j=0;j<m;j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == 'O') {
					end_x = i;
					end_y = j;
				}
				if(map[i][j] == 'R') {
					rx = i; ry = j;
				}
				if(map[i][j] == 'B') {
					bx = i; by = j;
				}
			}
		}
		q.add(new Point(rx,ry,bx,by));
		while(!q.isEmpty()) {
			Point cur = q.poll();
			while(cur.red_x>=0 && cur.red_x<n && cur.red_y>=0 && cur.red_y <m) {
				if(map[cur.red_x+1][cur.red_y])
			}
			//상
			//하
			//좌
			//우
		}
	}
}

class Point{
	int red_x,red_y,blue_x,blue_y;
	Point(int red_x,int red_y,int blue_x,int blue_y){
		this.red_x = red_x;
		this.red_x = red_y;
		this.blue_x = blue_x;
		this.blue_y = blue_y;
	}
}*/