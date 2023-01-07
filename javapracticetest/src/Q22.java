package java;
import java.util.*;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total prime no. to generate : ");
		int primenum = sc.nextInt();
		int count = 0;
		int num = 2;
		while(count<=primenum) {
			boolean isprime = true;
			for(int i = 2;i<=num/2;i++) {
				if(num%i==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				count++;
				System.out.println(num);
			}
			num++;
		}
	}

}
