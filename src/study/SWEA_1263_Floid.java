package study;
import java.util.*;
/*
public class SWEA_1263_Floid {
	static int map[][];
	static boolean check[];
	static int dist[];
	static int Answer[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			int n=sc.nextInt();
			map = new int[n][n];
			check = new boolean[n];
			dist = new int[n];
			Answer = new int[n];
			int min = Integer.MAX_VALUE;
			Arrays.fill(dist, Integer.MAX_VALUE);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j]=sc.nextInt();
					if(map[i][j] == 0) map[i][j] = 9;
				}
			}
			for(int k=0;k<n;k++) {
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(map[i][j] > map[i][k] + map[k][j]) {
							map[i][j] = map[i][k]+map[k][j];
						}
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				int sum=0;
				for(int j=0;j<n;j++) {
					if(i==j) continue;
					sum += map[i][j];
				}
				min = Math.min(sum, min);
			}
			System.out.println("#"+tc+" "+min);
		}
	}
}
*/
/*
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
	System.out.print(map[i][j]);
}
System.out.println();
}
*/