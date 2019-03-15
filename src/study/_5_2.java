package study;
import java.util.*;
/*
public class _5_2 {
	static boolean check[][];//0~40
	static ArrayList<Stick> Answer = new ArrayList<Stick>();
	static ArrayList<ArrayList<Point>> map = new ArrayList<>();
	public static void main(String[] args) {
		//dfs 백트래킹
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			ArrayList<Stick> push = new ArrayList<Stick>();
			int n=sc.nextInt();
			check = new boolean[41][41];
			for(int i=0;i<=40;i++) {
				map.add(new ArrayList<Point>());
			}
			for(int i=0;i<2*n;i++) {
				int x=sc.nextInt(); int y=sc.nextInt();
				map.get(x).add(new Point(x,y));
			}
			for(int i=0;i<=40;i++) {
				if(map.get(i).size() == 0)continue;
				for(int j=0;j<map.get(i).size();j++) {
					dfs(map.get(i).get(j),push);	
				}
			}
		}
	}
	public static void dfs(Point start,ArrayList<Stick> push) {
		check[start.x][start.y] = true;
		if(push.size() > Answer.size()) {
			Answer.clear();
			for(int i=0;i<push.size();i++) {
				Answer.add(push.get(i));
			}
		}
	}
}

class Stick{
	ArrayList<Point> al;
	int size;
	Stick(int size){
		this.size = size;
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x =x;
		this.y = y;
	}
}*/