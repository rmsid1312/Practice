import java.util.*;
//Ʈ���� �������� ���� �� ���� �ε����� ã�´�.
//���� �� index�������� ���� �հ��� ã�´�.
/*
public class _1967 {
	static int r,Answer=0;
	static int index = -1;
	static boolean visit[];
	static ArrayList<ArrayList<Tree>> al = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<=n;i++) {
			al.add(new ArrayList<Tree>());
		}
		visit = new boolean[10001]; 
		for(int i=0;i<n-1;i++) {
			int p=sc.nextInt(); int c = sc.nextInt(); int weight = sc.nextInt();
			al.get(p).add(new Tree(c,weight));
			al.get(c).add(new Tree(p,weight)); 
		}//�����
		dfs(1,0);
		for(int i=0;i<=n;i++) {
			visit[i] = false;
		}
		r=0;
		dfs(index,0);
		Answer+=r;
		System.out.println(Answer);
	}
	public static void dfs(int start,int d) {
		if(visit[start]) return;
		visit[start] = true;
		if(r < d) {
			r = d;
			index = start;
		}
		for(int i=0;i<al.get(start).size();i++) {
			dfs(al.get(start).get(i).end,d+al.get(start).get(i).weight);
		}
	}
}
class Tree{
	int end,weight;
	Tree(int end,int weight){
		this.end = end;
		this.weight = weight;
	}
}
*/