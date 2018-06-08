package com.kpit.junit.examples;

public class Employee {
	
	private int empid;
	private String name;
	private double salary;
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
}
