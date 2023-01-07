package java;

class Person4 {
	String name;
	int age;
	
	public Person4() {
		this.name = "";
		this.age = 0;
	}
	
	public void talk() {
		System.out.println("Name : "+name+", Age "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 p = new Person4();
		p.name = "Anurag";
		p.age = 19;
		p.talk();
	}

}
