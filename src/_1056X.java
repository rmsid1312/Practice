import java.util.*;
/*
public class _1056 {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1,0));
		while(!q.isEmpty()) {
			Point cur = q.poll();
			if(cur.x == n) {
				System.out.println(cur.count);
				break;
			}
			if(cur.x <= n) {
				q.add(new Point(cur.x+1,cur.count+1));
				if(cur.x > 1) {
					q.add(new Point(cur.x-1,cur.count-1));
					for(int i=1;;i++) {
						long x = (long) Math.pow(cur.x, i);
						if(x > n) break;
						if(x <= n) {
							q.add(new Point(x,cur.count+1));
						}
					}
				}
			}
		}
	}
}

class Point{
	long x,count;
	Point(long x,long count){
		this.x = x;
		this.count = count;
	}
}
*/