package javapracticetest;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = "I am Anurag Jain".split(" ");
		String search = "Anurag";
		int c=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(search)){
				System.out.println(search + " is present at "+(i+1)+" position." );
				c++;
			}
		}
		if (c==0) {
			System.out.println(search+" not found.");
		}
	}

}
