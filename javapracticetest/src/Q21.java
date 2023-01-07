package java;

class Employee {

	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	String x(){
		return name+" : "+salary;
	}
	
	public static void swap(Employee emp1,Employee emp2) {
		String name = emp1.getName();
		int salary = emp1.getSalary();
		emp1.setName(emp2.getName());
		emp1.setSalary(emp2.getSalary());
		emp2.setName(name);
		emp2.setSalary(salary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("A",5000);
		Employee e2 = new Employee("B",8000);
		System.out.println("Before swap");
		System.out.println(e1);
		System.out.println(e2);
		swap(e1,e2);
		System.out.println("After swap");
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
