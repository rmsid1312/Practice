import java.util.*;
/*
public class _14891 {
	static int arr[][];
	static boolean check[];
	static int direc[];
	static Deque<Integer> dq[] = new ArrayDeque[4];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k,number,direction,res=0;
		String input;
		check = new boolean[4];
		direc = new int[4];
		arr=new int[4][8];
		for(int i=0;i<4;i++) {
			dq[i] = new ArrayDeque<Integer>();
		}
		for(int i=0;i<4;i++) {
			input=sc.next();
			for(int j=0;j<8;j++) {
				dq[i].add(input.charAt(j)-'0');
			}
		}
		Update_Reset();
		k=sc.nextInt();
		for(int z=0;z<k;z++) {
			number=sc.nextInt(); direction=sc.nextInt();
			number-=1;
			dfs(2,6,number,direction);
			Move();
			Update_Reset();
			//
		}
//		 N±ØÀº 0, S±ØÀº 1
		int mul=1;
		for(int i=0;i<4;i++) {
			if(arr[i][0] == 1) {
				res+= mul;
			}
			mul *= 2;
		}
		//Print();
		System.out.println(res);
	}
	public static void Print() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Update_Reset() {
		for(int i=0;i<4;i++) {
			Object ia[] = dq[i].toArray();
			for(int j=0;j<8;j++) {
				arr[i][j] = (int) ia[j];
			}
		}
		Arrays.fill(check, false);
		Arrays.fill(direc, 0);
	}
	public static void Move() {
		for(int i=0;i<4;i++) {
			if(check[i] == true) {
				if(direc[i] == 1) {
					int tmp = dq[i].pollLast();
					dq[i].addFirst(tmp);
				}else {
					int tmp = dq[i].pollFirst();
					dq[i].addLast(tmp);
				}
			}
		}
	}
	public static void dfs(int from,int to,int number,int direction) {
		if(number>=0 && number<4) {
			check[number] = true;
			direc[number] = direction;
			if(number+1 < 4) {
				if(arr[number][from] != arr[number+1][to] && check[number+1] == false) { 
					dfs(from,to,number+1,-direction);
				}
			}
			if(number-1 >= 0) {
				if(arr[number-1][from] != arr[number][to] && check[number-1] == false) {
					dfs(from,to,number-1,-direction);
				}
			}
		}
	}
}
*/