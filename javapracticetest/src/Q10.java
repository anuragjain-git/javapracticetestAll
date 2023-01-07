package java;

class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("Name : "+name+", Age "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Raju = new Person("Raju", 19);
		Raju.talk();
	}

}
