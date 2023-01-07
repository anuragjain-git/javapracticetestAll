package javapracticetest;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Amount : ");
		int amount = sc.nextInt();
		int z=amount;
		int curr[]= {1,2,5,10,50,20,100,200,500,2000};
		int count=0;
		for(int i = curr.length-1;i>=0;i--) {
			if(z==0) {
				break;
			}
			while(amount/curr[i]>=1) {
				System.out.println(curr[i]+" : "+amount/curr[i]);
				count+=amount/curr[i];
				amount = amount%curr[i];
			}
		}
		System.out.println("total number of currency needed "+count);
	}

}
