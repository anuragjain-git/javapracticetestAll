package java;

class Person3 {
	
	String name = "";
	int age = 0;
	public Person3() {

	}
	
	public void talk() {
		System.out.println("Name : "+name+", Age "+age);
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person3 p = new Person3();
			p.talk();
	}
}
