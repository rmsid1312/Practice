package study;
import java.util.*;
/*
public class _2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int Answer = -100;
			int n=sc.nextInt(); int k=sc.nextInt();
			String start = String.valueOf(n);
			Queue<String> q = new LinkedList<String>();
			q.add(start);
			ArrayList<String> al = new ArrayList<String>();
			for(int z=0;z<k;z++) {
				int Size = q.size();
				for(int w=0;w<Size;w++) {
					String tmp = q.poll();
					for(int i=0;i<tmp.length();i++) {
						for(int j=0;j<tmp.length();j++) {
							char[] c= tmp.toCharArray();
							char tt = c[i];
							c[i] = c[j];
							c[j] = tt;
							String ss = new String(c);
							if(al.contains(ss)) continue;
							q.add(new String(ss));
							al.add(new String(ss));
						}
					}
				}
				Size = al.size();
				for(int w=0;w<Size;w++) {
					al.remove(al.size()-1);
				}
			}
			int Size = q.size();
			for(int i=0;i<Size;i++) {
				Answer = Math.max(Answer, Integer.parseInt(q.poll()));
			}
			System.out.println("#"+t+" "+Answer);
		}
	}
}
*/