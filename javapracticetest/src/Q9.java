package java;
import java.util.*;
public class Q9 {
	
	public static boolean palindrome(String word) {
		int length = word.length();
		for(int i=0;i<length/2;i++) {
			if(word.charAt(i) != word.charAt(length-i-1)) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		for(int i=0;i<str.length;i++) {
			String word = str[i];
			if(palindrome(word)) {
				System.out.println(word+" is palindrome");
			}
		}
		
	}

}
