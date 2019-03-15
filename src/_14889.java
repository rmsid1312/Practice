import java.util.*;

public class _14889 {
	static int Answer=Integer.MAX_VALUE;
	static boolean check[];
	static int map[][];
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		map = new int[n][n];
		check = new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=sc.nextInt();
			}
		}

		dfs(0,0);
		System.out.println(Answer);
	}
	public static void dfs(int team,int cnt) {
		if(cnt == n/2) {
			cal();
			return;
		}
		if(team >= n) return;
		check[team] = true;
		dfs(team+1,cnt+1);
		check[team] = false;
		dfs(team+1,cnt);
	}
	public static void cal() {
		ArrayList<Integer> start = new ArrayList<Integer>();
		ArrayList<Integer> link = new ArrayList<Integer>();
		int start_point=0;
		int link_point=0;
		for(int i=0;i<n;i++) {
			if(check[i]==true) start.add(i);
			else link.add(i);
		}
		for(int i=0;i<start.size()-1;i++) {
			for(int j=i+1;j<start.size();j++) {
				int team1 = start.get(i); int team2 = start.get(j);
				start_point += map[team1][team2];
				start_point += map[team2][team1];
			}
		}
		for(int i=0;i<link.size()-1;i++) {
			for(int j=i+1;j<link.size();j++) {
				int team1 = link.get(i); int team2 = link.get(j);
				link_point += map[team1][team2];
				link_point += map[team2][team1];
			}
		}
		Answer = Math.min(Answer, Math.abs(start_point-link_point));
	}
}
