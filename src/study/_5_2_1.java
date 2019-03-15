package study;
import java.util.*;
/*
public class _5_2_1 {
	static Point Answer = new Point(0,0);
	static boolean check[][];
	static ArrayList<Point> map = new ArrayList<Point>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			int n=sc.nextInt();
			check = new boolean[41][41];
			for(int i=0;i<n;i++) {
				int x=sc.nextInt(); int y=sc.nextInt();
				map.add(new Point(x,y));
			}
			for(int i=0;i<map.size();i++) {
				bfs(map.get(i));
				for(int j=0;j<41;j++) {
					for(int k=0;k<41;k++) {
						check[j][k] = false;
					}
				}
			}

			System.out.print("#"+tc+" ");
			for(int i=0;i<Answer.push.size();i++) {
				System.out.print(Answer.push.get(i).x + " " +Answer.push.get(i).y+ " ");
			}
			Answer.push.clear();
			map.clear();
			System.out.println();
		}
	}
	public static void bfs(Point start) {
		Point res = new Point(0,0);
		Queue<Point> q = new LinkedList<Point>();
		start.push.add(new Point(start.x,start.y));
		q.add(start);
		check[start.x][start.y]=true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.push.size() > res.push.size()) {
				res.push.clear();
				for(int i=0;i<cur.push.size();i++) {
					res.push.add(cur.push.get(i));
				}
			}
			
			for(int i=0;i<map.size();i++) {
				if(check[map.get(i).x][map.get(i).y] == false) {
					if(cur.y == map.get(i).x) {
						Point add = new Point(map.get(i).x,map.get(i).y);
						for(int j=0;j<cur.push.size();j++) {
							add.push.add(cur.push.get(j));
						}
						add.push.add(new Point(map.get(i).x,map.get(i).y));
						q.add(add);
						check[map.get(i).x][map.get(i).y]=true;
						
					}
				}
			}
		}
		if(Answer.push.size() < res.push.size()) {
			Answer.push.clear();
			for(int i=0;i<res.push.size();i++) {
				Answer.push.add(res.push.get(i));
			}
		}
	}
}
class Point{
	int x,y;
	ArrayList<Point> push = new ArrayList<Point>();
	Point(int x,int y){
		this.x =x;
		this.y = y;
	}
}*/