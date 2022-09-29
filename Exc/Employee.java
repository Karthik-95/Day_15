package Exc;

public class Employee implements Comparable<Employee> {
	private String name;
	private int emp_id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int emp_id, int age) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.age = age;
	}
	public int compareTo(Employee emp) {
		return name.compareTo(getName());
	}
	public String toString() {
		return "NAME="+name+"\nEMPLOYEE ID="+emp_id+"\nAGE="+age+"\n";
	}
	

}
