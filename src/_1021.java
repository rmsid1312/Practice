import java.util.*;
/*
public class _1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,Size,Answer=0,cnt=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		n = sc.nextInt(); m = sc.nextInt();
		for(int i=0;i<m;i++) {
			al.add(sc.nextInt());
		}
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		Size = al.size();
		while(Size>0) {
			if(q.peek() == al.get(0)) {
				al.remove(0);
				q.poll();
				Size--;
			}else {
				cnt=0;
				Iterator<Integer> iter = q.iterator();
				while(iter.hasNext()) {//�̾ƾ� �ϴ� ���� �������� ������ū�� �������� ū�� ���ϴ� ����
					if(iter.next() == al.get(0)) {
						break;
					}
					cnt++;
				}//�������ι��� ���������� ����
				if(cnt <= q.size()-cnt-1) {//�������� �б� �翷�� �������� �������� �о������
					for(int i=0;i<cnt;i++) {
						int x = q.poll();
						q.add(x);
						Answer++;
					}
				}else {//���������� �б�
					for(int i=0;i<cnt;i++) {
						int x = q.poll();
						q.add(x);
					}
					Answer = Answer + (q.size()-cnt);
				}
			}
		}
		System.out.println(Answer);
	}
}
*/