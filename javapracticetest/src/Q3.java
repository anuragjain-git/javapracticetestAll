package javapracticetest;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int x=3,y=2,z=3;
		int arr [][][] = new int[x][y][z];
		for(int i=0;i<x;i++) {
			for(int j=0;i<y;j++) {
				System.out.print("For department "+(i+1)+" Enter Marks of student "+(j+1)+" : ");
				int sum=0;
				for(int k=0;k<z;k++) {
					arr[i][j][k]=sc.nextInt();
					sum+=arr[i][j][k];
				}
				System.out.println("For department "+(i+1)+" Total Marks of student "+(j+1)+" : "+sum);
			}
		}
	}

}
