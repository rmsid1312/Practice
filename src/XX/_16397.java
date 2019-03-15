package XX;
import java.util.*;
/*
public class _16397 {
	static int Answer=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String n,t,g;
		n=sc.next(); t=sc.next(); g=sc.next();
		boolean check[] = new boolean[100001];
		Arrays.fill(check, false);
		Queue<Go> q = new LinkedList<Go>();
		q.add(new Go(n,0));
		check[Integer.parseInt(n)] = true;
		int count = Integer.parseInt(t);
		while(!q.isEmpty()) {
				Go cur = q.poll();
				//1
//				System.out.println(cur.s + " " + cur.cnt);
				if(cur.s.equals(g)) {
					Answer = Math.min(Answer, cur.cnt);
					break;
				}
				
				int one = Integer.parseInt(cur.s);
				if(check[one+1] == false) {
					q.add(new Go(String.valueOf(one+1),cur.cnt+1));
					check[one+1] = true;
				}
				//2
				int two = one*2;
				if(two > 99999) {
					Answer = Integer.MAX_VALUE;
					break;
				}
				String tt = String.valueOf(two);
				if(tt.charAt(0) == 1) {
					char[] c = tt.toCharArray();
					String input = "";
					for(int i=1;i<tt.length();i++) {
						input += c[i];
					}
					if(check[Integer.parseInt(input)] == false) {
						q.add(new Go(String.valueOf(input),cur.cnt+1));
						check[Integer.parseInt(input)] = true;
					}
				}else {
					int len = String.valueOf(two).length()-1;
					int mul = (int)Math.pow(10, len);
					two -= mul;
					if(two < 0) continue;
					if(check[two] == false) {
						q.add(new Go(String.valueOf(two),cur.cnt+1));
						check[two] = true;
					}
				}
		}
		if(Answer == Integer.MAX_VALUE || count < Answer) {
			System.out.println("ANG");
		}else {
			System.out.println(Answer);
		}
	}
}

class Go{
	String s;
	int cnt;
	Go(String s,int cnt){
		this.s = s;
		this.cnt = cnt;
	}
}
*/