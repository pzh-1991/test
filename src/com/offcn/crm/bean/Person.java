package com.offcn.crm.bean;

public class Person {
	private int pid;
	private String name;
	private boolean gender;
	private int salary;
	private Car car;
	
	
	public Person() {
		System.out.println("ssssssssss");
	}
	public Person(int pid, String name, boolean gender, int salary) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.car=car;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", car=" + car
				+ "]";
	}
	
	
}
