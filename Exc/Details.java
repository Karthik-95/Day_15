package Exc;

public class Details {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Details(String name,int age) {
		this.age=age;
		this.name=name;
	}

}
