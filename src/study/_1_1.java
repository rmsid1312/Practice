package study;
import java.util.*;
/*
public class _1_1 {
	static int n,m,t;
	static int Answer=0;
	static char map[][];
	static String zero = "0001101";
	static String one = "0011001";
	static String two = "0010011";
	static String three = "0111101";
	static String four = "0100011";
	static String five = "0110001";
	static String six = "0101111";
	static String seven = "0111011";
	static String eight = "0110111";
	static String nine = "0001011";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		
		for(int test_case=0;test_case<t;test_case++) {
			int sum=0,cnt=1;
			int start_index_i = Integer.MAX_VALUE;
			int start_index_j=Integer.MAX_VALUE;
			n=sc.nextInt(); m=sc.nextInt();
			map = new char[n][m];
			for(int i=0;i<n;i++) {
				String input = sc.next();
				for(int j=0;j<m;j++) {
					map[i][j]= input.charAt(j);
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=m-1;j>=0;j--) {
					if(map[i][j] == '1') {
						start_index_i = i;
						start_index_j = j-55;
						break;
					}
				}
				if(start_index_j != Integer.MAX_VALUE) break;
			}
			while(cnt!=8+1) {
				int num=-1;
				String tmp ="";
				for(int i=0;i<7;i++) {
					tmp += map[start_index_i][start_index_j+i];
				}
				if(tmp.equals(zero)) {
					num=0;
					Answer+=0;
				}else if(tmp.equals(one)) {
					Answer += 1;
					num=1;
				}else if(tmp.equals(two)) {
					Answer += 2;
					num=2;
				}else if(tmp.equals(three)) {
					Answer += 3;
					num=3;
				}else if(tmp.equals(four)) {
					Answer += 4;
					num=4;
				}else if(tmp.equals(five)) {
					Answer += 5;
					num=5;
				}else if(tmp.equals(six)) {
					Answer += 6;
					num=6;
				}else if(tmp.equals(seven)) {
					Answer += 7;
					num=7;
				}else if(tmp.equals(eight)) {
					Answer += 8;
					num=8;
				}else {
					Answer += 9;
					num=9;
				}
				if(cnt%2==1) {
					sum += num*3;
				}else {
					sum += num;
				}
				cnt++;
				start_index_j+=7;
			}
			if(sum%10==0) {
				System.out.println("#"+(test_case+1)+" "+Answer);
			}else {
				System.out.println("#"+(test_case+1)+" "+0);
			}
			Answer=0;sum=0;cnt=1;
		}
	}
}
*/