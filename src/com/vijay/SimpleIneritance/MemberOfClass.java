package com.vijay.SimpleIneritance;

public class MemberOfClass {
	public static void main(String[] args) {
			B b = new B();
			b.m1();
			//System.out.println("a = "+b.a);
		//	System.out.println(b);
	}

}
class A{
	int a=10;
	static int b=20;
	 
	
	 void m1(){
		 System.out.println("m1 is a instance method");
		 System.out.println(b);
	 }
	 static void m2(){
		 System.out.println("m2 is a static method");
	 }
}
class B extends A{
	void m3(){
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
	}
	
}
