package study;
import java.util.*;
/*
public class SWEA_2112 {
	static int Answer=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,n,m,k;
		int x,y,cnt,direction;
		t=sc.nextInt();
		for(int tc=1;tc<=t;tc++) {
			n=sc.nextInt(); m=sc.nextInt(); k=sc.nextInt();
			ArrayList<ArrayList<ArrayList<Bug>>> al = new ArrayList<>();
			for(int i=0;i<n;i++) {
				al.add(new ArrayList<>());
				for(int j=0;j<n;j++) {
					al.get(i).add(new ArrayList<Bug>());
				}
			}//초기화
			for(int i=0;i<k;i++) {
				x=sc.nextInt();y=sc.nextInt();cnt=sc.nextInt();direction=sc.nextInt();
				al.get(x).get(y).add(new Bug(cnt,direction,false));
			}//값 읽어보고
			
			for(int z=0;z<m;z++) {//m번만큼 돌고
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(al.get(i).get(j).size() == 0 ) continue;
						Bug cur = al.get(i).get(j).get(0);
						if(cur.flag == false) {
							al.get(i).get(j).remove(0);	
							if(cur.d == 1) {
								if(i-1 == 0) {
									al.get(i-1).get(j).add(new Bug(cur.count/2,2,true));
								}else {
									al.get(i-1).get(j).add(new Bug(cur.count,1,true));
								}
							}else if(cur.d==2) {
								if(i+1==n-1) {
									 al.get(i+1).get(j).add(new Bug(cur.count/2,1,true));
								}else {
									 al.get(i+1).get(j).add(new Bug(cur.count,2,true));
								}
							}else if(cur.d==3) {
								if(j-1 == 0) {
									 al.get(i).get(j-1).add(new Bug(cur.count/2, 4,true));
								}else {
									 al.get(i).get(j-1).add(new Bug(cur.count,3,true));
								}
							}else {
								if(j+1==n-1) {
									al.get(i).get(j+1).add(new Bug(cur.count/2,3,true));
								}else {
									 al.get(i).get(j+1).add(new Bug(cur.count,4,true));
								}
							}	
						}
					}
				}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(al.get(i).get(j).size() > 1){
							int max_count=-1,max_direction=0,sum=0;
							for(int a=al.get(i).get(j).size()-1;a>=0;a--) {
								Bug cur = al.get(i).get(j).get(a);
								al.get(i).get(j).remove(a);
								sum+= cur.count;
								if(max_count<cur.count) {
									max_count = cur.count;
									max_direction = cur.d;
								}
							}
							al.get(i).get(j).add(new Bug(sum,max_direction,false));
						}
					}
				}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(al.get(i).get(j).size() == 1) {
							al.get(i).get(j).get(0).flag = false;
						}
					}
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(al.get(i).get(j).size() != 0) {
						Answer+=al.get(i).get(j).get(0).count;
					}
				}
			}
			System.out.println("#"+tc+" "+Answer);
			Answer=0;
		}
	}
}

class Bug{
	int count,d;
	boolean flag;
	Bug(int count,int d,boolean flag){
		this.count = count;
		this.d = d;
		this.flag = flag;
	}
}
*/