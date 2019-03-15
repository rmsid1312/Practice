package XX;
import java.util.*;
//최적화,다시생각
/*
public class _9466 {
	static int Answer=0;
	static int Make_Team[];
	static int map[];
	static boolean check[];
	static boolean checking[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int t=0;t<test_case;t++) {
			int n = sc.nextInt();
			map = new int[n+1];
			Make_Team = new int[n+1];
			check = new boolean[n+1];
			checking = new boolean[n+1];
			for(int i=1;i<=n;i++) {
				map[i] = sc.nextInt();
			}
			for(int i=1;i<=n;i++) {
				if(checking[map[i]] == true) {
					continue;
				}
				checking[i] = true;
				Team_Check(i,n);
//				for(int j=1;j<=n;j++) System.out.print(Make_Team[j]);
//				System.out.println();
//				for(int j=1;j<=n;j++) System.out.print(check[j]+" ");
//				System.out.println();
			}
			for(int i=1;i<=n;i++) {
				if(Make_Team[i] == 0)Answer++;
			}
			System.out.println(Answer);
			Answer=0;
		}
	}
	public static void Team_Check(int start,int n) {
		if(Make_Team[start] == -1) return;
		if(start == map[start]) {
			checking[start] = true;
			Make_Team[start] = -1;
			return;
		}
		if(check[map[start]] ==true) {
			for(int i=1;i<=n;i++) {
				if(check[i] == true) {Make_Team[i] = -1; checking[i] = check[i];}
			}
			return;
		}
		checking[map[start]] = true;
		check[map[start]] = true;
		Team_Check(map[start],n);
		check[map[start]] = false;
	}
}*/