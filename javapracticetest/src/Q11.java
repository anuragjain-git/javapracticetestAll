package java;

class Person1 {
	String name;
	int age;
	
	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("Name : "+name+", Age "+age);
	}
	
	public class Demo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person1 p = new Person1("Anurag", 19);
			p.talk();
		}
	}
}
