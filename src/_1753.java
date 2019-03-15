import java.util.*;
//다익스트라
public class _1753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v,e,k,start,end,weight;
		v = sc.nextInt(); e =sc.nextInt();
		k = sc.nextInt();
//		ArrayList<ArrayList<Graph>> al = new ArrayList<ArrayList<Graph>>();
//		for(int i=0;i<=v;i++) al.add(new<Integer> ArrayList());
		int map[][] = new int[v+1][v+1];
		boolean check[] = new boolean[v+1];
		int Answer[] = new int[v+1];
		//초기화
		for(int i=1;i<=v;i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(Answer, Integer.MAX_VALUE);
		
		for(int i=0;i<e;i++) {
			start = sc.nextInt(); end = sc.nextInt(); weight = sc.nextInt();
//			al.get(start).add(new Graph(end,weight));
			map[start][end] = weight;
		}
		for(int i=1;i<=v;i++) {
			dfs(k,i,map,check,Answer,0);
		}
		

		for(int i=1;i<=v;i++) {
			if(i==k) {
				System.out.println("0");
				continue;
			}
			if(Answer[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
				continue;
			}
			System.out.println(Answer[i]);
		}
	}

	public static void dfs(int start,int dest,int[][] map, boolean check[],int Answer[],int weight) {
		check[start] = true;
		if(start == dest) {
			Answer[start] = Math.min(Answer[start], weight);
		}
		for(int i=start;i<=dest;i++) {
			if(map[start][i] != 0 && check[i] == false) {
				dfs(i,dest,map,check,Answer,weight+map[start][i]);
			}
			check[i] = false;
		}
	}
}

	
	//i=0부터 al(i).size까지
	/*
	public static void dfs(int start,int dest,ArrayList<ArrayList<Graph>> al, boolean check[],int Answer[],int weight) {
		if(start == dest) {
			Answer[start] = Math.min(Answer[start], weight);
		}
		check[start] = true;
		for(int i=0;i<=al.get(start).size();i++) {
			if(al.get(start).get(i).weight != 0 && check[al.get(start).get(i).end] == false) {
				dfs(al.get(start).get(i).end,dest,al,check,Answer,weight+al.get(start).get(i).weight);
			}
			check[i] = false;
		}
	}
}

class Graph{
	int end,weight;
	Graph(int end,int weight){
		this.end = end;
		this.weight = weight;
	}
}
	*/