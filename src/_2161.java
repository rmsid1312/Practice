import java.util.*;
/*
public class _2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Queue<Integer> input = new LinkedList<Integer>();
		Queue<Integer> trash = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) input.add(i);
		for(;;) {
			if(input.size() == 1) break;
			trash.add(input.poll());
			int go = input.poll();
			input.add(go);
		}
		int Size = trash.size();
		for(int i=0;i<Size;i++) {
			System.out.print(trash.poll() + " ");
		}
		System.out.print(input.poll());
	}
}
*/