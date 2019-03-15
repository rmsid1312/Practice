package study;
import java.util.*;
/*
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k,Answer=-1;
		int ttt = sc.nextInt();
		for(int t=1;t<=ttt;t++) {
			n = sc.nextInt(); k = sc.nextInt();
			ArrayList<String> al = new ArrayList<String>();
			al.add(String.valueOf(n));
			for(int test=0;test<k;test++) {
				int Size = al.size();
					for(int z=0;z<Size;z++){
						String cur = al.get(0);
						al.remove(0);
					for(int i=0;i<String.valueOf(n).length()-1;i++) {
						for(int j=i+1;j<String.valueOf(n).length();j++) {
							char c[] = cur.toCharArray();
							char tmp = c[i];
							c[i] = c[j];
							c[j] = tmp;
							String ss = new String(c);
							al.add(ss);
						}
					}
				}
				for(int i=0;i<al.size();i++) {
					for(int j=i+1;j<al.size();j++) {
						if(al.get(i).equals(al.get(j))) {
							al.remove(j);
						}
					}
				}
			}
				for(int i=0;i<al.size();i++) {
					if(Answer < Integer.parseInt(al.get(i))) {
						Answer = Integer.parseInt(al.get(i));
					}
				}
				System.out.println("#"+t+" "+Answer);
				Answer=-1;
			}
		}	
}
*/