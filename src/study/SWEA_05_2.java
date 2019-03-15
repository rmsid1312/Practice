package study;
import java.util.*;
/*
public class SWEA_05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int a=1;a<=t;a++) {
			int k=sc.nextInt();
			String s = sc.next();
			String temp = "";
			ArrayList<String> al = new ArrayList<String>();
			boolean flag = false;
			for(int z=0;z<s.length();z++) {
				for(int i=0;i<s.length()-z;i++) {
					for(int j=i;j<=i+z;j++) {
						if(z==s.length()-1) {
							al.add(s);
							flag = true;
							break;
						}
						temp+=s.charAt(j);
					}
					if(flag == true) break;
					al.add(temp);
					temp="";
				}
			}
			
			Collections.sort(al);
			
			for(int i=0;i<al.size()-1;i++) {
				if(al.get(i).equals(al.get(i+1))) {
					al.remove(al.get(i+1));\
					i--;
				}
			}
			if(k>al.size()) {
				System.out.println("#"+a+" none");
			}else {
				System.out.println("#"+a+" "+al.get(k-1));	
			}
		}
	}
}
*/
/*
 * 
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
			}*/
