import java.util.*;
/*
public class _1100 {
	static int Answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char map[][] = new char[8][8];
		for(int i=0;i<8;i++) {
			String s = sc.next();
			for(int j=0;j<8;j++) {
				map[i][j] = s.charAt(j);
			}
		}
		Answer=0;
		for(int i=0;i<8;i++) {
			if(i%2==0) {
				for(int j=0;j<8;j+=2) {	
					if(map[i][j] == 'F') {
						Answer++;
					}
				}
			}
			else {
				for(int j=1;j<8;j+=2) {
					if(map[i][j] == 'F') {
						Answer++;
					}
				}
			}
		}
		System.out.println(Answer);
	}
}
*/