
import java.util.Arrays;
import java.util.Scanner;
/*
class 부분배열{
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer=Integer.MAX_VALUE;
			int n = sc.nextInt(); int s = sc.nextInt();
			int d[] = new int[n];
			int map[] = new int[n];
			int len = 1;
			int go;
			for(int i=0;i<n;i++) {
				map[i] = sc.nextInt();
			}
			//앞
			d[0] = map[0];
			for(go=1;go<n;go++) {
				d[go] = d[go-1] + map[go];
				len++;
				if(d[go] >= s) {
					Answer = Math.min(Answer, len);
					d[go-1] = d[go] = len = 0;
					go -= 1;
					
				}
			}
			//뒤
			
			d[n-1] = map[n-1];
			for(go=n-2;go>=0;go--) {
				d[go] = d[go+1] + map[go];
				len++;
				if(d[go] >= s) {
					Answer = Math.min(Answer, len);
					d[go+1] = d[go] = len = 0;
					go += 1;
				}
			}
			
			System.out.println("#testcase"+(test_case+1));
			if(Answer==Integer.MAX_VALUE) {
				System.out.println("0");
			}else {
			System.out.println(Answer);
			}

		}
	}
}*/