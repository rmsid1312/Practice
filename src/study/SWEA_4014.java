package study;
import java.util.*;
/*
public class SWEA_4014 {
	//y,x순
	static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};//상 우 하 좌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int m,a,Answer=0;
			m=sc.nextInt();a=sc.nextInt();
			int direction,nx,ny;
			int A_route[][] = new int[m+1][2]; //[m][0]은 이동경로, [m][1]은 배터리량
			int B_route[][] = new int[m+1][2];
			int check_route[] = new int[m+1];
			AP Aps[] = new AP[a];
			Point A = new Point(1,1),B=new Point(10,10);
			for(int i=0;i<m;i++) {
				A_route[i+1][0] = sc.nextInt();
				A_route[i][1] = 0;
				check_route[i] = -1;
			}
			for(int i=0;i<m;i++) {
				B_route[i+1][0] = sc.nextInt();
				B_route[i][1] = 0;
			}
			for(int i=0;i<a;i++) {
				int y=sc.nextInt(); int x=sc.nextInt(); int c=sc.nextInt(); int power = sc.nextInt();
				Aps[i] = new AP(y,x,c,power);
			}
			for(int i=0;i<=m;i++) {
				int x = A.x; int y=A.y;
				direction = A_route[i][0];
				if(direction==1) {
					nx = A.x-1;  ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						A_Checking(A_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==2) {
					nx = A.x;  ny=A.y+1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						A_Checking(A_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==3) {
					 nx = A.x+1;  ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						A_Checking(A_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==4){
					 nx = A.x;  ny=A.y-1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						A_Checking(A_route,check_route,Aps,i,nx,ny);
					}
				}else {
					nx = A.x; ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						A_Checking(A_route,check_route,Aps,i,nx,ny);
					}
				}
			}
			for(int i=0;i<=m;i++) {
				int x = B.x; int y=B.y;
				direction = B_route[i][0];
				if(direction==1) {
					nx = B.x-1;  ny=B.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						B.x=nx; B.y=ny;
						B_Checking(A_route,B_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==2) {
					nx = B.x;  ny= B.y+1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						B.x=nx; B.y=ny;
						B_Checking(A_route,B_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==3) {
					 nx = B.x+1;  ny= B.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						B.x=nx; B.y=ny;
						B_Checking(A_route,B_route,check_route,Aps,i,nx,ny);
					}
				}else if(direction==4){
					 nx = B.x;  ny= B.y-1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						B.x=nx; B.y=ny;
						B_Checking(A_route,B_route,check_route,Aps,i,nx,ny);
					}
				}else {
					nx = B.x; ny=B.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						B.x=nx; B.y=ny;
						B_Checking(A_route,B_route,check_route,Aps,i,nx,ny);
					}
				}
			}
			for(int i=0;i<=m;i++) {
				if(A_route[i][1]==Integer.MAX_VALUE)continue;
				Answer += A_route[i][1];
			}
			for(int i=0;i<=m;i++) {
				if(B_route[i][1]==-1)continue;
				Answer += B_route[i][1];
			}
//			for(int i=0;i<=m;i++) {
//				System.out.print(A_route[i][1]+" ");
//			}
//			System.out.println();
//			for(int i=0;i<=m;i++) {
//				System.out.print(B_route[i][1]+" ");
//			}
			System.out.println(Answer);
		}
	}
	public static void A_Checking(int[][] A_route,int check_route[],AP Aps[],int time,int nx,int ny) {
		int max=Integer.MAX_VALUE; int index=-1;
		for(int i=0;i<Aps.length;i++) {
			int d = Math.abs(Aps[i].x-nx)+Math.abs(Aps[i].y-ny);
			if(d<=Aps[i].c) {
				/*
				if(check_route[time] == -1 ) {
				A_route[time][1] = Aps[i].power;
				check_route[time] = i;
				}else {
					if(A_route[time][1]/2 < Aps[i].power) {
						A_route[time][1] = Aps[i].power;
						check_route[time] = i;
					}	
				}
				*/
/*
				if(max > Aps[i].power) {
					max = Aps[i].power;
					index = i;
				}
			}
		}
		A_route[time][1] = max;
		check_route[time] = index;
	}
	
	public static void B_Checking(int[][] A_route,int[][] B_route,int check_route[],AP Aps[],int time,int nx,int ny) {
		boolean flag=false;
		int max=-1; int index=-1;
		int cmp_max=-1;int cmp_index=-1;
		for(int i=0;i<Aps.length;i++) {
			int d = Math.abs(Aps[i].x-nx)+Math.abs(Aps[i].y-ny);
			if(d<=Aps[i].c) {
				if(max < Aps[i].power) {
					max = Aps[i].power;
					index = i;
				}
			}
		}
		if(check_route[time] == index) {
			for(int j=0;j<Aps.length;j++) {
				if(index==j) continue;
				int dd = Math.abs(Aps[j].x-nx) + Math.abs(Aps[j].y-ny);
				if(dd<=Aps[j].c) {
					if(cmp_max < Aps[j].power) {
						cmp_max = Aps[j].power;
						cmp_index = j;
					}
				}
			}
			B_route[time][1] = cmp_max;
		}else {
			B_route[time][1] = max;
		}
	}
}
class Point{
	int y,x;
	Point(int y,int x){
		this.y =y;
		this.x =x;
	}
}
class AP{
	int y,x,c,power;
	AP(int y,int x,int c,int power){
		this.y = y;
		this.x = x;
		this.c = c;
		this.power = power;
	}
}*/