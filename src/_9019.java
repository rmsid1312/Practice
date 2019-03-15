import java.util.*;
/*
public class _9019 {
	static String res;
	static int t,a,b;
	static boolean check[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++) {
			check = new boolean[20001];
			Arrays.fill(check, false);
			a = sc.nextInt(); b = sc.nextInt();
			Queue<Num> q = new LinkedList<Num>();
			q.add(new Num(a,""));
			check[a] = true;
			while(!q.isEmpty()) {
				Num cur = q.poll();
				if(cur.value == b) {
					res = cur.result;
					break;
				}
					for(int k=0;k<4;k++) {
						if(k==0) {
							int x = cur.value*2;
							if(x>9999) x %= 10000;
							if(check[x] == false) {
								q.add(new Num(x,cur.result+"D"));
								check[x] = true;
							}
						}
						else if(k==1) {
							int x = cur.value-1;
							if(x==-1) x = 9999;
							if(check[x]==false) {
								q.add(new Num(x,cur.result+"S"));
								check[x] = true;
							}
						}
						else if(k==2) {
							int x = (cur.value%1000)*10 + cur.value/1000;
							if(check[x] == false) {
								q.add(new Num(x,cur.result+"L"));
								check[x] = true;
							}
						}
						else {
							int x = (cur.value%10)*1000 + cur.value/10;
							if(check[x] == false) {
								q.add(new Num(x,cur.result+"R"));
								check[x] = true;
							}
						}
					}
				}
			System.out.println(res);
			res = "";
		}
	}
}

class Num{
	int value;
	String result;
	Num(int value,String result){
		this.value = value;
		this.result = result;
	}
}*/