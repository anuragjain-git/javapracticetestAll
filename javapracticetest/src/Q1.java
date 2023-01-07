package javapracticetest;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter total subjects : ");
		int s=sc.nextInt();
//		System.out.print("Enter total marks : ");
//		int s=sc.nextInt();
		int arr[]=new int[s];
		int j=0;
		System.out.print("Enter Marks : ");
		for(int i=0;i<s;i++) {
			int x = i;
			arr[i]=sc.nextInt();
			j+=arr[x];
		}
		System.out.println((j/s)+"%");
	}

}
