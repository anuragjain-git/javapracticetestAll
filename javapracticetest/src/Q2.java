package javapracticetest;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter total number of value to enter : ");
		int t = sc.nextInt();
		int arr[]=new int[t];
		System.out.print("Enter Values : ");
		for(int i=0;i<t;i++) {
			arr[i]=sc.nextInt();
		}
		
		int x=0;
		
		for(int i=0;i<t;i++) {
			for(int j=1;j<t-i;j++) {
				if(arr[j-1]>arr[j]) {
					x=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=x;
				}
			}
		}
		System.out.println("Sorted value is "+Arrays.toString(arr));
	}

}
