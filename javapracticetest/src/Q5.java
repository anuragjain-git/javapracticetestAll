package javapracticetest;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of first and second array : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = {new int[a] , new int[b]};
		System.out.print("Enter element of first array : ");
		for(int i=0;i<a;i++) {
			arr[0][i]=sc.nextInt();
		}
		System.out.print("Enter element of first array : ");
		for(int j=0;j<b;j++) {
			arr[1][j]=sc.nextInt();
		}
	}

}
