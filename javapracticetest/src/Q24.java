package java;

class Student {
	
	String name;
	int roll;
	
	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}



	public int getRoll() {
		return roll;
	}



	public static void main(String[] args) {
		Student s = new Student("Anurag Jain", 14);
		System.out.println("Name : "+s.getName()+", Roll : "+s.getRoll());
	}

}
