package javapracticetest;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Anurag Jain";
		char[] c = new char[12];
		int fromindex = 3;
		int toindex = 5;
		int x= toindex-fromindex;
		str.getChars(fromindex, toindex, c, 0);
		for(int i=0;i<x;i++) {
			System.out.print(c[i]);
		}
	}

}
