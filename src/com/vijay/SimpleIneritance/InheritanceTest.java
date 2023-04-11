package com.vijay.SimpleIneritance;

public class InheritanceTest {

	
	public static void main(String[] args) {

		DerivedClass d = new DerivedClass();
		d.m1();
		d.m2();	
	}

}
 class BaseClass{
	void m1(){
		System.out.println("Features of A");
		System.out.println("Features of B");
	}
}
 class DerivedClass extends BaseClass{
	void m2(){
		System.out.println("Features of C");
	}
}