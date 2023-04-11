package com.vijay.SimpleIneritance;

public class Person{
	String name;
	int age;
	String address;
	 Person(String name,int age,String address) {
		this.name="vijay";
		this.age=28;
		this.address="pune";
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("address "+address);
	}
	void show(){
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("address "+address);
	}
	 public static void main(String[] args) {
			Person p = new Person("kunal",10,"pune");
			p.show();
}
}


