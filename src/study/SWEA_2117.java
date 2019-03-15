package study;
import java.util.*;
/*
public class SWEA_2117 {
	static int Answer=0;
	static int n,m;
	static int map[][];
	static ArrayList<Point> home = new ArrayList<Point>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			n = sc.nextInt(); m =sc.nextInt();
			map = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
					if(map[i][j]==1) {
						home.add(new Point(i,j));
					}
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					Solve(i,j);
				}
			}
			System.out.println("#"+ tc+" "+Answer);
			home.clear();
			Answer=0;
		}
	}
	public static void Solve(int x,int y) {
		for(int i=1;i<=2*n-1;i++) {
			int res = 0;
			int Runningcost = (int)Math.pow(i, 2) + (int)Math.pow(i-1, 2);
			for(int j=0;j<home.size();j++) {
				int sum = 0;
				Point cur = home.get(j);
				int distance = Math.abs(cur.x - x) + Math.abs(cur.y-y);
				if(distance < i) {
					res++;
					Runningcost -= m;
				}
			}
			if(Runningcost <= 0) {
				Answer = Math.max(res, Answer);
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