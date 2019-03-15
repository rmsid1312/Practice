package study;
import java.util.*;
/*
public class SWEA_1263_bfs {
	static int map[][];
	static int dist[];
	static int Answer[];
	static int n;
	static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			n=sc.nextInt();
			map =new int[n][n];
			dist = new int[n];
			Answer = new int[n];
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				al.add(new ArrayList<Integer>());
			}
			Arrays.fill(dist, Integer.MAX_VALUE);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] =sc.nextInt();
					if(map[i][j] == 1) {
						al.get(i).add(j);
					}
				}
			}
			for(int i=0;i<n;i++) {
				bfs(i);
			}
			for(int i=0;i<n;i++) {
				if(min>Answer[i]) min = Answer[i];
			}
			System.out.println("#"+tc+" "+min);
			al.clear();
		}
	}
	public static void bfs(int start) {
		dist[start] = 0;
		int sum = 0;
		boolean check[] = new boolean[n];
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(start,0));
		check[start] = true;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int i=0;i<al.get(cur.number).size();i++) {
				if(check[al.get(cur.number).get(i)] == false) {
					dist[al.get(cur.number).get(i)] = Math.min(dist[al.get(cur.number).get(i)], cur.cnt+1);
					q.add(new Point(al.get(cur.number).get(i),cur.cnt+1));
					check[al.get(cur.number).get(i)] = true;
				}
			}
			
		}
		for(int j=0;j<n;j++) {
			sum += dist[j];
		}
		Answer[start] = sum;
		Arrays.fill(dist, Integer.MAX_VALUE);
	}
}

class Point{
	int number,cnt;
	Point(int number,int cnt){
		this.number = number;
		this.cnt = cnt;
	}
}
*/
/*
for(int i=0;i<n;i++) {
	if(map[cur.number][i] != 0 && check[i] == false) {
		dist[i] = Math.min(cur.cnt+1, dist[i]);
		q.add(new Point(i,cur.cnt+1));
		check[i] = true;
	}
}
*/