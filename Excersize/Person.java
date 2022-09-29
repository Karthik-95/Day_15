package Excersize;

public class Person implements Comparable<Person> {
	String name;
	int age;
	public Person (String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Name = "+name+"	Age = "+age;
	}
	public int compareTo(Person a) {
		if (age==a.age) {
			return 0;
		}
		else if(age>a.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
