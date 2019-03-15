
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
class ±è¾¾¸¸ {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 1;
			int x,y;
			ArrayList<Point> al = new ArrayList<Point>();
			int n = sc.nextInt(); int m = sc.nextInt();
			int map[] = new int[n+1];
			for(int i=0;i<m;i++) {
				x=sc.nextInt(); y=sc.nextInt();
				al.add(new Point(x,y));
				if(map[x] == 0) map[y] = 1;
				else map[y] = 0;
			}
			for(int i=0;i<al.size();i++) {
				int start = al.get(i).start;
				int end = al.get(i).end;
				if(map[start]==map[end]) {
					Answer=0;
					break;
				}
			}
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}

class Point{
	int start,end;
	Point(int start,int end){
		this.start = start;
		this.end = end;
	}
}*/