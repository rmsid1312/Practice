/*
import java.util.Scanner;
class ¾È³ç {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int a[] = new int[26];
			String s = sc.next();
			for(int i=0;i<s.length();i++) {
				a[s.charAt(i)-97]++;
			}
			//4,7,11,14
			int cnt = Math.min(a[4], Math.min(a[7], a[14]));
			if(2*cnt >= a[11]) {
				Answer = a[11]/2;
			}else {
				Answer = cnt;
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}*/