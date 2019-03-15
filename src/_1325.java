import java.util.*;
/*
public class _1325 {
	static int Answer=0;
	static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	static boolean visit[];
	static int count[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		int max=-1;
		visit = new boolean[n+1];
		count = new int[n+1];
		ArrayList<Integer> Max = new ArrayList<Integer>();
		for(int i=0;i<=n;i++) {
			al.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int p,c;
			p = sc.nextInt(); c=sc.nextInt();
			al.get(c).add(p);
		}
		for(int i=1;i<=n;i++) {
			dfs(i);
		}
		max = count[1];
		for(int i=2;i<=n;i++) {
			if(max < count[i]) max = count[i];
		}
		for(int i=1;i<=n;i++) {
			if(max == count[i]) Max.add(i);
		}
		Collections.sort(Max, new MyCompare());
		for(int i=0;i<Max.size();i++) {
			System.out.print(Max.get(i)+" ");
		}
	}
	//cycle해결하기
	public static int dfs(int start) {
		if(visit[start]) return (count[start]);
		visit[start] = true;
//		count[start]++;
		for(int i=0;i<al.get(start).size();i++) {
				count[start] += dfs(al.get(start).get(i));
			
		}
		return (1 + count[start]);
	}
}

class MyCompare implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2) {
			return 1;
		}else if(o1==o2){
			return 1;
		}
		else {
			return -1;
		}
	}
	
}*/