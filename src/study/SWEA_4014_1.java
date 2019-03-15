package study;
import java.util.*;
/*
public class SWEA_4014_1 {
	//y,x순
	static int dir[][] = {{-1,0},{0,1},{1,0},{0,-1}};//상 우 하 좌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int m,a;
			m=sc.nextInt();a=sc.nextInt();
			int a_direction,b_direction,nx,ny;
			int A_route[][] = new int[m+1][2]; //[m][0]은 이동경로, [m][1]은 배터리량
			int B_route[][] = new int[m+1][2];
			int check_route[] = new int[m+1];
			AP Aps[] = new AP[a];
			Point A = new Point(1,1),B=new Point(10,10);
//			A.x=1;A.y=1; B.x=10;B.y=10;
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
				int ax = A.x; int ay=A.y;
				int bx = B.x; int by=B.y;
				a_direction = A_route[i][0];
				if(a_direction==1) {
					nx = A.x-1;  ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						
					}
				}else if(a_direction==2) {
					nx = A.x;  ny=A.y+1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						
					}
				}else if(a_direction==3) {
					 nx = A.x+1;  ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						
					}
				}else if(a_direction==4){
					 nx = A.x;  ny=A.y-1;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						
					}
				}else {
					nx = A.x; ny=A.y;
					if(nx>=1 && nx<=10 && ny>=1 && ny<=10) {
						A.x=nx; A.y=ny;
						
					}
				}
			}
		}
	}
	public static void A_Checking(int[][] A_route,int check_route[],AP Aps[],int time,int nx,int ny) {
		for(int i=0;i<Aps.length;i++) {
			int d = Math.abs(Aps[i].x-nx)+Math.abs(Aps[i].y-ny);
			if(d<=Aps[i].c) {
				if(check_route[time] == -1 ) {
				A_route[time][1] = Aps[i].power;
				check_route[time] = i;
				}else {
					if(A_route[time][1] < Aps[i].power) {
						A_route[time][1] = Aps[i].power;
						check_route[time] = i;
					}	
				}
			}
		}
	}
	public static void B_Checking(int[][] A_route,int[][] B_route,int check_route[],AP Aps[],int time,int nx,int ny) {
		for(int i=0;i<Aps.length;i++) {
			int d = Math.abs(Aps[i].x-nx)+Math.abs(Aps[i].y-ny);
			if(d<=Aps[i].c) {
				if(check_route[time] != i ) {
				B_route[time][1] = Aps[i].power;
				check_route[time] = i;
				}else {
//					if()
				}
			}
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