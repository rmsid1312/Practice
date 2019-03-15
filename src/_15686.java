import java.util.*;
/*
public class _15686 {
	static int n,m;
	static int map[][];
	static boolean check[];
	static int Answer=Integer.MAX_VALUE;
	static ArrayList<Point> house = new ArrayList<Point>();
	static ArrayList<Point> chicken = new ArrayList<Point>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt(); m=sc.nextInt();
		map = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) house.add(new Point(i,j));
				if(map[i][j] == 2) chicken.add(new Point(i,j));
			}
		}
		check = new boolean[chicken.size()];
		dfs(0,0);
		System.out.println(Answer);
//		탐색
	}
	public static void dfs(int select,int cnt) {
		if(cnt == m) {
			int dist = Cal();
			Answer = Math.min(dist, Answer);
			return ;
//			거리계산
//			작은값넣기
		}
		if(select>=chicken.size()) return;
		
		check[select] = true;
		dfs(select+1,cnt+1);
		check[select] = false;
		dfs(select+1,cnt);
	}
	public static int Cal() {
		int res=0;
		int tmp;
		for(int i=0;i<chicken.size();i++) {
			if(check[i] == true) System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<house.size();i++) {
			tmp=Integer.MAX_VALUE;
			for(int j=0;j<chicken.size();j++) {
				if(check[j] == false)continue;
				tmp = Math.min(tmp, Math.abs(house.get(i).x-chicken.get(j).x)+Math.abs(house.get(i).y-chicken.get(j).y));
			}
			res+=tmp;
		}
		return res;
	}
}

class Point{
	int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}
/*
for(int i=0;i<chicken.size();i++) {
	if(check[i] == false) continue;
	for(int j=0;j<house.size();j++) {
		distance[j] = Math.min(distance[j], Math.abs(chicken.get(i).x-house.get(j).x)+Math.abs(chicken.get(i).y-house.get(j).y));
	}
}
for(int i=0;i<house.size();i++) {
	res += distance[i];
}*/