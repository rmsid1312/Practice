package XX;
import java.util.*;
/*
public class SWEA_5658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int n=sc.nextInt(); int k=sc.nextInt();
			ArrayList<String> al = new ArrayList<String>();
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			String s = sc.next();
			char c[] = s.toCharArray();
			char tmp[] = new char[c.length];
			Input(al,c,n);
			for(int i=0;i<n/4;i++) {
				Move(c);
				Input(al,c,n);
			}
			Trans(al,al2,n);
			Collections.sort(al2, new MyComp());
			System.out.println("#"+t+" "+al2.get(k-1));
		}
	}
	public static void Trans(ArrayList<String> al,ArrayList<Integer> al2,int n) {
		for(int i=0;i<al.size();i++) {
			String s = al.get(i);
			int input = 0;
			int mul = (int) Math.pow(16, (n/4)-1);
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)-'A'>=0) {//영문자일때
					input += ((s.charAt(j)-'A')+10)*mul;
				}else {//숫자일때
					input += (s.charAt(j)-'0')*mul;
				}
				mul /= 16;
			}
			al2.add(input);
		}
	}
	public static void Input(ArrayList<String> al,char c[],int n) {
		String tmpp = "";
		for(int i=0;i<c.length;i++) {
			tmpp += c[i];
			if((i+1) % (n/4) == 0) {
				if(al.contains(tmpp)) {
					tmpp = "";
					continue;
				}
				al.add(tmpp);
				tmpp = "";
			}
		}
	}
	public static void Move(char c[]) {
		char move[] = new char[c.length];
		for(int i=0;i<c.length;i++) {
			move[i] = c[i];
		}
		char tmp = c[c.length-1];
		for(int i=0;i<c.length-1;i++) {
			c[i+1]=move[i];
		}
		c[0] = tmp; 
	}
}
class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0 > arg1) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
*/