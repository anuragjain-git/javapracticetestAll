package java;

class Person5 {
	String name;
	int age;
	
	public Person5(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("Name : "+name+", Age "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person5 Raju = new Person5("Raju", 19);
		Raju.talk();
	}

}
