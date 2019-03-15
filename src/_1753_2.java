import java.util.*;

public class _1753_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v,e,k,start,end,weight;
		v = sc.nextInt(); e =sc.nextInt();
		k = sc.nextInt();
		int map[][] = new int[v+1][v+1];
		boolean check[] = new boolean[v+1];
		int Answer[] = new int[v+1];
		for(int i=1;i<=v;i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(Answer, Integer.MAX_VALUE);
		for(int i=0;i<e;i++) {
			start = sc.nextInt(); end = sc.nextInt(); weight = sc.nextInt();
//			al.get(start).add(new Graph(end,weight));
			map[start][end] = weight;
		}
		for(int mid=1;mid<=v;mid++) {
			for(int i=1;i<=v;i++) {
				for(int j=1;j<=v;j++) {
					if(map[i][mid]>0 || map[mid][j]>0) {
						Answer[i] = Math.min(Answer[i], map[i][mid]+map[mid][j]);
					}
				}
			}
		}
		for(int i=1;i<=v;i++) System.out.println(Answer[i]);
	}
}
