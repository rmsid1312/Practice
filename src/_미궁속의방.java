import java.util.*;
/*
public class _�̱ü��ǹ� {
	static int Answer;
	public static void main(String[] args) {
		int T;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int n = sc.nextInt(); int k = sc.nextInt();
			int map[][] = new int[n+1][n+1];
				String s = sc.next();
			fill_arrays(map,n);
			Answer = 1;
		}
	}
	public static void fill_arrays(int map[][],int n) {
		int start = 2;
		int go = 1;
		int i=1,j=1;
		//�� ä���
		for(int k=0;k<n;k++) {
				if(k%2==0) {
					for(int w=0;w<start-1;w++) {
						map[i][j] = go;
						go++;
						if(i==1) {
							j++;
							start++;
							break;
						}
						i--;j++;
					}
				}else {
					for(int w=0;w<start-1;w++) {
						map[i][j] = go;
						go++;
						if(j==1) {
							i++;
							start++;
							break;
						}
						i++;j--;
					}
				}
		}
		//������ ä���
		i=j=n;
		start = 2;
		go = n*n;
		for(int k=0;k<n-1;k++) {
			if(k%2==0) {
				for(int w=0;w<start-1;w++) {
					map[i][j] = go;
					go--;
					if(i==n) {
						j--;
						start++;
						break;
					}
					i++;j--;
				}
			}else {
				for(int w=0;w<start-1;w++) {
					map[i][j] = go;
					go--;
					if(j==n) {
						i--;
						start++;
						break;
					}
					i--;j++;
				}
			}
		}
	}
}
*/