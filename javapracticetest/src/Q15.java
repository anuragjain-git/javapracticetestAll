package java;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age<=0) 
			System.out.println("Invalid age");
		else if(age<18)
			System.out.println(name+" is young.");
		else if(age<65)
			System.out.println(name+" is middle-aged.");
		else
			System.out.println(name+" is old.");
	}

}
