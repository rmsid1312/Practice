import java.util.Arrays;
import java.util.Scanner;
/*
class 부분배열2{
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer=Integer.MAX_VALUE;
			int n = sc.nextInt(); int s = sc.nextInt();
			int map[] = new int[n];
			long sum = 0;
			int start=0,end=0;
			for(int i=0;i<n;i++) {
				map[i] = sc.nextInt();
			}
			while(start<=end&&start<n) {
				if(sum >= s) {
					Answer = Math.min(Answer, (end-start));
					sum -= map[start];
					start++;
				}else if(end<n){
					sum += map[end];
					end++;
				}else {
					break;
				}
			}
			System.out.println("#testcase"+(test_case+1));
			if(Answer != Integer.MAX_VALUE) {
				System.out.println(Answer);
			}else {
				System.out.println("0");
			}
		}
	}
}*/