package study;
import java.util.*;
/*
public class _3_1 {
	static Tree tree[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int v,e,v1,v2,tmp_v1,tmp_v2,count=0,common=0;
			v=sc.nextInt();e=sc.nextInt();v1=sc.nextInt();v2=sc.nextInt();
			boolean check[] = new boolean[v+1];
			tree = new Tree[v+1];
			Arrays.fill(check, false);
//			Arrays.fill(tree, 0);
			for(int i=0;i<=v;i++) {
				tree[i].left = 0;
				tree[i].parent = 0;
				tree[i].right = 0;
			}
			for(int i=0;i<e;i++) {
				int p=sc.nextInt(); int c=sc.nextInt();
				if(tree[p].left == 0) tree[p].left = c;
				else tree[p].right = c;
			}	
			CleanUp(v);
			tmp_v1 = v1; tmp_v2 = v2;
			while(true) {
				if(tree[tmp_v1].parent == 0) break;
				check[tmp_v1] = true;
				tmp_v1 = tree[tmp_v1].parent;
			}
			while(true) {
				if(check[tmp_v2] == true) break; //tmp_v2 가 공통 조상
				tmp_v2 = tree[tmp_v2].parent;
			}
			common = tmp_v2;
			System.out.println(common);
		}
	}
	public static void CleanUp(int v) {
		for(int i=1;i<=v;i++) {
			if(tree[i].left != 0) tree[tree[i].left].parent = i;
			if(tree[i].right!= 0) tree[tree[i].right].parent = i;
		}
	}
}

class Tree{
	int left,right,parent;
	Tree(int left,int right,int parent){
		this.left = left;
		this.right = right;
		this.parent = parent;
	}
}*/