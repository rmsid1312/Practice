package study;
import java.util.*;
/*
public class __3_2 {
	static int n;
	static int Answer;
	static boolean check[];
	static int start_x,start_y,end_x,end_y;
	static ArrayList<Point> customer = new ArrayList<Point>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1;t<=tc;t++) {
			n=sc.nextInt();
			check = new boolean[n];
			Arrays.fill(check, false);
			Answer=Integer.MAX_VALUE;
			customer.clear();
			start_x = sc.nextInt(); start_y = sc.nextInt();
			end_x = sc.nextInt(); end_y = sc.nextInt();
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();int y=sc.nextInt();
				customer.add(new Point(x,y));
			}
			dfs(0,start_x,start_y,0);
			System.out.println("#"+t+" "+Answer);
		}	
	}
	public static void dfs(int cnt,int cur_x,int cur_y,int distance) {
		if(n == cnt) {
			int res = distance + Accum(cur_x,cur_y,end_x,end_y);
			Answer = Math.min(Answer, res);
			return;
		}
		if(distance >= Answer) return;
		for(int i=0;i<n;i++) {
			if(check[i] == false) {
				Point next = customer.get(i);
				check[i] = true;
				dfs(cnt+1,next.x,next.y,distance+Accum(cur_x,cur_y,next.x,next.y));
				check[i] = false;
			}
		}
	}
	public static int Accum(int start_x,int start_y,int cur_x,int cur_y) {
		return (Math.abs(start_x-cur_x) + Math.abs(start_y-cur_y));
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}*/