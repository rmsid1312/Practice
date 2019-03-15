
import java.util.Scanner;

class ½ºÅ¸¹÷½º {
	static char Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			 Answer = 0;
			 int n,m,k,sum=0;
			 n=sc.nextInt(); m=sc.nextInt(); k=sc.nextInt();
			 int c[] = new int[n+1];
			 int price[] = new int[m+1];
			 for(int i=1;i<=n;i++) {
				 c[i] = sc.nextInt();
			 }
			 for(int i=1;i<=m;i++) {
				 price[i] = sc.nextInt();
			 }
			 for(int i=1;i<c.length;i++) {
				 sum += price[c[i]];
			 }
			 if(sum > k) {
				 Answer = 'N';
			 }else {
				 Answer = 'Y';
			 }
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}