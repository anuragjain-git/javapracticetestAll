package javapracticetest;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of the circle : ");
		double radius = sc.nextInt();
		double area = Math.PI*(radius*radius);
		System.out.println(area);
		int x = (int) area;
		double y = area - x;
		int rem;
		int arr[]=new int[7];
		for(int i=6;i>=0;i--) {
			rem = x%10;
			arr[i]=rem;
			x=x/10;
		}
		for(int i=0;i<7;i++) {
			System.out.print(arr[i]);
		}
	}

}
