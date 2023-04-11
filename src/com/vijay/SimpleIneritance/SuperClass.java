package com.vijay.SimpleIneritance;

public class SuperClass {
	public void superMethod(){
		System.out.println("This is super class method...");
	}
}
 class SubClass extends SuperClass{
	public void subMethod(){
		System.out.println("This is subclass method....");
	}
}
class TestSuper{
	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.superMethod();
		s.subMethod();
	}
}