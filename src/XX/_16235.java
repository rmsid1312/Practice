package XX;
import java.util.*;

public class _16235 {
	static int Answer=0;
	static int n,m,k;
	static ArrayList<ArrayList<ArrayList<Integer>>> map = new ArrayList<>();
	static int death[][];//죽었는지체크
	static int energy[][][];//양분
	static int dir[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int x,y,age;
		n = sc.nextInt(); m=sc.nextInt(); k=sc.nextInt();
		death = new int[n+1][n+1];
		energy = new int[n+1][n+1][2]; //0은 현재상황의에너지 1은 추가되는 에너지 양(고정값)
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				death[i][j] = 0;
				energy[i][j][0] = 5;
				energy[i][j][1] = sc.nextInt();
			}
		}
		for(int i=0;i<=n;i++) {
			map.add(new ArrayList<>());
			for(int j=0;j<=n;j++) {
				map.get(i).add(new ArrayList<Integer>());
			}
		}
		for(int i=0;i<m;i++) {
			x=sc.nextInt(); y=sc.nextInt(); age=sc.nextInt();
			map.get(y).get(x).add(age);
		}
 		for(int z=0;z<k;z++) {//k번
			//봄
 			Sort(map);
 			for(int i=1;i<=n;i++) {
 				for(int j=1;j<=n;j++) {
 					int Size = map.get(i).get(j).size();
 					for(int k=0;k<Size;k++) {
 						if(energy[i][j][0] < map.get(i).get(j).get(k)) {
 							death[i][j] += (map.get(i).get(j).get(k))/2;
 	 						map.get(i).get(j).remove(k);
 	 						k--;Size--;
 						}else {
 						energy[i][j][0] -= map.get(i).get(j).get(k);
 						map.get(i).get(j).set(k, (map.get(i).get(j).get(k))+1);
 						}
 					}
 				}
 			}
 			//여름
 			for(int i=1;i<=n;i++) {
 				for(int j=1;j<=n;j++) {
 					energy[i][j][0] += death[i][j];
 					death[i][j]=0;
 				}
 			}
 			//가을
 				for(int i=1;i<=n;i++) {
 					for(int j=1;j<=n;j++) {
 						int Size = map.get(i).get(j).size();
 						for(int k=0;k<Size;k++) {
 							if(map.get(i).get(j).get(k) % 5 == 0) {
 								for(int direction=0;direction<8;direction++) {
 	 								int nx = i+dir[direction][0]; int ny = j+dir[direction][1];
 	 								if(nx>=1 && nx<=n && ny>=1 && ny<=n) {
 	 									map.get(nx).get(ny).add(1);
 	 								} 								
 	 							}
 							}
 						}
 					}
 				}
 			
 				
 				
 				
 			//겨울
 			for(int i=1;i<=n;i++) {
 				for(int j=1;j<=n;j++) {
 					energy[i][j][0] += energy[i][j][1];
 				}
 			}
		}

 		for(int i=1;i<=n;i++) {
 			for(int j=1;j<=n;j++) {
 				Answer += map.get(i).get(j).size();
 			}
 		}
 		System.out.println(Answer);
	}
	public static void Sort(ArrayList<ArrayList<ArrayList<Integer>>> tmp) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				Collections.sort(tmp.get(i).get(j),new MyComp());
			}
		}
	}
}

class MyComp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1>o2) {
			return 1;
		}else {
			return -1;
		}
	}

	
}